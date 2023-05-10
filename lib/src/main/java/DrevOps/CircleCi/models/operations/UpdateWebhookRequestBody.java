/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateWebhookRequestBody - The parameters for an update webhook request
 */
public class UpdateWebhookRequestBody {
    /**
     * Events that will trigger the webhook
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("events")
    public UpdateWebhookRequestBodyEventsEnum[] events;

    public UpdateWebhookRequestBody withEvents(UpdateWebhookRequestBodyEventsEnum[] events) {
        this.events = events;
        return this;
    }
    
    /**
     * Name of the webhook
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public UpdateWebhookRequestBody withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * Secret used to build an HMAC hash of the payload and passed as a header in the webhook request
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("signing-secret")
    public String signingSecret;

    public UpdateWebhookRequestBody withSigningSecret(String signingSecret) {
        this.signingSecret = signingSecret;
        return this;
    }
    
    /**
     * URL to deliver the webhook to. Note: protocol must be included as well (only https is supported)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    public String url;

    public UpdateWebhookRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }
    
    /**
     * Whether to enforce TLS certificate verification when delivering the webhook
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("verify-tls")
    public Boolean verifyTls;

    public UpdateWebhookRequestBody withVerifyTls(Boolean verifyTls) {
        this.verifyTls = verifyTls;
        return this;
    }
    
    public UpdateWebhookRequestBody(){}
}
