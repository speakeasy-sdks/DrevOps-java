/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetWebhooks200ApplicationJSONWebhookScope - The scope in which the relevant events that will trigger webhooks
 */
public class GetWebhooks200ApplicationJSONWebhookScope {
    /**
     * ID of the scope being used (at the moment, only project ID is supported)
     */
    @JsonProperty("id")
    public String id;

    public GetWebhooks200ApplicationJSONWebhookScope withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * Type of the scope being used
     */
    @JsonProperty("type")
    public String type;

    public GetWebhooks200ApplicationJSONWebhookScope withType(String type) {
        this.type = type;
        return this;
    }
    
    public GetWebhooks200ApplicationJSONWebhookScope(@JsonProperty("id") String id, @JsonProperty("type") String type) {
        this.id = id;
        this.type = type;
  }
}
