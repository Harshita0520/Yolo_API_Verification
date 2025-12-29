package org.api;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.RequestBuilder;

public class EditTripApi {
    public static Response getTripDetails( ) {
        return RequestBuilder.baseRequest()
                .when()
                .get(ApiConstants.EDIT_TRIPS)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
