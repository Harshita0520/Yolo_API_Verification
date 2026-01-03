package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class HopDetailsApi {

    public static Response getHopDetails(String HopId) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .queryParam("status","1")
                .when()
                .get(ApiConstants.HOP_DETAILS(HopId))
                .then()
                .log().all()
                .extract()
                .response();
    }
}
