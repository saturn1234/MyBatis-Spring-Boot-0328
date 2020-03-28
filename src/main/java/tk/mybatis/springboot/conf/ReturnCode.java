package tk.mybatis.springboot.conf;


public class ReturnCode {

    private String type;
    private String code;
    private String message;
    private String domain;

    public ReturnCode(String type, String code, String message) {
        this.type = type;
        this.code = code;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public static ReturnCode getSuccessReturnCode() {
        return new ReturnCode(Constants.RETURN_CODE_TYPE_SUCCESS,
                Constants.RETURN_CODE_CODE_SUCCESS, null);
    }
}
