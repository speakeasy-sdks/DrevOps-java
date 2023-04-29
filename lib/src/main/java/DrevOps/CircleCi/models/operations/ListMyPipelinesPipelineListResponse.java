/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListMyPipelinesPipelineListResponse - List of pipelines
 */
public class ListMyPipelinesPipelineListResponse {
    @JsonProperty("items")
    public ListMyPipelinesPipelineListResponsePipeline[] items;
    public ListMyPipelinesPipelineListResponse withItems(ListMyPipelinesPipelineListResponsePipeline[] items) {
        this.items = items;
        return this;
    }
    
    /**
     * A token to pass as a `page-token` query parameter to return the next page of results.
     */
    @JsonProperty("next_page_token")
    public String nextPageToken;
    public ListMyPipelinesPipelineListResponse withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    
    public ListMyPipelinesPipelineListResponse(@JsonProperty("items") ListMyPipelinesPipelineListResponsePipeline[] items, @JsonProperty("next_page_token") String nextPageToken) {
        this.items = items;
        this.nextPageToken = nextPageToken;
  }
}
