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

public class GetProjectWorkflowRuns200ApplicationJSONItems {
    /**
     * The VCS branch of a Workflow's trigger.
     */
    @JsonProperty("branch")
    public String branch;

    public GetProjectWorkflowRuns200ApplicationJSONItems withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    /**
     * The date and time the workflow was created.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public GetProjectWorkflowRuns200ApplicationJSONItems withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * The number of credits used during execution. Note that Insights is not a real time financial reporting tool and should not be used for credit reporting.
     */
    @JsonProperty("credits_used")
    public Long creditsUsed;

    public GetProjectWorkflowRuns200ApplicationJSONItems withCreditsUsed(Long creditsUsed) {
        this.creditsUsed = creditsUsed;
        return this;
    }
    
    /**
     * The duration in seconds of a run.
     */
    @JsonProperty("duration")
    public Long duration;

    public GetProjectWorkflowRuns200ApplicationJSONItems withDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    
    /**
     * The unique ID of the workflow.
     */
    @JsonProperty("id")
    public String id;

    public GetProjectWorkflowRuns200ApplicationJSONItems withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * Workflow status.
     */
    @JsonProperty("status")
    public GetProjectWorkflowRuns200ApplicationJSONItemsStatus status;

    public GetProjectWorkflowRuns200ApplicationJSONItems withStatus(GetProjectWorkflowRuns200ApplicationJSONItemsStatus status) {
        this.status = status;
        return this;
    }
    
    /**
     * The date and time the workflow stopped.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("stopped_at")
    public OffsetDateTime stoppedAt;

    public GetProjectWorkflowRuns200ApplicationJSONItems withStoppedAt(OffsetDateTime stoppedAt) {
        this.stoppedAt = stoppedAt;
        return this;
    }
    
    public GetProjectWorkflowRuns200ApplicationJSONItems(@JsonProperty("branch") String branch, @JsonProperty("created_at") OffsetDateTime createdAt, @JsonProperty("credits_used") Long creditsUsed, @JsonProperty("duration") Long duration, @JsonProperty("id") String id, @JsonProperty("status") GetProjectWorkflowRuns200ApplicationJSONItemsStatus status, @JsonProperty("stopped_at") OffsetDateTime stoppedAt) {
        this.branch = branch;
        this.createdAt = createdAt;
        this.creditsUsed = creditsUsed;
        this.duration = duration;
        this.id = id;
        this.status = status;
        this.stoppedAt = stoppedAt;
  }
}
