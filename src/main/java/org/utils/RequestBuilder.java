package org.utils;

import static io.restassured.RestAssured.given;

import io.restassured.specification.RequestSpecification;

public class RequestBuilder {

    public static RequestSpecification baseRequest(ApiType apiType, UserToken userToken) {

        return given()
                .baseUri(apiType.getBaseUrl())
                .header("Accept", ApiConstants.ACCEPT_JSON)
                .header("user-type", ApiConstants.USER_TYPE_INTERNAL)
                .header("platform", ApiConstants.PLATFORM_INTR)
                .header("Authorization", userToken.getUserToken());
        }
}
