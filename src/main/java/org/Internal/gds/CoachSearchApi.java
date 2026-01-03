package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class CoachSearchApi {

    public static Response getCoach(String CoachName) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .queryParam("page","1")
                .queryParam("Driver",CoachName)
                .queryParam("status","1")
                .when()
                .get(ApiConstants.COACH_SEARCH)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
