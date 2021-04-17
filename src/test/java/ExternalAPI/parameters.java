package ExternalAPI;

import java.util.List;

public class parameters {
    private String name;
    private String in;
    private String description;
    private Boolean required;
    private schema schema;
    public parameters(){}

    public parameters(String name, String in, String description, Boolean required, ExternalAPI.schema schema) {
        this.name = name;
        this.in = in;
        this.description = description;
        this.required = required;
        this.schema = schema;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public ExternalAPI.schema getSchema() {
        return schema;
    }

    public void setSchema(ExternalAPI.schema schema) {
        this.schema = schema;
    }
}
