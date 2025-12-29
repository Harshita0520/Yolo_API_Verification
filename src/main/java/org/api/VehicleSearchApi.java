package org.api;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.RequestBuilder;

public class VehicleSearchApi {

    public static Response getVehicle(String busNumber, String status ) {
        return RequestBuilder.baseRequest()
                .queryParam("search",busNumber)
                .queryParam("status",status)
                .when()
                .get(ApiConstants.VEHICLE_SEARCH)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
