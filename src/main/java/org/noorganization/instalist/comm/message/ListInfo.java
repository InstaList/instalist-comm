package org.noorganization.instalist.comm.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.noorganization.instalist.comm.support.DateHelper;

import java.util.Date;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"uuid","name","categoryuuid","lastchanged","deleted"})
public class ListInfo {

    private String mUUID;
    private String mName;
    private String mLastChanged;
    private String mCategoryUUID;
    private Boolean mDeleted;

    @JsonProperty("uuid")
    public String getUUID() {
        return mUUID;
    }

    @JsonProperty("uuid")
    public void setUUID(String _uuid) {
        this.mUUID = _uuid;
    }

    public void setUUID(UUID _uuid) {
        setUUID(_uuid.toString());
    }

    public ListInfo withUUID(String _uuid) {
        setUUID(_uuid);
        return this;
    }

    public ListInfo withUUID(UUID _uuid) {
        setUUID(_uuid.toString());
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return mName;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.mName = name;
    }

    public ListInfo withName(String name) {
        this.mName = name;
        return this;
    }

    @JsonProperty("lastchanged")
    public String getLastChanged() {
        return mLastChanged;
    }

    @JsonProperty("lastchanged")
    public void setLastChanged(String lastChanged) {
        this.mLastChanged = lastChanged;
    }

    public void setLastChanged(Date _lastChanged) {
        this.mLastChanged = DateHelper.writeDate(_lastChanged);
    }

    public ListInfo withLastChanged(String lastChanged) {
        this.mLastChanged = lastChanged;
        return this;
    }

    public ListInfo withLastChanged(Date _lastChanged) {
        this.mLastChanged = DateHelper.writeDate(_lastChanged);
        return this;
    }

    @JsonProperty("categoryuuid")
    public String getCategoryUUID() {
        return mCategoryUUID;
    }

    @JsonProperty("categoryuuid")
    public void setCategoryUUID(String _categoryUUID) {
        mCategoryUUID = _categoryUUID;
    }

    public ListInfo withCategoryUUID(String _uuid) {
        setCategoryUUID(_uuid);
        return this;
    }

    public ListInfo withCategoryUUID(UUID _uuid) {
        setCategoryUUID(_uuid.toString());
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

    public ListInfo withDeleted(Boolean _deleted) {
        mDeleted = _deleted;
        return this;
    }
}
