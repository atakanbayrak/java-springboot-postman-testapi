package com.postman.test.requests;

import java.util.*;

public class AccessRequest {

    private String accessCode = "e083cdae16ff5fdac67e2872c15c0";

    private String accessErrorCode = "GECERSIZ AUTHORIZATION CODE";


    public AccessRequest(String accessCode){
        this.accessCode = accessCode;
    }

    public AccessRequest(){

    }
    public String getAccessCode() {
        return accessCode;
    }

    public String getAccessErrorCode(){
        return accessErrorCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public void setAccessErrorCode(String accessErrorCode){this.accessErrorCode = accessErrorCode;}
}
