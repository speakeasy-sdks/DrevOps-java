/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetProjectWorkflowsPageDataResponse {
    
    public String contentType;

    public GetProjectWorkflowsPageDataResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public GetProjectWorkflowsPageDataResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetProjectWorkflowsPageDataResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Aggregated summary metrics and trends by workflow and branches
     */
    
    public GetProjectWorkflowsPageData200ApplicationJSON getProjectWorkflowsPageData200ApplicationJSONObject;

    public GetProjectWorkflowsPageDataResponse withGetProjectWorkflowsPageData200ApplicationJSONObject(GetProjectWorkflowsPageData200ApplicationJSON getProjectWorkflowsPageData200ApplicationJSONObject) {
        this.getProjectWorkflowsPageData200ApplicationJSONObject = getProjectWorkflowsPageData200ApplicationJSONObject;
        return this;
    }
    
    /**
     * Error response.
     */
    
    public GetProjectWorkflowsPageDataDefaultApplicationJSON getProjectWorkflowsPageDataDefaultApplicationJSONObject;

    public GetProjectWorkflowsPageDataResponse withGetProjectWorkflowsPageDataDefaultApplicationJSONObject(GetProjectWorkflowsPageDataDefaultApplicationJSON getProjectWorkflowsPageDataDefaultApplicationJSONObject) {
        this.getProjectWorkflowsPageDataDefaultApplicationJSONObject = getProjectWorkflowsPageDataDefaultApplicationJSONObject;
        return this;
    }
    
    public GetProjectWorkflowsPageDataResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
