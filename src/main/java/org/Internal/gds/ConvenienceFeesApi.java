package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class ConvenienceFeesApi {

    public static Response getConvenienceFees(String fromStopId, String toStopId, String serviceTemplateId, String tripStartDate, String tripEndDate) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .queryParam("page","1")
                .queryParam("status","1")
                .queryParam("from_stop_id", fromStopId)
                .queryParam("to_stop_id", toStopId)
                .queryParam("service_template_id", serviceTemplateId)
                .queryParam("page_size","20")
                .queryParam("trip_start_date", tripStartDate)
                .queryParam("trip_end_date", tripEndDate)
                .when()
                .get(ApiConstants.CONVENIENCE_FEES)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
