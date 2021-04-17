package CreateEnvironment;

public class Root {
    private environment environment;
    public Root(){}
    public Root(environment environment){this.environment=environment;}

    public environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(environment environment) {
        this.environment = environment;
    }
}
