package com.shop.respawn.config.oauth.provider;

public interface OAuth2UserInfo {

    String getProvider();

    String getProviderId();

    String getEmail();

    String getName();

    String getPhoneNumber();
}