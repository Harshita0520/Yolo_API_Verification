package org.Internal.gds;
import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class InternalTripsApi {

    public static Response getInternalTrips( ) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .when()
                .get(ApiConstants.INTERNAL_TRIPS)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
