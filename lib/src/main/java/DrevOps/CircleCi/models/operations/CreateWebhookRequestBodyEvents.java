/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CreateWebhookRequestBodyEvents {
    WORKFLOW_COMPLETED("workflow-completed"),
    JOB_COMPLETED("job-completed");

    @JsonValue
    public final String value;

    private CreateWebhookRequestBodyEvents(String value) {
        this.value = value;
    }
}
