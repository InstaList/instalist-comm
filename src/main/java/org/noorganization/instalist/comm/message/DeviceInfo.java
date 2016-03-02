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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by damihe on 05.02.16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeviceInfo extends EntityObject {
    private Integer mId;
    private String  mName;
    private Boolean mAuthorized;

    @JsonProperty("id")
    public Integer getId() {
        return mId;
    }

    @JsonProperty("id")
    public void setId(Integer _id) {
        mId = _id;
    }

    public DeviceInfo withId(Integer _id) {
        setId(_id);
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return mName;
    }

    @JsonProperty("name")
    public void setName(String _name) {
        mName = _name;
    }

    public DeviceInfo withName(String _name) {
        setName(_name);
        return this;
    }

    @JsonProperty("authorized")
    public Boolean getAuthorized() {
        return mAuthorized;
    }

    @JsonProperty("authorized")
    public void setAuthorized(Boolean _authorized) {
        mAuthorized = _authorized;
    }

    public DeviceInfo withAuthorized(Boolean _authorized) {
        setAuthorized(_authorized);
        return this;
    }
}
