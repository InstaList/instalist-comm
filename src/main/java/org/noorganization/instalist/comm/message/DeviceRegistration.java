package org.noorganization.instalist.comm.message;

import com.fasterxml.jackson.annotation.*;

/**
 * Created by damihe on 29.01.16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "groupid", "secret", "name" })
public class DeviceRegistration extends EntityObject {

    private String mGroupAuth;

    private String mSecret;

    private String mName;

    @JsonProperty("groupid")
    public String getGroupAuth() {
        return mGroupAuth;
    }

    @JsonProperty("name")
    public String getName() {
        return mName;
    }

    @JsonProperty("secret")
    public String getSecret() {
        return mSecret;
    }

    @JsonProperty("groupid")
    public void setGroupAuth(String _groupAuth) {
        mGroupAuth = _groupAuth;
    }

    public DeviceRegistration withGroupAuth(String _groupAuth) {
        mGroupAuth = _groupAuth;
        return this;
    }

    @JsonProperty("name")
    public void setName(String _name) {
        mName = _name;
    }

    public DeviceRegistration withName(String _name) {
        mName = _name;
        return this;
    }

    @JsonProperty("secret")
    public void setSecret(String _secret) {
        mSecret = _secret;
    }

    public DeviceRegistration withSecret(String _secret) {
        mSecret = _secret;
        return this;
    }
}
