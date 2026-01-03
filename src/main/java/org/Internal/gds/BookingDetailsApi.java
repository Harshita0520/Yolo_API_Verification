package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class BookingDetailsApi {

    public static Response getBookingsDetails(String BookingId ) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .when()
                .get(ApiConstants.BOOKING_DETAILS(BookingId))
                .then()
                .log().all()
                .extract()
                .response();
    }

}
