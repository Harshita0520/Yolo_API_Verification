package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class AllVehiclesApi {
    public static Response getAllVehicles() {

        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .when()
                .get(ApiConstants.ALL_VEHICLES)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
