package com.postman.test.requests;

public class IdentityRequest {

    private String resourceId;
    private String scope;


    public IdentityRequest(String resourceId, String scope){
        this.resourceId = resourceId;
        this.scope = scope;
    }
    public IdentityRequest(){

    }
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
