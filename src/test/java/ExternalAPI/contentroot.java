package ExternalAPI;

public class contentroot {
    private String description;
    private content content;
    public contentroot(){}

    public contentroot(String description,content content) {
        this.description = description;
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExternalAPI.content getContent() {
        return content;
    }

    public void setContent(ExternalAPI.content content) {
        this.content = content;
    }
}
