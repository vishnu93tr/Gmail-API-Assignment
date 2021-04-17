package ExternalAPI;

public class endpoint {

    private get get;

    public endpoint(ExternalAPI.get get) {
        this.get = get;
    }
    public endpoint(){}
    public ExternalAPI.get getGet() {
        return get;
    }

    public void setGet(ExternalAPI.get get) {
        this.get = get;
    }
}
