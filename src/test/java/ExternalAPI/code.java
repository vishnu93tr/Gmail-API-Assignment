package ExternalAPI;

public class code {
    private String type;
    private String format;

    public code(String type, String format) {
        this.type = type;
        this.format = format;
    }

    public code() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
