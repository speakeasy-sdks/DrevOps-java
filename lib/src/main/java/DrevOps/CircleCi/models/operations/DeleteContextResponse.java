/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class DeleteContextResponse {
    
    public String contentType;
    public DeleteContextResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * A confirmation message
     */
    
    public DeleteContextMessageResponse messageResponse;
    public DeleteContextResponse withMessageResponse(DeleteContextMessageResponse messageResponse) {
        this.messageResponse = messageResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public DeleteContextResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public DeleteContextResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Error response.
     */
    
    public DeleteContextDefaultApplicationJSON deleteContextDefaultApplicationJSONObject;
    public DeleteContextResponse withDeleteContextDefaultApplicationJSONObject(DeleteContextDefaultApplicationJSON deleteContextDefaultApplicationJSONObject) {
        this.deleteContextDefaultApplicationJSONObject = deleteContextDefaultApplicationJSONObject;
        return this;
    }
    
    public DeleteContextResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
