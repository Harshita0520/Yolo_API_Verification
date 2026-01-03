package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class ServiceFaresApi {

    public static Response getServiceFares(String FromCityId, String ToCityId, String ServiceId ) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .queryParam("service__route__from_city__id",FromCityId)
                .queryParam("service__route__to_city__id",ToCityId)
                .queryParam("service_id",ServiceId)
                .queryParam("fare_type","1")
                .queryParam("limit","10")
                .queryParam("offset","0")
                .when()
                .get(ApiConstants.SERVICE_FARES)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
