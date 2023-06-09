/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetProjectWorkflowsPageData200ApplicationJSONProjectWorkflowBranchDataMetrics - Metrics aggregated across a workflow or branchfor a project.
 */
public class GetProjectWorkflowsPageData200ApplicationJSONProjectWorkflowBranchDataMetrics {
    /**
     * The 95th percentile duration among a group of workflow runs.
     */
    @JsonProperty("p95_duration_secs")
    public Float p95DurationSecs;

    public GetProjectWorkflowsPageData200ApplicationJSONProjectWorkflowBranchDataMetrics withP95DurationSecs(Float p95DurationSecs) {
        this.p95DurationSecs = p95DurationSecs;
        return this;
    }
    
    @JsonProperty("success_rate")
    public Float successRate;

    public GetProjectWorkflowsPageData200ApplicationJSONProjectWorkflowBranchDataMetrics withSuccessRate(Float successRate) {
        this.successRate = successRate;
        return this;
    }
    
    /**
     * The total credits consumed over the current timeseries interval.
     */
    @JsonProperty("total_credits_used")
    public Long totalCreditsUsed;

    public GetProjectWorkflowsPageData200ApplicationJSONProjectWorkflowBranchDataMetrics withTotalCreditsUsed(Long totalCreditsUsed) {
        this.totalCreditsUsed = totalCreditsUsed;
        return this;
    }
    
    /**
     * The total number of runs.
     */
    @JsonProperty("total_runs")
    public Long totalRuns;

    public GetProjectWorkflowsPageData200ApplicationJSONProjectWorkflowBranchDataMetrics withTotalRuns(Long totalRuns) {
        this.totalRuns = totalRuns;
        return this;
    }
    
    public GetProjectWorkflowsPageData200ApplicationJSONProjectWorkflowBranchDataMetrics(@JsonProperty("p95_duration_secs") Float p95DurationSecs, @JsonProperty("success_rate") Float successRate, @JsonProperty("total_credits_used") Long totalCreditsUsed, @JsonProperty("total_runs") Long totalRuns) {
        this.p95DurationSecs = p95DurationSecs;
        this.successRate = successRate;
        this.totalCreditsUsed = totalCreditsUsed;
        this.totalRuns = totalRuns;
  }
}
