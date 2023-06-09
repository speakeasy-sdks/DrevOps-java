/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetProjectWorkflowJobMetrics200ApplicationJSON - Paginated workflow job summary metrics.
 */
public class GetProjectWorkflowJobMetrics200ApplicationJSON {
    /**
     * Job summary metrics.
     */
    @JsonProperty("items")
    public GetProjectWorkflowJobMetrics200ApplicationJSONItems[] items;

    public GetProjectWorkflowJobMetrics200ApplicationJSON withItems(GetProjectWorkflowJobMetrics200ApplicationJSONItems[] items) {
        this.items = items;
        return this;
    }
    
    /**
     * A token to pass as a `page-token` query parameter to return the next page of results.
     */
    @JsonProperty("next_page_token")
    public String nextPageToken;

    public GetProjectWorkflowJobMetrics200ApplicationJSON withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    
    public GetProjectWorkflowJobMetrics200ApplicationJSON(@JsonProperty("items") GetProjectWorkflowJobMetrics200ApplicationJSONItems[] items, @JsonProperty("next_page_token") String nextPageToken) {
        this.items = items;
        this.nextPageToken = nextPageToken;
  }
}
