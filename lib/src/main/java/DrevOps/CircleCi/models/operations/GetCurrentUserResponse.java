/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetCurrentUserResponse {
    
    public String contentType;

    public GetCurrentUserResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public GetCurrentUserResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetCurrentUserResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * User login information.
     */
    
    public GetCurrentUserUser user;

    public GetCurrentUserResponse withUser(GetCurrentUserUser user) {
        this.user = user;
        return this;
    }
    
    /**
     * Error response.
     */
    
    public GetCurrentUserDefaultApplicationJSON getCurrentUserDefaultApplicationJSONObject;

    public GetCurrentUserResponse withGetCurrentUserDefaultApplicationJSONObject(GetCurrentUserDefaultApplicationJSON getCurrentUserDefaultApplicationJSONObject) {
        this.getCurrentUserDefaultApplicationJSONObject = getCurrentUserDefaultApplicationJSONObject;
        return this;
    }
    
    public GetCurrentUserResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
