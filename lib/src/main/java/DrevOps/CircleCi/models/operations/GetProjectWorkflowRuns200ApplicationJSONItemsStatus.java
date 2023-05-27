/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * GetProjectWorkflowRuns200ApplicationJSONItemsStatus - Workflow status.
 */
public enum GetProjectWorkflowRuns200ApplicationJSONItemsStatus {
    SUCCESS("success"),
    FAILED("failed"),
    ERROR("error"),
    CANCELED("canceled"),
    UNAUTHORIZED("unauthorized");

    @JsonValue
    public final String value;

    private GetProjectWorkflowRuns200ApplicationJSONItemsStatus(String value) {
        this.value = value;
    }
}