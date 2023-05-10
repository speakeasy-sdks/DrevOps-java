/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPipelineByIdPipelineErrors - An error with a type and message.
 */
public class GetPipelineByIdPipelineErrors {
    /**
     * A human-readable error message.
     */
    @JsonProperty("message")
    public String message;

    public GetPipelineByIdPipelineErrors withMessage(String message) {
        this.message = message;
        return this;
    }
    
    /**
     * The type of error.
     */
    @JsonProperty("type")
    public GetPipelineByIdPipelineErrorsTypeEnum type;

    public GetPipelineByIdPipelineErrors withType(GetPipelineByIdPipelineErrorsTypeEnum type) {
        this.type = type;
        return this;
    }
    
    public GetPipelineByIdPipelineErrors(@JsonProperty("message") String message, @JsonProperty("type") GetPipelineByIdPipelineErrorsTypeEnum type) {
        this.message = message;
        this.type = type;
  }
}
