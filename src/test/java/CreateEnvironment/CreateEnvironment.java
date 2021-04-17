package CreateEnvironment;

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

public class CreateEnvironment {
    @BeforeClass
    public void setup(){
        RequestSpecBuilder requestSpecBuilder=new RequestSpecBuilder().
                setBaseUri("https://api.getpostman.com").
                addHeader("X-Api-Key","PMAK-6068095f868b9945980aff7d-37b3f24983d4f0af64bf528e289e6c0e47").
                setAccept(ContentType.ANY).
                setContentType(ContentType.JSON).
                log(LogDetail.BODY);
        ResponseSpecBuilder responseSpecBuilder=new ResponseSpecBuilder().
                expectContentType(ContentType.JSON).
                expectStatusCode(200).
                log(LogDetail.ALL);
        RestAssured.requestSpecification=requestSpecBuilder.build();
        RestAssured.responseSpecification=responseSpecBuilder.build();
    }
    @Test
    public void createEnvironment(){
        values values=new values("variable_name_1","some variable name");
        values values1=new values("variable_name_2","some variable name1");
        List<Object> values2=new ArrayList<Object>();
        values2.add(values);
        values2.add(values1);
        environment environment=new environment("Sample Environment1",values2);
        Root root=new Root(environment);
        Response response=given().body(root).when().post("/environments").then().extract().response();
        response.prettyPrint();
    }
}
