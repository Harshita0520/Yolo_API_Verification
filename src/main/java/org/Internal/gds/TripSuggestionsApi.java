package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class TripSuggestionsApi {
    public static Response getTripSuggestion (String BookingId) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .queryParam("same_service_template","0")
                .queryParam("hop_required","false")
                .when()
                .get(ApiConstants.TRIP_SUGGESTIONS(BookingId))
                .then()
                .log().all()
                .extract()
                .response();
    }
}
