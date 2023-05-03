/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetFlakyTestsResponse {
    
    public String contentType;
    public GetFlakyTestsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public GetFlakyTestsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetFlakyTestsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * A list of flaky tests for a project
     */
    
    public GetFlakyTests200ApplicationJSON getFlakyTests200ApplicationJSONObject;
    public GetFlakyTestsResponse withGetFlakyTests200ApplicationJSONObject(GetFlakyTests200ApplicationJSON getFlakyTests200ApplicationJSONObject) {
        this.getFlakyTests200ApplicationJSONObject = getFlakyTests200ApplicationJSONObject;
        return this;
    }
    
    /**
     * Error response.
     */
    
    public GetFlakyTestsDefaultApplicationJSON getFlakyTestsDefaultApplicationJSONObject;
    public GetFlakyTestsResponse withGetFlakyTestsDefaultApplicationJSONObject(GetFlakyTestsDefaultApplicationJSON getFlakyTestsDefaultApplicationJSONObject) {
        this.getFlakyTestsDefaultApplicationJSONObject = getFlakyTestsDefaultApplicationJSONObject;
        return this;
    }
    
    public GetFlakyTestsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}