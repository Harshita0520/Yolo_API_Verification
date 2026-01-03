package org.Internal.search;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class BusStaffApi {

    public static Response getBusStaff(String staffRole, String staffName) {
        return RequestBuilder.baseRequest(ApiType.SEARCH, UserToken.INTERNAL)
                .queryParam("role",staffRole)
                .queryParam("name",staffName)
                .when()
                .get(ApiConstants.BUS_STAFF)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
