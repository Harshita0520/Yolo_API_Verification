package org.OPS.search;

import io.restassured.response.Response;
import org.ApiEndpoints.ops;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class Captain {

    public static Response getOpsStaff_CaptainName(String CaptainName) {
        return RequestBuilder.baseRequest(ApiType.SEARCH, UserToken.INTERNAL)
                .queryParam("name",CaptainName)
                .when()
                .get(ops.CAPTAIN)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
