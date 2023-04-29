/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetWebhookByIdWebhookScope - The scope in which the relevant events that will trigger webhooks
 */
public class GetWebhookByIdWebhookScope {
    /**
     * ID of the scope being used (at the moment, only project ID is supported)
     */
    @JsonProperty("id")
    public String id;
    public GetWebhookByIdWebhookScope withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * Type of the scope being used
     */
    @JsonProperty("type")
    public String type;
    public GetWebhookByIdWebhookScope withType(String type) {
        this.type = type;
        return this;
    }
    
    public GetWebhookByIdWebhookScope(@JsonProperty("id") String id, @JsonProperty("type") String type) {
        this.id = id;
        this.type = type;
  }
}
