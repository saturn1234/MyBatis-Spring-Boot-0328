package tk.mybatis.springboot.conf;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;

import java.util.List;

public class JSONUtils {

    public static String toJSONString(Object obj) {
//        Gson gson = new GsonBuilder().setDateFormat(DateUtils.FORMAT_YYYY_MM_DD).create();
//        return gson.toJson(obj);
        Gson gson = new Gson();
        return gson.toJson(obj);
        //return JSON.toJSONString(obj);
    }

    public static JSONObject parse(String str) {
        return JSON.parseObject(str);
    }

    public static JSONArray parseArray(String str) {
        return JSON.parseArray(str);
    }

    public static <T> T parse(String str, Class<T> clz) {
        return JSON.parseObject(str, clz);
    }

    public static <T> List<T> parseArray(String str, Class<T> clz) {
        return JSON.parseArray(str, clz);
    }

}
