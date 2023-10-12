package com.postman.test.service;

import com.postman.test.requests.IdentityRequest;

import java.util.ArrayList;

public class IdentityService {

    public String authentication(IdentityRequest identityRequest){
        if(identityRequest.getScope().equals("Ad-Soyad")){
            return "Ad-Soyad Doğrulaması";
        }
        else if(identityRequest.getScope().equals("Kimlik-Dogrulama")){
            return "Kimlik Doğrulaması";
        }
        return "Error";

    }
}
