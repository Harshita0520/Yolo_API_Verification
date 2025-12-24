package org.api;
import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.RequestBuilder;

public class InternalTripsApi {

    public static Response getInternalTrips( ) {
        return RequestBuilder.baseRequest()
                .when()
                .get(ApiConstants.INTERNAL_TRIPS)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
