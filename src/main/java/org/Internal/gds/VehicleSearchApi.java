package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class VehicleSearchApi {

    public static Response getVehicle(String busNumber, String status ) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .queryParam("Driver",busNumber)
                .queryParam("status",status)
                .when()
                .get(ApiConstants.VEHICLE_SEARCH)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
