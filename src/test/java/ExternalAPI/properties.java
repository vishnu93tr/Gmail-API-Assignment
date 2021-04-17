package ExternalAPI;

public class properties {
    private code code;
    private message message;

    public properties(ExternalAPI.code code, ExternalAPI.message message) {
        this.code = code;
        this.message = message;
    }

    public ExternalAPI.code getCode() {
        return code;
    }

    public void setCode(ExternalAPI.code code) {
        this.code = code;
    }

    public ExternalAPI.message getMessage() {
        return message;
    }

    public void setMessage(ExternalAPI.message message) {
        this.message = message;
    }
}
