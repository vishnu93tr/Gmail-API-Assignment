package GmailAPI;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class GmailAPI {
    String token="Bearer "
            +"ya29.a0AfH6SMDzvwVfekMstDtHFjc__jyEagUubI2Cdk2zkD47R-heXHnOuZ4Xf42-mc8zFG3CTRcTLyk0n26oOIwN95ACSvQIOXvzDcBi8EnT4Ga1l-6q8rE0sTwEuyYxbynU1zqUaGc-ggzemrnU_j7ClnrzWtcjWQ";
    String get_message_id;
    //Matchers one of here as Delete response returns 204
    @BeforeClass
    public void setup(){
        RequestSpecBuilder requestSpecBuilder=new RequestSpecBuilder().
                addHeader("Authorization",token)
                .setBaseUri("https://gmail.googleapis.com").
                setAccept(ContentType.ANY)
                .log(LogDetail.ALL);
        ResponseSpecBuilder responseSpecBuilder=new ResponseSpecBuilder().
                expectStatusCode(Matchers.oneOf(200,204)).expectContentType(ContentType.JSON).log(LogDetail.ALL);
        RestAssured.requestSpecification=requestSpecBuilder.build();
        RestAssured.responseSpecification=responseSpecBuilder.build();
    }
    /*This method retrieves user profile*/
    /*@Test
    public void getUserProfile(){
    Response response= given().
                pathParam("userId","vishnu26121993@gmail.com").
        when().
                get("/gmail/v1/users/{userId}/profile").
        then().
                extract().response();
    response.prettyPrint();
    Assert.assertEquals(response.then().extract().jsonPath().get("emailAddress"),"vishnu26121993@gmail.com");
    }*/
    /*This method sends email*/
    @Test(priority = 1)
    public void sendEmail(){
        String str="From: vishnu26121993@gmail.com\n" +
                "To: vishnu26121993@gmail.com\n" +
                "Subject: Rest Assured Test Email\n" +
                "\n" +
                "Sending from Rest Assured API\n";
        String base64EncodedUrl= Base64.getUrlEncoder().encodeToString(str.getBytes());
        Map<String,String> map=new HashMap<>();
        map.put("raw",base64EncodedUrl);
        Response response= given().
                pathParam("userId","vishnu26121993@gmail.com").
                body(map).
                when().
                post("gmail/v1/users/{userId}/messages/send").
                then().
                extract().response();
        response.prettyPrint();
         get_message_id=response.then().extract().jsonPath().get("id");
    }
    /*This method fetches the email/message with help of message id and user account name*/
    @Test(priority = 2)
    public void getMessage(){
    Response response=    given().
                    pathParam("userId","vishnu26121993@gmail.com").
                    pathParam("messageId",get_message_id).
        when().
                get("/gmail/v1/users/{userId}/messages/{messageId}").
        then().
                extract().response();
    response.prettyPrint();
     Assert.assertEquals(response.then().extract().jsonPath().get("id"),get_message_id);

    }
    /*This method modifys message or email with message id and user account name*/
    /*Acceptable values in method body are one of INBOX, SPAM, TRASH */
    /*UNREAD is a optional value*/
    //TODO-to explore removeLabelIds field in body
    @Test(priority = 3)
    public void modifyMessage(){
        List<String> addLabels=new ArrayList<>();
        addLabels.add("INBOX");
        addLabels.add("UNREAD");
        Root root=new Root();
        root.setAddLabelsList(addLabels);
        Response response=    given().
                pathParam("userId","vishnu26121993@gmail.com").
                pathParam("messageId",get_message_id).
                body(root).
                when().
                post("/gmail/v1/users/{userId}/messages/{messageId}/modify").
                then().
                extract().response();
        response.prettyPrint();
    }
    /*This method deletes messages*/
    @Test(priority = 4)
    public void deleteMessage(){
        Response response=    given().
                pathParam("userId","vishnu26121993@gmail.com").
                pathParam("messageId",get_message_id).
                when().
                delete("/gmail/v1/users/{userId}/messages/{messageId}");

    }

}
