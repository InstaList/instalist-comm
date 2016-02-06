package org.noorganization.instalist.comm.message;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashMap;
import java.util.Map;

/**
 * The entity-object can hold any data.
 * Created by damihe on 31.01.16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntityObject {

    @JsonIgnore
    protected Map<String, Object> mAdditionalAttributes;

    @JsonAnyGetter
    public Map<String, Object> get() {
        return mAdditionalAttributes;
    }

    public Object get(String _key) {
        return mAdditionalAttributes.get(_key);
    }

    @JsonAnySetter
    public void set(String _key, Object _value) {
        mAdditionalAttributes.put(_key, _value);
    }

    public EntityObject() {
        mAdditionalAttributes = new HashMap<String, Object>();
    }
}
