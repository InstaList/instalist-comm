package org.noorganization.instalist.comm.message;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.util.StdDateFormat;

import java.util.Date;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"uuid","name","categoryuuid","lastchanged","deleted"})
public class ListInfo {

    private String mUUID;
    private String mName;
    private Date mLastChanged;
    private String mCategoryUUID;
    private Boolean mRemoveCategory;
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = StdDateFormat.DATE_FORMAT_STR_ISO8601)
    public Date getLastChanged() {
        return mLastChanged;
    }

    @JsonProperty("lastchanged")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = StdDateFormat.DATE_FORMAT_STR_ISO8601)
    public void setLastChanged(Date _lastChanged) {
        mLastChanged = _lastChanged;
    }

    public ListInfo withLastChanged(Date _lastChanged) {
        setLastChanged(_lastChanged);
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

    public void setCategoryUUID(UUID _categoryUUID) {
        mCategoryUUID = _categoryUUID.toString();
    }

    public ListInfo withCategoryUUID(String _uuid) {
        setCategoryUUID(_uuid);
        return this;
    }

    public ListInfo withCategoryUUID(UUID _uuid) {
        setCategoryUUID(_uuid.toString());
        return this;
    }

    @JsonProperty("removecategory")
    public Boolean getRemoveCategory() {
        return mRemoveCategory;
    }

    @JsonProperty("removecategory")
    public void setRemoveCategory(Boolean _removeCat) {
        mRemoveCategory = _removeCat;
    }

    public ListInfo withRemoveCategory(Boolean _removeCat) {
        setRemoveCategory(_removeCat);
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
