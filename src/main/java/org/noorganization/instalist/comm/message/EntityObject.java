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

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashMap;
import java.util.Map;

/**
 * The entity-object can hold any data.
 * Created by damihe on 31.01.16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntityObject {

    @JsonIgnore
    protected Map<String, Object> mAdditionalAttributes;

    @JsonAnyGetter
    public Map<String, Object> get() {
        return mAdditionalAttributes;
    }

    public Object get(String _key) {
        return mAdditionalAttributes.get(_key);
    }

    @JsonAnySetter
    public void set(String _key, Object _value) {
        mAdditionalAttributes.put(_key, _value);
    }

    public EntityObject() {
        mAdditionalAttributes = new HashMap<String, Object>();
    }
}
