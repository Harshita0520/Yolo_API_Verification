package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class ServiceDetailsApi {

    public static Response getServiceDetails (String ServiceId) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .when()
                .get(ApiConstants.SERVICE_DETAILS(ServiceId))
                .then()
                .log().all()
                .extract()
                .response();
    }
}
