package com.postman.test.service;

import com.postman.test.requests.AuthorizationRequest;
import com.postman.test.requests.UserRequest;

public class AuthorizationCodeService {

    AuthorizationRequest authorizationRequest = new AuthorizationRequest();
    public AuthorizationCodeService(){

    }

    public String giveAuthToken(UserRequest userRequest){
        if(userRequest.getClient_id() == 1234567){
            return authorizationRequest.getAuthCode();
        }
        return authorizationRequest.getAuthErrorCode();
    }


}
