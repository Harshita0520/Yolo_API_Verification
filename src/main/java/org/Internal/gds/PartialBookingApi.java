package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class PartialBookingApi {

    public static Response getPartialBookingDetails(String bookingId ) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .when()
                .get(ApiConstants.PARTIAL_BOOKING(bookingId))
                .then()
                .log().all()
                .extract()
                .response();
    }
}
