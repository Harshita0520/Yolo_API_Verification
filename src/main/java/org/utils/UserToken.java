package org.utils;

public enum UserToken {
    INTERNAL("token_internal"),
    RIDER("token_rider"),
    AGENT("token_agent");

    private final String tokenKey;

    UserToken(String tokenKey) {
        this.tokenKey = tokenKey;
    }

    public String getUserToken() {
        return ConfigReader.get(tokenKey);
    }
}

