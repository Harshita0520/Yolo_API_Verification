package org.utils;

import io.restassured.RestAssured;

public class BaseApi {

    public static void init() {
        RestAssured.baseURI = ConfigReader.get("GdsURL");
    }
}
