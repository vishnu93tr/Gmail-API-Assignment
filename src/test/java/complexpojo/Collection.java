package complexpojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.sound.sampled.Line;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Collection {
    @JsonProperty("info")
    private Info info;
    @JsonProperty("item")
    private List<Item> item;
    public Collection(){}
    public Collection(Info info, List<Item> item) {
        this.info = info;
        this.item = item;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }
}
