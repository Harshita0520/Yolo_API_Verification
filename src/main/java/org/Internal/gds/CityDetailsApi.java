package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class CityDetailsApi {

    public static Response getCityDetails(String cityId) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .queryParam("status","1")
                .when()
                .get(ApiConstants.CITY_DETAILS(cityId))
                .then()
                .log().all()
                .extract()
                .response();
    }
}
