/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPipelineByNumberPipelineErrors - An error with a type and message.
 */
public class GetPipelineByNumberPipelineErrors {
    /**
     * A human-readable error message.
     */
    @JsonProperty("message")
    public String message;

    public GetPipelineByNumberPipelineErrors withMessage(String message) {
        this.message = message;
        return this;
    }
    
    /**
     * The type of error.
     */
    @JsonProperty("type")
    public GetPipelineByNumberPipelineErrorsTypeEnum type;

    public GetPipelineByNumberPipelineErrors withType(GetPipelineByNumberPipelineErrorsTypeEnum type) {
        this.type = type;
        return this;
    }
    
    public GetPipelineByNumberPipelineErrors(@JsonProperty("message") String message, @JsonProperty("type") GetPipelineByNumberPipelineErrorsTypeEnum type) {
        this.message = message;
        this.type = type;
  }
}
