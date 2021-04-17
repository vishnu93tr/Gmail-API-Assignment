package complexpojo;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class MainExecution {
    ResponseSpecification responseSpecification;
    @BeforeClass
    public void setup(){
        RequestSpecBuilder requestSpecBuilder=new RequestSpecBuilder().
                setBaseUri("https://api.getpostman.com").
                addHeader("X-Api-Key","PMAK-6068095f868b9945980aff7d-37b3f24983d4f0af64bf528e289e6c0e47").
                setContentType(ContentType.JSON).log(LogDetail.ALL);
        ResponseSpecBuilder responseSpecBuilder=new ResponseSpecBuilder().
                expectContentType(ContentType.JSON).expectStatusCode(200);

        RestAssured.requestSpecification=requestSpecBuilder.build();
        responseSpecification=responseSpecBuilder.build();
    }
    @Test
    public void compled_pojo(){
        Header header=new Header("Content-Type","application/json");
        List<Header> headerList=new ArrayList<Header>();
        headerList.add(header);

        Body body=new Body("raw","{\"data\": \"123\"}");

        Request request=new Request("https://postman-echo.com/post","POST",headerList,body,"This is a sample POST Request");

        subitem subitem=new subitem("Sample POST Request",request);

        List<subitem> subitemList=new ArrayList<subitem>();
        subitemList.add(subitem);

        Item item=new Item("This is a folder",subitemList);

        Request request1=new Request("https://postman-echo/get","GET","This is a sample GET Request");
        Item item1=new Item("Sample GET Request",request1);

        List<Item> itemList=new ArrayList<Item>();
        itemList.add(item);
        itemList.add(item1);

        Info info=new Info("Sample Collection",
                "This is just a sample collection.",
                "https://schema.getpostman.com/json/collection/v2.1.0/collection.json");

        Collection collection=new Collection(info,itemList);

        Root root=new Root(collection);

        String collection_uid=  given().
                body(root).
                when().
                post("/collections").
                then().spec(responseSpecification).
                extract().response().path("collection.uid");


    }

}
