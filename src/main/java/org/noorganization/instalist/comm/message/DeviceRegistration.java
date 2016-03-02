/*
 * Copyright 2016 Tino Siegmund, Michael Wodniok
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
