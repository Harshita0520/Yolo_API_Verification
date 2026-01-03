package org.Internal.payment;

import io.restassured.response.Response;
import org.utils.ApiConstants;
import org.utils.ApiType;
import org.utils.RequestBuilder;
import org.utils.UserToken;

public class WalletTransactionsApi {

    public static Response getWalletTransactions(String userId) {
        return RequestBuilder.baseRequest(ApiType.PAYMENT, UserToken.INTERNAL)
                .queryParam("next","47849")
                .when()
                .get(ApiConstants.WALLET_TRANSACTIONS(userId))
                .then()
                .log().all()
                .extract()
                .response();
    }
}
