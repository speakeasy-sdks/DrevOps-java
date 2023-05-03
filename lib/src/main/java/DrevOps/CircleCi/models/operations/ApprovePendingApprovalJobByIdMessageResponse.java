/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApprovePendingApprovalJobByIdMessageResponse - message response
 */
public class ApprovePendingApprovalJobByIdMessageResponse {
    /**
     * A human-readable message
     */
    @JsonProperty("message")
    public String message;
    public ApprovePendingApprovalJobByIdMessageResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    public ApprovePendingApprovalJobByIdMessageResponse(@JsonProperty("message") String message) {
        this.message = message;
  }
}