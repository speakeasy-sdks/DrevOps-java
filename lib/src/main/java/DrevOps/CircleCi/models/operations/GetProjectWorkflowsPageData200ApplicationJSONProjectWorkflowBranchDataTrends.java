/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetProjectWorkflowsPageData200ApplicationJSONProjectWorkflowBranchDataTrends - Trends aggregated across a workflow or branch for a project.
 */
public class GetProjectWorkflowsPageData200ApplicationJSONProjectWorkflowBranchDataTrends {
    /**
     * The 95th percentile duration among a group of workflow runs.
     */
    @JsonProperty("p95_duration_secs")
    public Float p95DurationSecs;

    public GetProjectWorkflowsPageData200ApplicationJSONProjectWorkflowBranchDataTrends withP95DurationSecs(Float p95DurationSecs) {
        this.p95DurationSecs = p95DurationSecs;
        return this;
    }
    
    /**
     * The trend value for the success rate.
     */
    @JsonProperty("success_rate")
    public Float successRate;

    public GetProjectWorkflowsPageData200ApplicationJSONProjectWorkflowBranchDataTrends withSuccessRate(Float successRate) {
        this.successRate = successRate;
        return this;
    }
    
    /**
     * The trend value for total credits consumed.
     */
    @JsonProperty("total_credits_used")
    public Float totalCreditsUsed;

    public GetProjectWorkflowsPageData200ApplicationJSONProjectWorkflowBranchDataTrends withTotalCreditsUsed(Float totalCreditsUsed) {
        this.totalCreditsUsed = totalCreditsUsed;
        return this;
    }
    
    /**
     * The trend value for total number of runs.
     */
    @JsonProperty("total_runs")
    public Float totalRuns;

    public GetProjectWorkflowsPageData200ApplicationJSONProjectWorkflowBranchDataTrends withTotalRuns(Float totalRuns) {
        this.totalRuns = totalRuns;
        return this;
    }
    
    public GetProjectWorkflowsPageData200ApplicationJSONProjectWorkflowBranchDataTrends(@JsonProperty("p95_duration_secs") Float p95DurationSecs, @JsonProperty("success_rate") Float successRate, @JsonProperty("total_credits_used") Float totalCreditsUsed, @JsonProperty("total_runs") Float totalRuns) {
        this.p95DurationSecs = p95DurationSecs;
        this.successRate = successRate;
        this.totalCreditsUsed = totalCreditsUsed;
        this.totalRuns = totalRuns;
  }
}
