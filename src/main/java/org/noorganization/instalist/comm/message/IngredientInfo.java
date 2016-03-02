
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
import com.fasterxml.jackson.databind.util.StdDateFormat;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "uuid", "recipeuuid", "productuuid", "amount", "lastchanged", "deleted" })
public class IngredientInfo extends EntityObject {

    private String  mUUID;
    private String  mRecipeUUID;
    private String  mProductUUID;
    private Float   mAmount;
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

    public IngredientInfo withUUID(String _uuid) {
        setUUID(_uuid);
        return this;
    }

    public IngredientInfo withUUID(UUID _uuid) {
        setUUID(_uuid);
        return this;
    }

    @JsonProperty("recipeuuid")
    public String getRecipeUUID() {
        return mRecipeUUID;
    }

    @JsonProperty("recipeuuid")
    public void setRecipeUUID(String _recipeUUID) {
        mRecipeUUID = _recipeUUID;
    }

    public void setRecipeUUID(UUID _listUUID) {
        mRecipeUUID = (_listUUID != null ? _listUUID.toString() : null);
    }

    public IngredientInfo withRecipeUUID(String _listUUID) {
        setRecipeUUID(_listUUID);
        return this;
    }

    public IngredientInfo withRecipeUUID(UUID _listUUID) {
        setRecipeUUID(_listUUID);
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

    public IngredientInfo withProductUUID(String _productUUID) {
        setProductUUID(_productUUID);
        return this;
    }

    public IngredientInfo withProductUUID(UUID _productUUID) {
        setProductUUID(_productUUID);
        return this;
    }

    @JsonProperty("amount")
    public Float getAmount() {
        return mAmount;
    }

    @JsonProperty("amount")
    public void setAmount(Float amount) {
        mAmount = amount;
    }

    public IngredientInfo withAmount(Float amount) {
        setAmount(amount);
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

    public IngredientInfo withLastChanged(Date _lastChanged) {
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

    public IngredientInfo withDeleted(Boolean _deleted) {
        setDeleted(_deleted);
        return this;
    }

}
