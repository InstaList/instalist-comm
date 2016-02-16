
package org.noorganization.instalist.comm.message;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.util.StdDateFormat;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "uuid", "listuuid", "productuuid", "amount", "priority", "struck",
                           "lastchanged", "deleted" })
public class EntryInfo extends EntityObject {

    private String  mUUID;
    private String  mListUUID;
    private String  mProductUUID;
    private Float   mAmount;
    private Integer mPriority;
    private Boolean mStruck;
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

    public EntryInfo withUUID(String _uuid) {
        setUUID(_uuid);
        return this;
    }

    public EntryInfo withUUID(UUID _uuid) {
        setUUID(_uuid);
        return this;
    }

    @JsonProperty("listuuid")
    public String getListUUID() {
        return mListUUID;
    }

    @JsonProperty("listuuid")
    public void setListUUID(String _listUUID) {
        mListUUID = _listUUID;
    }

    public void setListUUID(UUID _listUUID) {
        mListUUID = (_listUUID != null ? _listUUID.toString() : null);
    }

    public EntryInfo withListUUID(String _listUUID) {
        setListUUID(_listUUID);
        return this;
    }

    public EntryInfo withListUUID(UUID _listUUID) {
        setListUUID(_listUUID);
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

    public EntryInfo withProductUUID(String _productUUID) {
        setProductUUID(_productUUID);
        return this;
    }

    public EntryInfo withProductUUID(UUID _productUUID) {
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

    public EntryInfo withAmount(Float amount) {
        setAmount(amount);
        return this;
    }

    @JsonProperty("priority")
    public Integer getPriority() {
        return mPriority;
    }

    @JsonProperty("priority")
    public void setPriority(Integer _priority) {
        mPriority = _priority;
    }

    public EntryInfo withPriority(Integer _priority) {
        setPriority(_priority);
        return this;
    }

    @JsonProperty("struck")
    public Boolean getStruck() {
        return mStruck;
    }

    @JsonProperty("struck")
    public void setStruck(Boolean _struck) {
        mStruck = _struck;
    }

    public EntryInfo withStruck(Boolean _struck) {
        setStruck(_struck);
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

    public EntryInfo withLastChanged(Date _lastChanged) {
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

    public EntryInfo withDeleted(Boolean _deleted) {
        setDeleted(_deleted);
        return this;
    }

}
