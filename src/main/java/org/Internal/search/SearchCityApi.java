package org.Internal.search;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class SearchCityApi {

    public static Response getCity(String city) {
        return RequestBuilder.baseRequest(ApiType.SEARCH, UserToken.INTERNAL)
                .queryParam("q",city)
                .when()
                .get(ApiConstants.SEARCH_CITY)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
