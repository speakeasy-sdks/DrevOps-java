/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import DrevOps.CircleCi.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateWebhookRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public UpdateWebhookRequestBody requestBody;
    public UpdateWebhookRequest withRequestBody(UpdateWebhookRequestBody requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * ID of the webhook (UUID)
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=webhook-id")
    public String webhookId;
    public UpdateWebhookRequest withWebhookId(String webhookId) {
        this.webhookId = webhookId;
        return this;
    }
    
    public UpdateWebhookRequest(@JsonProperty("webhook-id") String webhookId) {
        this.webhookId = webhookId;
  }
}