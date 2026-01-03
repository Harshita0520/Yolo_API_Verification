package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class SMERatingsApi {

    public static Response getSmeRatings(String UserId ) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .queryParam("created_by",UserId)
                .when()
                .get(ApiConstants.SME_RATINGS)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
