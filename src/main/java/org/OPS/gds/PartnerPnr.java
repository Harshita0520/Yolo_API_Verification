package org.OPS.gds;

import io.restassured.response.Response;
import org.ApiEndpoints.ops;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class PartnerPnr {

    public static Response getPartnerPnr(String tripId) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .queryParam("trip_id",tripId)
                .when()
                .get(ops.PARTNER_PNR)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
