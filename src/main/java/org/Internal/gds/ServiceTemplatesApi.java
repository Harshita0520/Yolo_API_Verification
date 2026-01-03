package org.Internal.gds;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class ServiceTemplatesApi {

    public static Response getServiceTemplates (String FromCityId,String ToCityId,String ServiceId) {
        return RequestBuilder.baseRequest(ApiType.GDS, UserToken.INTERNAL)
                .queryParam("page","1")
                .queryParam("status","1")
                .queryParam("route__from_city__id",FromCityId)
                .queryParam("route__to_city__id",ToCityId)
             //   .queryParam("template_name__icontains",TemplateName)
                .queryParam("service_id",ServiceId)
                .when()
                .get(ApiConstants.SERVICE_TEMPLATES)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
