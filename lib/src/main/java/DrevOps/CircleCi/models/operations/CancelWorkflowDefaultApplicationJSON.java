/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CancelWorkflowDefaultApplicationJSON - Error response.
 */
public class CancelWorkflowDefaultApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;
    public CancelWorkflowDefaultApplicationJSON withMessage(String message) {
        this.message = message;
        return this;
    }
    
    public CancelWorkflowDefaultApplicationJSON(){}
}
