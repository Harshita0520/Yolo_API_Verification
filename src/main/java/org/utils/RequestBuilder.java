package org.utils;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import io.restassured.specification.RequestSpecification;

public class RequestBuilder {

    public static RequestSpecification baseRequest( ) {

        BaseApi.init();
        return given()
                .baseUri(baseURI)
                .header("Accept", ApiConstants.ACCEPT_JSON)
                .header("user-type", ApiConstants.USER_TYPE_INTERNAL)
                .header("platform", ApiConstants.PLATFORM_INTR)
                .header("Authorization", "Bearer " +ConfigReader.get("token_internal") )
                .log().all();
    }
}


