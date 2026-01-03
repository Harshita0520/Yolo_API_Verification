package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class AllAmenitiesApi {

    public static Response getAllAmenities() {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .when()
                .get(ApiConstants.ALL_AMENITIES)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
