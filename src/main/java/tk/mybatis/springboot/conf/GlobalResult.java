package tk.mybatis.springboot.conf;

import java.util.HashMap;
import java.util.Map;

public class GlobalResult {

    private HashMap<String, Object> reply = new HashMap<>();

    public GlobalResult(ReturnCode returnCode) {
        super();
        reply.put("returnCode", returnCode);
    }

    public GlobalResult(ReturnCode returnCode, Map map) {
        super();
//        reply.put("returnCode", returnCode);
//        reply.putAll(map);
    }

    public HashMap<String, Object> getReply() {
        return reply;
    }

    public void setReply(HashMap<String, Object> reply) {
        this.reply = reply;
    }
}
