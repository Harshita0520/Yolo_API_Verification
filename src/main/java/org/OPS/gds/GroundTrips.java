package org.OPS.gds;

import io.restassured.response.Response;
import org.ApiEndpoints.ops;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class GroundTrips {

    public static Response getGroundTrips(String startDate, String endDate, String serviceId) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .queryParam("page_size","10")
                .queryParam("page","1")
                .queryParam("trip_start_date",startDate)
                .queryParam("trip_start_date",endDate)
                .queryParam("service_template_id",serviceId)
                .queryParam("status" ,"1")
                .when()
                .get(ops.GROUND_TRIPS)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
