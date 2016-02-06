package org.noorganization.instalist.comm.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by damihe on 05.02.16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeviceInfo extends EntityObject {
    private Integer mId;
    private String  mName;
    private Boolean mAuthorized;

    @JsonProperty("id")
    public Integer getId() {
        return mId;
    }

    @JsonProperty("id")
    public void setId(Integer _id) {
        mId = _id;
    }

    public DeviceInfo withId(Integer _id) {
        setId(_id);
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

    public DeviceInfo withName(String _name) {
        setName(_name);
        return this;
    }

    @JsonProperty("authorized")
    public Boolean getAuthorized() {
        return mAuthorized;
    }

    @JsonProperty("authorized")
    public void setAuthorized(Boolean _authorized) {
        mAuthorized = _authorized;
    }

    public DeviceInfo withAuthorized(Boolean _authorized) {
        setAuthorized(_authorized);
        return this;
    }
}
