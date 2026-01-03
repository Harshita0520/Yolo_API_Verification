package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class PnrDetailsApi {

    public static Response getPnrDetails(String PnrNumber ) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .when()
                .get(ApiConstants.PNR_DETAILS(PnrNumber))
                .then()
                .log().all()
                .extract()
                .response();
    }
}
