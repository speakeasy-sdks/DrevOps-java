/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * GetJobDetailsJobDetailsStatusEnum - The current status of the job.
 */
public enum GetJobDetailsJobDetailsStatusEnum {
    SUCCESS("success"),
    RUNNING("running"),
    NOT_RUN("not_run"),
    FAILED("failed"),
    RETRIED("retried"),
    QUEUED("queued"),
    NOT_RUNNING("not_running"),
    INFRASTRUCTURE_FAIL("infrastructure_fail"),
    TIMEDOUT("timedout"),
    ON_HOLD("on_hold"),
    TERMINATED_UNKNOWN("terminated-unknown"),
    BLOCKED("blocked"),
    CANCELED("canceled"),
    UNAUTHORIZED("unauthorized");

    @JsonValue
    public final String value;

    private GetJobDetailsJobDetailsStatusEnum(String value) {
        this.value = value;
    }
}
