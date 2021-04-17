package ExternalAPI;

import java.util.List;

public class schema1 {
    private List<String> required;
    private properties properties;

    public schema1(List<String> required, ExternalAPI.properties properties) {
        this.required = required;
        this.properties = properties;
    }
    public schema1(){}

    public List<String> getRequired() {
        return required;
    }

    public void setRequired(List<String> required) {
        this.required = required;
    }

    public ExternalAPI.properties getProperties() {
        return properties;
    }

    public void setProperties(ExternalAPI.properties properties) {
        this.properties = properties;
    }
}
