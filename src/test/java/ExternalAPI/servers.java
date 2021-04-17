package ExternalAPI;

import java.util.List;

public class servers {
    private List<Object> servers;
    public servers(){}
    public servers(List<Object> server){this.servers=server;}
    public List<Object> getUrl() {
        return servers;
    }

    public void setUrl(List<Object> server) {
        this.servers = server;
    }
}
