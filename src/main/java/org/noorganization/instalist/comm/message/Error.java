
package org.noorganization.instalist.comm.message;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "message" })
public class Error extends EntityObject {

    private String mMessage;

    @JsonProperty("message")
    public String getMessage() {
        return mMessage;
    }

    @JsonProperty("mMessage")
    public void setMessage(String _message) {
        mMessage = _message;
    }

    public Error withMessage(String _message) {
        setMessage(_message);
        return this;
    }
}
