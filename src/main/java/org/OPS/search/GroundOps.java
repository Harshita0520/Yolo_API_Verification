package org.OPS.search;

import io.restassured.response.Response;
import org.ApiEndpoints.ops;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class GroundOps {

    public static Response getOpsStaff_GroundOps(String name) {
        return RequestBuilder.baseRequest(ApiType.SEARCH, UserToken.INTERNAL)
                .queryParam("name",name)
                .when()
                .get(ops.GROUND_OPS)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
