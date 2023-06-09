/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class ContinuePipelineResponse {
    
    public String contentType;

    public ContinuePipelineResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * A confirmation message.
     */
    
    public ContinuePipelineMessageResponse messageResponse;

    public ContinuePipelineResponse withMessageResponse(ContinuePipelineMessageResponse messageResponse) {
        this.messageResponse = messageResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public ContinuePipelineResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public ContinuePipelineResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Error response.
     */
    
    public ContinuePipelineDefaultApplicationJSON continuePipelineDefaultApplicationJSONObject;

    public ContinuePipelineResponse withContinuePipelineDefaultApplicationJSONObject(ContinuePipelineDefaultApplicationJSON continuePipelineDefaultApplicationJSONObject) {
        this.continuePipelineDefaultApplicationJSONObject = continuePipelineDefaultApplicationJSONObject;
        return this;
    }
    
    public ContinuePipelineResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
