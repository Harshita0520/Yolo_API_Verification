package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class EditTripApi {
    public static Response getTripDetails(String TripId ) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .when()
                .get(ApiConstants.EDIT_TRIPS(TripId))
                .then()
                .log().all()
                .extract()
                .response();
    }
}
