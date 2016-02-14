
package org.noorganization.instalist.comm.message;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.util.StdDateFormat;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "uuid", "name", "lastchanged", "deleted" })
public class RecipeInfo {

    private String  mUUID;
    private String  mName;
    private Date    mLastChanged;
    private Boolean mDeleted;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public RecipeInfo withUUID(String _uuid) {
        setUUID(_uuid);
        return this;
    }

    public RecipeInfo withUUID(UUID _uuid) {
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

    public RecipeInfo withName(String name) {
        setName(name);
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

    public RecipeInfo withLastChanged(Date _lastChanged) {
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

    public RecipeInfo withDeleted(Boolean _deleted) {
        setDeleted(_deleted);
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public RecipeInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
