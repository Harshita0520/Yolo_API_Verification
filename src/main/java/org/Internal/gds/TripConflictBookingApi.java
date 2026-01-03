package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class TripConflictBookingApi {

    public static Response getConflictBookings(String TripId,String details ) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .queryParam("details",details)
                .when()
                .get(ApiConstants.TRIP_CONFLICT_BOOKINGS(TripId))
                .then()
                .log().all()
                .extract()
                .response();
    }
}
