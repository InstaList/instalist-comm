
package org.noorganization.instalist.comm.message;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.util.StdDateFormat;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "uuid", "name", "unituuid", "defaultamount", "stepamount", "lastchanged",
        "deleted" })
public class ProductInfo extends EntityObject {

    private String mUUID;
    private String mName;
    private String mUnitUUID;
    private Float mDefaultAmount;
    private Float mStepAmount;
    private Date mLastChanged;
    private Boolean mDeleted;
    private Boolean mRemoveUnit;

    @JsonProperty("uuid")
    public String getUUID() {
        return mUUID;
    }

    @JsonProperty("uuid")
    public void setUUID(String id) {
        this.mUUID = id;
    }

    public void setUUID(UUID _uuid) {
        setUUID(_uuid != null ? _uuid.toString() : null);
    }

    public ProductInfo withUUID(String _uuid) {
        setUUID(_uuid);
        return this;
    }

    public ProductInfo withUUID(UUID _uuid) {
        setUUID(_uuid);
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

    public ProductInfo withName(String name) {
        setName(name);
        return this;
    }

    @JsonProperty("defaultamount")
    public Float getDefaultAmount() {
        return mDefaultAmount;
    }

    @JsonProperty("defaultamount")
    public void setDefaultAmount(Float _defaultAmount) {
        mDefaultAmount = _defaultAmount;
    }

    public ProductInfo withDefaultAmount(Float _defaultAmount) {
        setDefaultAmount(_defaultAmount);
        return this;
    }

    @JsonProperty("stepamount")
    public Float getStepAmount() {
        return mStepAmount;
    }

    @JsonProperty("stepamount")
    public void setStepAmount(Float _stepAmount) {
        mStepAmount = _stepAmount;
    }

    public ProductInfo withStepAmount(Float _stepAmount) {
        setStepAmount(_stepAmount);
        return this;
    }

    @JsonProperty("unituuid")
    public String getUnitUUID() {
        return mUnitUUID;
    }

    @JsonProperty("unituuid")
    public void setUnitUUID(String _uuid) {
        mUnitUUID = _uuid;
    }

    public void setUnitUUID(UUID _uuid) {
        setUnitUUID(_uuid != null ? _uuid.toString() : null);
    }

    public ProductInfo withUnitUUID(String _uuid) {
        setUnitUUID(_uuid);
        return this;
    }

    public ProductInfo withUnitUUID(UUID _uuid) {
        setUnitUUID(_uuid);
        return this;
    }

    @JsonProperty("removeunit")
    public Boolean getRemoveUnit() {
        return mRemoveUnit;
    }

    @JsonProperty("removeunit")
    public void setRemoveUnit(Boolean _removeUnit) {
        mRemoveUnit = _removeUnit;
    }

    public ProductInfo withRemoveUnit(Boolean _removeUnit) {
        setRemoveUnit(_removeUnit);
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

    public ProductInfo withLastChanged(Date _lastChanged) {
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

    public ProductInfo withDeleted(Boolean _deleted) {
        setDeleted(_deleted);
        return this;
    }

}
