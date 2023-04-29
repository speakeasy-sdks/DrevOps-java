/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWebhookRequestBodyScope - The scope in which the relevant events that will trigger webhooks
 */
public class CreateWebhookRequestBodyScope {
    /**
     * ID of the scope being used (at the moment, only project ID is supported)
     */
    @JsonProperty("id")
    public String id;
    public CreateWebhookRequestBodyScope withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * Type of the scope being used
     */
    @JsonProperty("type")
    public CreateWebhookRequestBodyScopeTypeEnum type;
    public CreateWebhookRequestBodyScope withType(CreateWebhookRequestBodyScopeTypeEnum type) {
        this.type = type;
        return this;
    }
    
    public CreateWebhookRequestBodyScope(@JsonProperty("id") String id, @JsonProperty("type") CreateWebhookRequestBodyScopeTypeEnum type) {
        this.id = id;
        this.type = type;
  }
}
