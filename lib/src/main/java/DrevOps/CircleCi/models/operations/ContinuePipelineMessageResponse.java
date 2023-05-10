/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContinuePipelineMessageResponse - message response
 */
public class ContinuePipelineMessageResponse {
    /**
     * A human-readable message
     */
    @JsonProperty("message")
    public String message;

    public ContinuePipelineMessageResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    public ContinuePipelineMessageResponse(@JsonProperty("message") String message) {
        this.message = message;
  }
}
