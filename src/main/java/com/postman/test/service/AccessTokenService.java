package com.postman.test.service;

import com.postman.test.requests.AccessRequest;
import com.postman.test.requests.AuthorizationRequest;

public class AccessTokenService {

    AccessRequest accessRequest = new AccessRequest();

    public AccessTokenService(){

    }

    public String giveAccessToken(AuthorizationRequest authorizationRequest){
        if(!authorizationRequest.getAuthCode().isEmpty()){
            return accessRequest.getAccessCode();
        }
        return authorizationRequest.getAuthCode();
    }
}
