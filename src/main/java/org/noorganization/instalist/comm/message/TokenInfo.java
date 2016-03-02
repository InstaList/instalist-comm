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
 * Represents the positive answer for a client asking for a token.
 * Created by damihe on 31.01.16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TokenInfo extends EntityObject {

    @JsonProperty("token")
    public String getToken() {
        return mToken;
    }

    @JsonProperty("token")
    public void setToken(String _token) {
        mToken = _token;
    }

    public TokenInfo withToken(String _token) {
        setToken(_token);
        return this;
    }

    private String mToken;

}
