package ExternalAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

public class content {
    @JsonProperty("application/json")
    private contentType contentType;
    public content(){}
    public content(contentType contentType) {
        this.contentType = contentType;
    }

    public ExternalAPI.contentType getContentType() {
        return contentType;
    }

    public void setContentType(ExternalAPI.contentType contentType) {
        this.contentType = contentType;
    }
}
