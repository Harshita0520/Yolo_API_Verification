package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class HopSearchApi {

    public static Response getHops (String cityId,String hop) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .queryParam("Driver",hop)
                .queryParam("city_ids",cityId)
                .queryParam("page","1")
                .queryParam("status","1")
                .when()
                .get(ApiConstants.HOPS_SEARCH)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
