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

import com.fasterxml.jackson.annotation.JsonProperty;

public class GroupInfo extends EntityObject {
    private String  mReadableId;
    private Integer mId;

    @JsonProperty("accesskey")
    public String getReadableId() {
        return mReadableId;
    }

    @JsonProperty("accesskey")
    public void setReadableId(String _readableId) {
        mReadableId = _readableId;
    }

    public GroupInfo withReadableId(String _id) {
        mReadableId = _id;
        return this;
    }

    @JsonProperty("id")
    public Integer getId() {
        return mId;
    }

    @JsonProperty("id")
    public void setId(Integer _id) {
        mId = _id;
    }

    public GroupInfo withId(Integer _id) {
        setId(_id);
        return this;
    }
}
