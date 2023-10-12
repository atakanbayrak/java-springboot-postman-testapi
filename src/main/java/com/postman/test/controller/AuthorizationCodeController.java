package com.postman.test.controller;

import com.postman.test.requests.UserRequest;
import com.postman.test.service.AuthorizationCodeService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/authorization")
public class AuthorizationCodeController {

    AuthorizationCodeService authorizationCodeService = new AuthorizationCodeService();

    @PostMapping(value = "/code")
    public @ResponseBody String postAuthData(UserRequest userRequest){

        //ArrayList<UserRequest> userDataListPost = new ArrayList<>();
        //userDataListPost.add(new UserRequest(userRequest.getGrant_type(), userRequest.getClient_id(), userRequest.getClient_secret(), userRequest.getCode(), userRequest.getRedirect_uri(), userRequest.getCode_verifier()));

        //Giving authorization token to user.
        return authorizationCodeService.giveAuthToken(userRequest);
    }



}
