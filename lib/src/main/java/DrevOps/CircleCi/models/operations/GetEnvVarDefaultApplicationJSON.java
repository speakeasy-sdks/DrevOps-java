/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetEnvVarDefaultApplicationJSON - Error response.
 */
public class GetEnvVarDefaultApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;
    public GetEnvVarDefaultApplicationJSON withMessage(String message) {
        this.message = message;
        return this;
    }
    
    public GetEnvVarDefaultApplicationJSON(){}
}