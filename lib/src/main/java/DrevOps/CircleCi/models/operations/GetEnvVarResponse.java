/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetEnvVarResponse {
    
    public String contentType;
    public GetEnvVarResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * The environment variable.
     */
    
    public GetEnvVarEnvironmentVariablePair environmentVariablePair;
    public GetEnvVarResponse withEnvironmentVariablePair(GetEnvVarEnvironmentVariablePair environmentVariablePair) {
        this.environmentVariablePair = environmentVariablePair;
        return this;
    }
    
    
    public Integer statusCode;
    public GetEnvVarResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetEnvVarResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Error response.
     */
    
    public GetEnvVarDefaultApplicationJSON getEnvVarDefaultApplicationJSONObject;
    public GetEnvVarResponse withGetEnvVarDefaultApplicationJSONObject(GetEnvVarDefaultApplicationJSON getEnvVarDefaultApplicationJSONObject) {
        this.getEnvVarDefaultApplicationJSONObject = getEnvVarDefaultApplicationJSONObject;
        return this;
    }
    
    public GetEnvVarResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
