/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetWorkflowByIdDefaultApplicationJSON - Error response.
 */
public class GetWorkflowByIdDefaultApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;

    public GetWorkflowByIdDefaultApplicationJSON withMessage(String message) {
        this.message = message;
        return this;
    }
    
    public GetWorkflowByIdDefaultApplicationJSON(){}
}
