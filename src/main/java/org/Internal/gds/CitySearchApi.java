package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class CitySearchApi {

    public static Response getCity(String city) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .queryParam("Driver",city)
                .queryParam("page","1")
                .queryParam("status","1")
                .when()
                .get(ApiConstants.CITY_SEARCH)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
