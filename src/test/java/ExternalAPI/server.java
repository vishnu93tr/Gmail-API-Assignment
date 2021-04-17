package ExternalAPI;

public class server {
    private String url;
    public server(String url){
        this.url=url;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
