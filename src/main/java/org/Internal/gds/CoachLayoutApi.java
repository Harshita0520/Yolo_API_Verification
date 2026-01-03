package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class CoachLayoutApi {

    public static Response getCoachLayout(String CoachId,String status ) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .queryParam("status",status)
                .when()
                .get(ApiConstants.COACH_LAYOUT(CoachId))
                .then()
                .log().all()
                .extract()
                .response();
    }
}
