package ExternalAPI;

import java.util.List;

public class required {
    private List<String> required;

    public required() {
    }

    public required(List<String> value){
        this.required=value;
    }

    public List<String> getValue() {
        return required;
    }

    public void setValue(List<String> value) {
        this.required = value;
    }
}
