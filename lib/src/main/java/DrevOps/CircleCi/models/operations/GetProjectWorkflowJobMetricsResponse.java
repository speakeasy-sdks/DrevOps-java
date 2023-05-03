/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetProjectWorkflowJobMetricsResponse {
    
    public String contentType;
    public GetProjectWorkflowJobMetricsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public GetProjectWorkflowJobMetricsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetProjectWorkflowJobMetricsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * A paginated list of summary metrics by workflow job.
     */
    
    public GetProjectWorkflowJobMetrics200ApplicationJSON getProjectWorkflowJobMetrics200ApplicationJSONObject;
    public GetProjectWorkflowJobMetricsResponse withGetProjectWorkflowJobMetrics200ApplicationJSONObject(GetProjectWorkflowJobMetrics200ApplicationJSON getProjectWorkflowJobMetrics200ApplicationJSONObject) {
        this.getProjectWorkflowJobMetrics200ApplicationJSONObject = getProjectWorkflowJobMetrics200ApplicationJSONObject;
        return this;
    }
    
    /**
     * Error response.
     */
    
    public GetProjectWorkflowJobMetricsDefaultApplicationJSON getProjectWorkflowJobMetricsDefaultApplicationJSONObject;
    public GetProjectWorkflowJobMetricsResponse withGetProjectWorkflowJobMetricsDefaultApplicationJSONObject(GetProjectWorkflowJobMetricsDefaultApplicationJSON getProjectWorkflowJobMetricsDefaultApplicationJSONObject) {
        this.getProjectWorkflowJobMetricsDefaultApplicationJSONObject = getProjectWorkflowJobMetricsDefaultApplicationJSONObject;
        return this;
    }
    
    public GetProjectWorkflowJobMetricsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}