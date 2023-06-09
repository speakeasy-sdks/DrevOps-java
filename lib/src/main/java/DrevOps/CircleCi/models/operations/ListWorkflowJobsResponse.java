/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class ListWorkflowJobsResponse {
    
    public String contentType;

    public ListWorkflowJobsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public ListWorkflowJobsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public ListWorkflowJobsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * A paginated sequence of jobs.
     */
    
    public ListWorkflowJobsWorkflowJobListResponse workflowJobListResponse;

    public ListWorkflowJobsResponse withWorkflowJobListResponse(ListWorkflowJobsWorkflowJobListResponse workflowJobListResponse) {
        this.workflowJobListResponse = workflowJobListResponse;
        return this;
    }
    
    /**
     * Error response.
     */
    
    public ListWorkflowJobsDefaultApplicationJSON listWorkflowJobsDefaultApplicationJSONObject;

    public ListWorkflowJobsResponse withListWorkflowJobsDefaultApplicationJSONObject(ListWorkflowJobsDefaultApplicationJSON listWorkflowJobsDefaultApplicationJSONObject) {
        this.listWorkflowJobsDefaultApplicationJSONObject = listWorkflowJobsDefaultApplicationJSONObject;
        return this;
    }
    
    public ListWorkflowJobsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
