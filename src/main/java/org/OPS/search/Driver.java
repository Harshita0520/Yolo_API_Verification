package org.OPS.search;

import io.restassured.response.Response;
import org.ApiEndpoints.ops;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class Driver {

    public static Response getOpsStaff_DriverName(String DriverName) {
        return RequestBuilder.baseRequest(ApiType.SEARCH, UserToken.INTERNAL)
                .queryParam("name",DriverName)
                .when()
                .get(ops.DRIVER)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
