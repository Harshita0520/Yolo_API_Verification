package org.api;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.RequestBuilder;

public class PnrDetailsApi {

    public static Response getPnrDetails( ) {
        return RequestBuilder.baseRequest()
                .when()
                .get(ApiConstants.PNR_DETAILS)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
