/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListEnvironmentVariablesFromContext200ApplicationJSON - A paginated list of environment variables
 */
public class ListEnvironmentVariablesFromContext200ApplicationJSON {
    @JsonProperty("items")
    public ListEnvironmentVariablesFromContext200ApplicationJSONItems[] items;
    public ListEnvironmentVariablesFromContext200ApplicationJSON withItems(ListEnvironmentVariablesFromContext200ApplicationJSONItems[] items) {
        this.items = items;
        return this;
    }
    
    /**
     * A token to pass as a `page-token` query parameter to return the next page of results.
     */
    @JsonProperty("next_page_token")
    public String nextPageToken;
    public ListEnvironmentVariablesFromContext200ApplicationJSON withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    
    public ListEnvironmentVariablesFromContext200ApplicationJSON(@JsonProperty("items") ListEnvironmentVariablesFromContext200ApplicationJSONItems[] items, @JsonProperty("next_page_token") String nextPageToken) {
        this.items = items;
        this.nextPageToken = nextPageToken;
  }
}
