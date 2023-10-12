package com.postman.test.requests;

public class AuthorizationRequest {

    private String authCode = "https://kurum.gov.tr/x.signinx?state=random_value&code=e4bc8c2e25d35f7ed9c8c3f54347a5";

    private String authErrorCode = "https://kurum.gov.tr/x.signinx?error=invalid_request&error_description=Missing+response_type+parameter+value";
    public AuthorizationRequest(String authCode){
        this.authCode = authCode;
    }

    public AuthorizationRequest(){

    }
    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getAuthErrorCode(){
        return authErrorCode;
    }

    public void setAuthErrorCode(String errorCode){this.authErrorCode = errorCode;}
}
