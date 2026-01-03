package org.utils;

public enum ApiType {

    GDS(ConfigReader.get("GdsURL")),
    SEARCH(ConfigReader.get("SearchURL")),
    AUTH(ConfigReader.get("AuthURL")),
    PAYMENT(ConfigReader.get("PaymentURL")),
    PARTNER(ConfigReader.get("PartnerURL"));

    private final String baseUrl;

    ApiType(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getBaseUrl() {
        return baseUrl;
    }
}
