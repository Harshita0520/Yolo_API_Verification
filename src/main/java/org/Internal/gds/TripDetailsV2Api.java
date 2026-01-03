package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class TripDetailsV2Api {

    public static Response getTripDetailsV2(String TripId, String SubTripId, String DOJ ) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .queryParam("doj",DOJ)
                .queryParam("hop_required","false")
                .when()
                .get(ApiConstants.TRIP_DETAILS_V2(TripId,SubTripId))
                .then()
                .log().all()
                .extract()
                .response();
    }
}
