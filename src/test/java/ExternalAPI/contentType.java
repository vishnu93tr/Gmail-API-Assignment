package ExternalAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

public class contentType {
    @JsonProperty("schema")
    private schema1 schema1;
    public contentType(){}
    public contentType(ExternalAPI.schema1 schema1) {
        this.schema1 = schema1;
    }

    public ExternalAPI.schema1 getSchema1() {
        return schema1;
    }

    public void setSchema1(ExternalAPI.schema1 schema1) {
        this.schema1 = schema1;
    }
}
