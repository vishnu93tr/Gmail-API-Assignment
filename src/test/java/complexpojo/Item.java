package complexpojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Item {

    private String name;

    @JsonProperty("item")
    private List<subitem> subitem;

    @JsonProperty("request")
    private Request request;
    public Item(){}
    public Item(String name, List<subitem> subitem) {
        this.name = name;
        this.subitem = subitem;
    }
    public Item(String name,Request request){
        this.name=name;
        this.request=request;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<complexpojo.subitem> getSubitem() {
        return subitem;
    }

    public void setSubitem(List<complexpojo.subitem> subitem) {
        this.subitem = subitem;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
