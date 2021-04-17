package complexpojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Request {
   private Object url;
   private String method;
   private String description;

   @JsonProperty("header")
   private List<Header> header;

   @JsonProperty("body")
   private Body body;

   public Object getUrl() {
      return url;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   public String getMethod() {
      return method;
   }

   public void setMethod(String method) {
      this.method = method;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public List<Header> getHeader() {
      return header;
   }

   public void setHeader(List<Header> header) {
      this.header = header;
   }

   public Body getBody() {
      return body;
   }

   public void setBody(Body body) {
      this.body = body;
   }

   public Request(String url, String method, String description) {
      this.url = url;
      this.method = method;
      this.description = description;
   }

   public Request(String url, String method, List<Header> header, Body body,String description) {
      this.url = url;
      this.method = method;
      this.description = description;
      this.header = header;
      this.body = body;
   }
   public Request(){}
}
