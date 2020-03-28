package tk.mybatis.springboot.conf;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class RequestInputStreamJSONUtils {

    private static final ThreadLocal<String> JSON_BODY = new ThreadLocal<>();
    private static final ThreadLocal<HttpServletRequest> REQUEST_LOCAL = new ThreadLocal<>();

    public static String getJsonObject(HttpServletRequest request) {
        String jsonBody = null;
        if(request.equals(REQUEST_LOCAL.get())){
            jsonBody = JSON_BODY.get();
            if(StringUtils.isNotBlank(jsonBody)){
                return jsonBody;
            }
        }

        REQUEST_LOCAL.set(request);

        if (jsonBody == null){
            try {
                jsonBody = IOUtils.toString(request.getInputStream(), "UTF-8");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        JSON_BODY.set(jsonBody);
        return jsonBody;
    }
}
