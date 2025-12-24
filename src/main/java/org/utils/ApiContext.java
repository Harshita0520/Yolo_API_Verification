package org.utils;

import io.restassured.response.Response;

public class ApiContext {

    private static Response response;

    public static void setResponse(Response res) {
        response = res;
    }

    public static Response getResponse() {
        return response;
    }
}
