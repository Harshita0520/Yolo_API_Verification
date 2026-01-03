package org.OPS.gds;

import io.restassured.response.Response;
import org.ApiEndpoints.ops;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class GroundVehicle {

    public static Response getGroundVehicle(String vehicleNumber) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .queryParam("search",vehicleNumber)
                .when()
                .get(ops.GROUND_VEHICLE)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
