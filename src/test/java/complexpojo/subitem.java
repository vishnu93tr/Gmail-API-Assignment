package complexpojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.omg.CORBA.PRIVATE_MEMBER;

@JsonIgnoreProperties(ignoreUnknown = true)
public class subitem {
    private String name;

    @JsonProperty("request")
    private Request request;

    public subitem(String name, Request request) {
        this.name = name;
        this.request = request;
    }
    public subitem(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
