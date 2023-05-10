/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class ListEnvVarsResponse {
    
    public String contentType;

    public ListEnvVarsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * A sequence of environment variables.
     */
    
    public ListEnvVarsEnvironmentVariableListResponse environmentVariableListResponse;

    public ListEnvVarsResponse withEnvironmentVariableListResponse(ListEnvVarsEnvironmentVariableListResponse environmentVariableListResponse) {
        this.environmentVariableListResponse = environmentVariableListResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public ListEnvVarsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public ListEnvVarsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Error response.
     */
    
    public ListEnvVarsDefaultApplicationJSON listEnvVarsDefaultApplicationJSONObject;

    public ListEnvVarsResponse withListEnvVarsDefaultApplicationJSONObject(ListEnvVarsDefaultApplicationJSON listEnvVarsDefaultApplicationJSONObject) {
        this.listEnvVarsDefaultApplicationJSONObject = listEnvVarsDefaultApplicationJSONObject;
        return this;
    }
    
    public ListEnvVarsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
