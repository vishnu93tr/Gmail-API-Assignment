package typicode;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class Assignment {

    @BeforeClass
    public void setup(){
        RequestSpecBuilder requestSpecBuilder=new RequestSpecBuilder().
                setBaseUri("https://jsonplaceholder.typicode.com").
                setContentType(ContentType.JSON);
        ResponseSpecBuilder responseSpecBuilder=new ResponseSpecBuilder().
                expectStatusCode(201).
                expectContentType(ContentType.JSON);
        RestAssured.requestSpecification=requestSpecBuilder.build();
        RestAssured.responseSpecification=responseSpecBuilder.build();
    }
    @Test(dataProvider = "data")
    public void post_request(String lat,String lng,String street,String suite,String city,String zipcode,String name,String username,String email){

        geo geo=new geo(lat,lng);
        address address=new address(street,suite,city,zipcode,geo);
        Request request=new Request(name,username,email,address);

        Response response=given().body(request).when().post("/users").then().extract().response();
        response.prettyPrint();
        assertThat(response.jsonPath().get("id"),is(notNullValue()));
    }
    @DataProvider
    public Object[][] data(){
        //latitude,longitude,street,suite,city,zipcode,name,username,email
        return new Object[][]{
                {"-37.3159","81.1496","Kulas Light","Apt. 556","Gwenborough","92998-3874","Leanne Graham","Bret","Sincere@april.biz"},
                {"-37.3235","83.1496","Kulas Light","Apt. 559","Gwenborough1","92998-3873","Leanne Graham1","Bret1","Sincere@april.biz1"}
        };
    }
}
