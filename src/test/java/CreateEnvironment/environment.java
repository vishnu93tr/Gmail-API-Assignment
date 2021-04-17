package CreateEnvironment;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class environment {
    private String name;
    private List<Object> values;
    public environment(){}
    public environment(String name,List<Object> values){this.name=name;this.values=values;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getValues() {
        return values;
    }

    public void setValues(List<Object> values) {
        this.values = values;
    }
}
