package ExternalAPI;

public class info {
    private String version;
    private String title;
    private license license;

    public info(String version, String title,license license) {
        this.version = version;
        this.title = title;
        this.license = license;
    }
    public info(){}

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ExternalAPI.license getLicense() {
        return license;
    }

    public void setLicense(ExternalAPI.license license) {
        this.license = license;
    }
}
