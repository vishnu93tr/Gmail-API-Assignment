package GmailAPI;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Root {
    @JsonProperty("addLabelIds")
    private List<String> addLabelsList;

    @JsonProperty("removeLabelIds")
    private List<String> removeLabelList;

    public List<String> getAddLabelsList() {
        return addLabelsList;
    }

    public void setAddLabelsList(List<String> addLabelsList) {
        this.addLabelsList = addLabelsList;
    }

    public List<String> getRemoveLabelList() {
        return removeLabelList;
    }

    public void setRemoveLabelList(List<String> removeLabelList) {
        this.removeLabelList = removeLabelList;
    }
}
