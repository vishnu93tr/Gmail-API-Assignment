package ExternalAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

public class paths {
    @JsonProperty("/pets")
    private endpoint endpoint;

    public paths(ExternalAPI.endpoint endpoint) {
        this.endpoint = endpoint;
    }

    public ExternalAPI.endpoint getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(ExternalAPI.endpoint endpoint) {
        this.endpoint = endpoint;
    }
}
