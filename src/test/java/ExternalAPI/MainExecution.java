package ExternalAPI;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class MainExecution {
    @BeforeClass
    public void setup(){
        RequestSpecBuilder requestSpecBuilder=new RequestSpecBuilder().
                setBaseUri("https://api.getpostman.com").
                addHeader("X-Api-Key","PMAK-6068095f868b9945980aff7d-37b3f24983d4f0af64bf528e289e6c0e47").
                setContentType(ContentType.JSON).log(LogDetail.ALL);
        ResponseSpecBuilder responseSpecBuilder=new ResponseSpecBuilder().
                expectContentType(ContentType.JSON).expectStatusCode(200);

        RestAssured.requestSpecification=requestSpecBuilder.build();
        RestAssured.responseSpecification=responseSpecBuilder.build();
    }

    @Test
    public void simplePostRequest(){
        license license=new license("MIT");
        info info=new info("1.0.0","Swagger Petstore",license);

        server server=new server("http://petstore.swagger.io/v1");

        List<server> servers=new ArrayList<server>();
        servers.add(server);

        code code=new code("integer","int32");
        message message=new message("string");
        properties properties=new properties(code,message);
        List<String> requiredList=new ArrayList<String>();
        requiredList.add("code");
        requiredList.add("message");
        schema1 schema1=new schema1(requiredList,properties);
        contentType contentType=new contentType(schema1);
        content content=new content(contentType);
        contentroot contentroot=new contentroot("unexpected error",content);
        responses responses=new responses(contentroot);
        schema schema=new schema("integer","int32");
        parameters parameters=new parameters("limit","query","limit",false,schema);
        List<parameters> parametersList=new ArrayList<ExternalAPI.parameters>();
        parametersList.add(parameters);
        get get=new get("List all pets","listPets",parametersList,responses);
        endpoint endpoint=new endpoint(get);
        paths paths=new paths(endpoint);
        input input=new input("3.0.0",info,servers,paths);
        Root root=new Root("json",input);
        Response response=  given().
                body(root).
                when().
                post("/import/openapi").
                then().
                extract().response();
        response.prettyPrint();
    }
}
