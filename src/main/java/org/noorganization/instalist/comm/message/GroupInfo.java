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
