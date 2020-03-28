package tk.mybatis.springboot.conf;

import com.alibaba.fastjson.JSONObject;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;

public class RequestJsonHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {
    private static final ThreadLocal<String> JSON_BODY = new ThreadLocal<>();
    private static final ThreadLocal<HttpServletRequest> REQUEST_LOCAL = new ThreadLocal<>();

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.hasParameterAnnotation(RequestPostParam.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        RequestPostParam requestJson = methodParameter.getParameterAnnotation(RequestPostParam.class);
        String paramName = requestJson.value();
        Class clazz = methodParameter.getParameterType();

        HttpServletRequest servletRequest = nativeWebRequest.getNativeRequest(HttpServletRequest.class);

        // 先从URL或form参数中取
        String paramValue = servletRequest.getParameter(paramName);

        if (paramValue != null) {
            if (String.class.equals(clazz)) {
                return paramValue;
            } else if (Long.class.equals(clazz)) {
                return Long.parseLong(paramValue);
            } else if (Integer.class.equals(clazz)) {
                return Integer.parseInt(paramValue);
            } else {
                return JSONObject.parseObject(paramValue, clazz);
            }
        }

        // 从InputStream中获取内容
        paramValue = getRequestBody(nativeWebRequest, paramName);

//        if (StringUtils.isBlank(paramValue)) {
//            return null;
//        }

        JSONObject jsonObject = JSONObject.parseObject(paramValue);

        if (String.class.equals(clazz)) {
            return jsonObject.getString(paramName);
        } else if (Long.class.equals(clazz)) {
            return jsonObject.getLong(paramName);
        } else if (Integer.class.equals(clazz)) {
            return jsonObject.getInteger(paramName);
        } else {
            return jsonObject.getObject(paramName, clazz);
        }
    }

    private String getRequestBody(NativeWebRequest webRequest, String paramName){
        /*String jsonBody;
        HttpServletRequest servletRequest = webRequest.getNativeRequest(HttpServletRequest.class);
        if(servletRequest.equals(REQUEST_LOCAL.get())){
            jsonBody = JSON_BODY.get();
            if(StringUtils.isNotBlank(jsonBody)){
                return jsonBody;
            }
        }

        REQUEST_LOCAL.set(servletRequest);

        jsonBody = (String) webRequest.getAttribute(paramName, NativeWebRequest.SCOPE_REQUEST);
        if (jsonBody == null){
            try {
                jsonBody = IOUtils.toString(servletRequest.getInputStream(), "UTF-8");
                webRequest.setAttribute(paramName, jsonBody, NativeWebRequest.SCOPE_REQUEST);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        JSON_BODY.set(jsonBody);
        return jsonBody;*/
        HttpServletRequest servletRequest = webRequest.getNativeRequest(HttpServletRequest.class);
        return RequestInputStreamJSONUtils.getJsonObject(servletRequest);
    }
}
