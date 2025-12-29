package org.api;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.RequestBuilder;

public class TripConflictBookingApi {

    public static Response getConflictBookings(String details ) {
        return RequestBuilder.baseRequest()
                .queryParam("details",details)
                .when()
                .get(ApiConstants.TRIP_CONFLICT_BOOKINGS)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
