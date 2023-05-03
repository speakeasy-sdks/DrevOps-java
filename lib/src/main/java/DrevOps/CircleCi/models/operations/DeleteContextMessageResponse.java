/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeleteContextMessageResponse - message response
 */
public class DeleteContextMessageResponse {
    /**
     * A human-readable message
     */
    @JsonProperty("message")
    public String message;
    public DeleteContextMessageResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    public DeleteContextMessageResponse(@JsonProperty("message") String message) {
        this.message = message;
  }
}