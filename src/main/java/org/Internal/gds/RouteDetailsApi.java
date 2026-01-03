package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class RouteDetailsApi {

    public static Response getRouteDetails(String routeId) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .queryParam("status","2")
                .when()
                .get(ApiConstants.ROUTE_DETAILS(routeId))
                .then()
                .log().all()
                .extract()
                .response();
    }
}
