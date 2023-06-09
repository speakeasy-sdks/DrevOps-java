/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeleteScheduleByIdMessageResponse - message response
 */
public class DeleteScheduleByIdMessageResponse {
    /**
     * A human-readable message
     */
    @JsonProperty("message")
    public String message;

    public DeleteScheduleByIdMessageResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    public DeleteScheduleByIdMessageResponse(@JsonProperty("message") String message) {
        this.message = message;
  }
}
