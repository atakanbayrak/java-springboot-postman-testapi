package com.postman.test.controller;

import com.postman.test.requests.AuthorizationRequest;
import com.postman.test.service.AccessTokenService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/access")
public class AccessTokenController {




    AccessTokenService accessService = new AccessTokenService();

    @PostMapping(value ="/token", produces = "application/x-www-form-urlencoded")
    public @ResponseBody String postAccessToken(AuthorizationRequest authorizationRequest){
        //Giving access token to user.
        return accessService.giveAccessToken(authorizationRequest);
    }
}
