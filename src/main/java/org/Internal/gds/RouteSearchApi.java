package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class RouteSearchApi {

    public static Response getRoute(String route) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .queryParam("Driver",route)
                .queryParam("page","1")
                .queryParam("status","2")
                .when()
                .get(ApiConstants.ROUTE_SEARCH)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
