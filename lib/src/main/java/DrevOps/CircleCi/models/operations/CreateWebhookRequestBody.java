/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWebhookRequestBody - The parameters for a create webhook request
 */
public class CreateWebhookRequestBody {
    /**
     * Events that will trigger the webhook
     */
    @JsonProperty("events")
    public CreateWebhookRequestBodyEvents[] events;

    public CreateWebhookRequestBody withEvents(CreateWebhookRequestBodyEvents[] events) {
        this.events = events;
        return this;
    }
    
    /**
     * Name of the webhook
     */
    @JsonProperty("name")
    public String name;

    public CreateWebhookRequestBody withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * The scope in which the relevant events that will trigger webhooks
     */
    @JsonProperty("scope")
    public CreateWebhookRequestBodyScope scope;

    public CreateWebhookRequestBody withScope(CreateWebhookRequestBodyScope scope) {
        this.scope = scope;
        return this;
    }
    
    /**
     * Secret used to build an HMAC hash of the payload and passed as a header in the webhook request
     */
    @JsonProperty("signing-secret")
    public String signingSecret;

    public CreateWebhookRequestBody withSigningSecret(String signingSecret) {
        this.signingSecret = signingSecret;
        return this;
    }
    
    /**
     * URL to deliver the webhook to. Note: protocol must be included as well (only https is supported)
     */
    @JsonProperty("url")
    public String url;

    public CreateWebhookRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }
    
    /**
     * Whether to enforce TLS certificate verification when delivering the webhook
     */
    @JsonProperty("verify-tls")
    public Boolean verifyTls;

    public CreateWebhookRequestBody withVerifyTls(Boolean verifyTls) {
        this.verifyTls = verifyTls;
        return this;
    }
    
    public CreateWebhookRequestBody(@JsonProperty("events") CreateWebhookRequestBodyEvents[] events, @JsonProperty("name") String name, @JsonProperty("scope") CreateWebhookRequestBodyScope scope, @JsonProperty("signing-secret") String signingSecret, @JsonProperty("url") String url, @JsonProperty("verify-tls") Boolean verifyTls) {
        this.events = events;
        this.name = name;
        this.scope = scope;
        this.signingSecret = signingSecret;
        this.url = url;
        this.verifyTls = verifyTls;
  }
}
