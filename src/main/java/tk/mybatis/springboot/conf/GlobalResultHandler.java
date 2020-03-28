package tk.mybatis.springboot.conf;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.lang.reflect.AnnotatedElement;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice(annotations = {RestController.class, Controller.class})
public class GlobalResultHandler implements ResponseBodyAdvice {

    private static final Class[] annos = {
            RequestMapping.class,
            GetMapping.class,
            PostMapping.class,
            DeleteMapping.class,
            PutMapping.class
    };


    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        AnnotatedElement element = returnType.getAnnotatedElement();
        return Arrays.stream(annos).anyMatch(anno -> anno.isAnnotation() && element.isAnnotationPresent(anno));
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
                                  Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        Object out = null;
        response.getHeaders().setContentType(MediaType.APPLICATION_JSON);

        if (null == body) {
            out = new GlobalResult(ReturnCode.getSuccessReturnCode());
        } else if (body instanceof GlobalResult){
            out = body;
        } else if (Map.class.isAssignableFrom(body.getClass())){
//            GlobalResult gr = new GlobalResult(ReturnCode.getSuccessReturnCode(), (Map)body);
            out = body;
        } else {
            HashMap map = new HashMap();
            map.put("result", body);
            GlobalResult gr = new GlobalResult(ReturnCode.getSuccessReturnCode(), map);
            out = gr;
        }

        // 防止controller返回String，结果返回对象，导致StringMessageConverter转换异常
        if (StringHttpMessageConverter.class.isAssignableFrom(selectedConverterType)) {
            out = JSONUtils.toJSONString(out);
        }

        return out;
    }
}
