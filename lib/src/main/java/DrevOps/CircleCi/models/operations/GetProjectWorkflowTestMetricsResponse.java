/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetProjectWorkflowTestMetricsResponse {
    
    public String contentType;
    public GetProjectWorkflowTestMetricsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public GetProjectWorkflowTestMetricsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetProjectWorkflowTestMetricsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * A list of test metrics by workflow
     */
    
    public GetProjectWorkflowTestMetrics200ApplicationJSON getProjectWorkflowTestMetrics200ApplicationJSONObject;
    public GetProjectWorkflowTestMetricsResponse withGetProjectWorkflowTestMetrics200ApplicationJSONObject(GetProjectWorkflowTestMetrics200ApplicationJSON getProjectWorkflowTestMetrics200ApplicationJSONObject) {
        this.getProjectWorkflowTestMetrics200ApplicationJSONObject = getProjectWorkflowTestMetrics200ApplicationJSONObject;
        return this;
    }
    
    /**
     * Error response.
     */
    
    public GetProjectWorkflowTestMetricsDefaultApplicationJSON getProjectWorkflowTestMetricsDefaultApplicationJSONObject;
    public GetProjectWorkflowTestMetricsResponse withGetProjectWorkflowTestMetricsDefaultApplicationJSONObject(GetProjectWorkflowTestMetricsDefaultApplicationJSON getProjectWorkflowTestMetricsDefaultApplicationJSONObject) {
        this.getProjectWorkflowTestMetricsDefaultApplicationJSONObject = getProjectWorkflowTestMetricsDefaultApplicationJSONObject;
        return this;
    }
    
    public GetProjectWorkflowTestMetricsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}