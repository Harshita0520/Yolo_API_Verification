package org.Internal.payment;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class UserWalletApi {

    public static Response getUserWallet(String userId) {
        return RequestBuilder.baseRequest(ApiType.PAYMENT, UserToken.INTERNAL)
                .when()
                .get(ApiConstants.USER_WALLET(userId))
                .then()
                .log().all()
                .extract()
                .response();
    }
}
