package org.example.misc;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class TestFile {



        @Test
        public void postRequest(){
        String payload ="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RestAssured
                //Preparation part
                .given().
                baseUri("https://restful-booker.herokuapp.com/")
                .basePath("/auth")
                .contentType(ContentType.JSON)

                //Request Part
                .when().body(payload).post()
                //Verification Part
                .then().log().all().statusCode(200);

    }
}
