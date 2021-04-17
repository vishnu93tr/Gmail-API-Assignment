package ExternalAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

public class responses {
    @JsonProperty("default")
    private contentroot contentroot;

    public ExternalAPI.contentroot getContentroot() {
        return contentroot;
    }

    public void setContentroot(ExternalAPI.contentroot contentroot) {
        this.contentroot = contentroot;
    }

    public responses(ExternalAPI.contentroot contentroot) {
        this.contentroot = contentroot;
    }
    public responses(){}
}
