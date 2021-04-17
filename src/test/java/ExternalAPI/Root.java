package ExternalAPI;

public class Root {
    private String type;
    private input input;
    public Root(){}
    public Root(String type,input input){this.type=type;this.input=input;}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ExternalAPI.input getInput() {
        return input;
    }

    public void setInput(ExternalAPI.input input) {
        this.input = input;
    }
}
