/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class CreateContextResponse {
    
    public String contentType;

    public CreateContextResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * The new context
     */
    
    public CreateContextContext context;

    public CreateContextResponse withContext(CreateContextContext context) {
        this.context = context;
        return this;
    }
    
    
    public Integer statusCode;

    public CreateContextResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public CreateContextResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Error response.
     */
    
    public CreateContextDefaultApplicationJSON createContextDefaultApplicationJSONObject;

    public CreateContextResponse withCreateContextDefaultApplicationJSONObject(CreateContextDefaultApplicationJSON createContextDefaultApplicationJSONObject) {
        this.createContextDefaultApplicationJSONObject = createContextDefaultApplicationJSONObject;
        return this;
    }
    
    public CreateContextResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
