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

/**
 * CreateWebhookWebhook - A webhook
 */
public class CreateWebhookWebhook {
    /**
     * The date and time the webhook was created.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created-at")
    public OffsetDateTime createdAt;
    public CreateWebhookWebhook withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * Events that will trigger the webhook
     */
    @JsonProperty("events")
    public CreateWebhookWebhookEventsEnum[] events;
    public CreateWebhookWebhook withEvents(CreateWebhookWebhookEventsEnum[] events) {
        this.events = events;
        return this;
    }
    
    /**
     * The unique ID of the webhook
     */
    @JsonProperty("id")
    public String id;
    public CreateWebhookWebhook withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * Name of the webhook
     */
    @JsonProperty("name")
    public String name;
    public CreateWebhookWebhook withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * The scope in which the relevant events that will trigger webhooks
     */
    @JsonProperty("scope")
    public CreateWebhookWebhookScope scope;
    public CreateWebhookWebhook withScope(CreateWebhookWebhookScope scope) {
        this.scope = scope;
        return this;
    }
    
    /**
     * Masked value of the secret used to build an HMAC hash of the payload and passed as a header in the webhook request
     */
    @JsonProperty("signing-secret")
    public String signingSecret;
    public CreateWebhookWebhook withSigningSecret(String signingSecret) {
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
    public CreateWebhookWebhook withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    /**
     * URL to deliver the webhook to. Note: protocol must be included as well (only https is supported)
     */
    @JsonProperty("url")
    public String url;
    public CreateWebhookWebhook withUrl(String url) {
        this.url = url;
        return this;
    }
    
    /**
     * Whether to enforce TLS certificate verification when delivering the webhook
     */
    @JsonProperty("verify-tls")
    public Boolean verifyTls;
    public CreateWebhookWebhook withVerifyTls(Boolean verifyTls) {
        this.verifyTls = verifyTls;
        return this;
    }
    
    public CreateWebhookWebhook(@JsonProperty("created-at") OffsetDateTime createdAt, @JsonProperty("events") CreateWebhookWebhookEventsEnum[] events, @JsonProperty("id") String id, @JsonProperty("name") String name, @JsonProperty("scope") CreateWebhookWebhookScope scope, @JsonProperty("signing-secret") String signingSecret, @JsonProperty("updated-at") OffsetDateTime updatedAt, @JsonProperty("url") String url, @JsonProperty("verify-tls") Boolean verifyTls) {
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
