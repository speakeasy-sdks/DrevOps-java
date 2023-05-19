/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import DrevOps.CircleCi.utils.DateTimeDeserializer;
import DrevOps.CircleCi.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

public class GetWebhooks200ApplicationJSONWebhook {
    /**
     * The date and time the webhook was created.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created-at")
    public OffsetDateTime createdAt;

    public GetWebhooks200ApplicationJSONWebhook withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * Events that will trigger the webhook
     */
    @JsonProperty("events")
    public GetWebhooks200ApplicationJSONWebhookEvents[] events;

    public GetWebhooks200ApplicationJSONWebhook withEvents(GetWebhooks200ApplicationJSONWebhookEvents[] events) {
        this.events = events;
        return this;
    }
    
    /**
     * The unique ID of the webhook
     */
    @JsonProperty("id")
    public String id;

    public GetWebhooks200ApplicationJSONWebhook withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * Name of the webhook
     */
    @JsonProperty("name")
    public String name;

    public GetWebhooks200ApplicationJSONWebhook withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * The scope in which the relevant events that will trigger webhooks
     */
    @JsonProperty("scope")
    public GetWebhooks200ApplicationJSONWebhookScope scope;

    public GetWebhooks200ApplicationJSONWebhook withScope(GetWebhooks200ApplicationJSONWebhookScope scope) {
        this.scope = scope;
        return this;
    }
    
    /**
     * Masked value of the secret used to build an HMAC hash of the payload and passed as a header in the webhook request
     */
    @JsonProperty("signing-secret")
    public String signingSecret;

    public GetWebhooks200ApplicationJSONWebhook withSigningSecret(String signingSecret) {
        this.signingSecret = signingSecret;
        return this;
    }
    
    /**
     * The date and time the webhook was last updated.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated-at")
    public OffsetDateTime updatedAt;

    public GetWebhooks200ApplicationJSONWebhook withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    /**
     * URL to deliver the webhook to. Note: protocol must be included as well (only https is supported)
     */
    @JsonProperty("url")
    public String url;

    public GetWebhooks200ApplicationJSONWebhook withUrl(String url) {
        this.url = url;
        return this;
    }
    
    /**
     * Whether to enforce TLS certificate verification when delivering the webhook
     */
    @JsonProperty("verify-tls")
    public Boolean verifyTls;

    public GetWebhooks200ApplicationJSONWebhook withVerifyTls(Boolean verifyTls) {
        this.verifyTls = verifyTls;
        return this;
    }
    
    public GetWebhooks200ApplicationJSONWebhook(@JsonProperty("created-at") OffsetDateTime createdAt, @JsonProperty("events") GetWebhooks200ApplicationJSONWebhookEvents[] events, @JsonProperty("id") String id, @JsonProperty("name") String name, @JsonProperty("scope") GetWebhooks200ApplicationJSONWebhookScope scope, @JsonProperty("signing-secret") String signingSecret, @JsonProperty("updated-at") OffsetDateTime updatedAt, @JsonProperty("url") String url, @JsonProperty("verify-tls") Boolean verifyTls) {
        this.createdAt = createdAt;
        this.events = events;
        this.id = id;
        this.name = name;
        this.scope = scope;
        this.signingSecret = signingSecret;
        this.updatedAt = updatedAt;
        this.url = url;
        this.verifyTls = verifyTls;
  }
}
