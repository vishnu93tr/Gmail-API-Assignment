package ExternalAPI;

import java.util.List;

public class input {
    private String openapi;
    private info info;
    private List<server> servers;
    private paths paths;
    public input(){}

    public input(String openapi, ExternalAPI.info info, List<server> servers,paths paths) {
        this.openapi = openapi;
        this.info = info;
        this.servers = servers;
        this.paths = paths;
    }

    public String getOpenapi() {
        return openapi;
    }

    public void setOpenapi(String openapi) {
        this.openapi = openapi;
    }

    public ExternalAPI.info getInfo() {
        return info;
    }

    public void setInfo(info info) {
        this.info = info;
    }

    public List<server> getServers() {
        return servers;
    }

    public void setServers(List<server> servers) {
        this.servers = servers;
    }

    public paths getPaths() {
        return paths;
    }

    public void setPaths(paths paths) {
        this.paths = paths;
    }
}
