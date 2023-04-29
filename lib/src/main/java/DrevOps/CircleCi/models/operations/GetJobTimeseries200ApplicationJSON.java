/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetJobTimeseries200ApplicationJSON - Project level timeseries metrics response
 */
public class GetJobTimeseries200ApplicationJSON {
    /**
     * Aggregate metrics for a workflow at a time granularity
     */
    @JsonProperty("items")
    public GetJobTimeseries200ApplicationJSONItems[] items;
    public GetJobTimeseries200ApplicationJSON withItems(GetJobTimeseries200ApplicationJSONItems[] items) {
        this.items = items;
        return this;
    }
    
    /**
     * A token to pass as a `page-token` query parameter to return the next page of results.
     */
    @JsonProperty("next_page_token")
    public String nextPageToken;
    public GetJobTimeseries200ApplicationJSON withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    
    public GetJobTimeseries200ApplicationJSON(@JsonProperty("items") GetJobTimeseries200ApplicationJSONItems[] items, @JsonProperty("next_page_token") String nextPageToken) {
        this.items = items;
        this.nextPageToken = nextPageToken;
  }
}
