package ExternalAPI;

import java.util.List;

public class get {
    private String summary;
    private String operationId;
    private List<parameters> parameters;
    private responses responses;

    public get(String summary, String operationId, List<ExternalAPI.parameters> parameters, ExternalAPI.responses responses) {
        this.summary = summary;
        this.operationId = operationId;
        this.parameters = parameters;
        this.responses = responses;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public List<ExternalAPI.parameters> getParameters() {
        return parameters;
    }

    public void setParameters(List<ExternalAPI.parameters> parameters) {
        this.parameters = parameters;
    }

    public ExternalAPI.responses getResponses() {
        return responses;
    }

    public void setResponses(ExternalAPI.responses responses) {
        this.responses = responses;
    }
}
