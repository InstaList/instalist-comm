
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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.util.StdDateFormat;

import java.util.Date;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "uuid", "recipeuuid", "productuuid", "lastchanged", "deleted" })
public class TaggedProductInfo extends EntityObject {

    private String  mUUID;
    private String  mTagUUID;
    private String  mProductUUID;
    private Date    mLastChanged;
    private Boolean mDeleted;

    @JsonProperty("uuid")
    public String getUUID() {
        return mUUID;
    }

    @JsonProperty("uuid")
    public void setUUID(String id) {
        this.mUUID = id;
    }

    public void setUUID(UUID _uuid) {
        mUUID = (_uuid != null ? _uuid.toString() : null);
    }

    public TaggedProductInfo withUUID(String _uuid) {
        setUUID(_uuid);
        return this;
    }

    public TaggedProductInfo withUUID(UUID _uuid) {
        setUUID(_uuid);
        return this;
    }

    @JsonProperty("taguuid")
    public String getTagUUID() {
        return mTagUUID;
    }

    @JsonProperty("taguuid")
    public void setTagUUID(String _tagUUID) {
        mTagUUID = _tagUUID;
    }

    public void setTagUUID(UUID _tagUUID) {
        mTagUUID = (_tagUUID != null ? _tagUUID.toString() : null);
    }

    public TaggedProductInfo withTagUUID(String _tagUUID) {
        setTagUUID(_tagUUID);
        return this;
    }

    public TaggedProductInfo withTagUUID(UUID _tagUUID) {
        setTagUUID(_tagUUID);
        return this;
    }

    @JsonProperty("productuuid")
    public String getProductUUID() {
        return mProductUUID;
    }

    @JsonProperty("productuuid")
    public void setProductUUID(String _productUUID) {
        mProductUUID = _productUUID;
    }

    public void setProductUUID(UUID _productUUID) {
        mProductUUID = (_productUUID != null ? _productUUID.toString() : null);
    }

    public TaggedProductInfo withProductUUID(String _productUUID) {
        setProductUUID(_productUUID);
        return this;
    }

    public TaggedProductInfo withProductUUID(UUID _productUUID) {
        setProductUUID(_productUUID);
        return this;
    }

    @JsonProperty("lastchanged")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = StdDateFormat.DATE_FORMAT_STR_ISO8601)
    public Date getLastChanged() {
        return mLastChanged;
    }

    @JsonProperty("lastchanged")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = StdDateFormat.DATE_FORMAT_STR_ISO8601)
    public void setLastChanged(Date _lastChanged) {
        mLastChanged = _lastChanged;
    }

    public TaggedProductInfo withLastChanged(Date _lastChanged) {
        setLastChanged(_lastChanged);
        return this;
    }

    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return mDeleted;
    }

    @JsonProperty("deleted")
    public void setDeleted(Boolean _deleted) {
        mDeleted = _deleted;
    }

    public TaggedProductInfo withDeleted(Boolean _deleted) {
        setDeleted(_deleted);
        return this;
    }

}
