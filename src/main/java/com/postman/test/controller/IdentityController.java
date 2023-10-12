package com.postman.test.controller;

import com.postman.test.requests.IdentityRequest;
import com.postman.test.service.IdentityService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/requests")
public class IdentityController {

    IdentityService identityService = new IdentityService();

    @PostMapping(value = "/authentication")
    public @ResponseBody String postAuthentication(IdentityRequest identityRequest){

        //Giving permission to user about identity request.
        return identityService.authentication(identityRequest);
    }
}
