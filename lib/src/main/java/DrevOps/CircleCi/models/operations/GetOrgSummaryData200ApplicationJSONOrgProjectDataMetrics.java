/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetOrgSummaryData200ApplicationJSONOrgProjectDataMetrics - Metrics for a single project, across all branches.
 */
public class GetOrgSummaryData200ApplicationJSONOrgProjectDataMetrics {
    @JsonProperty("success_rate")
    public Float successRate;

    public GetOrgSummaryData200ApplicationJSONOrgProjectDataMetrics withSuccessRate(Float successRate) {
        this.successRate = successRate;
        return this;
    }
    
    /**
     * The total credits consumed over the current timeseries interval.
     */
    @JsonProperty("total_credits_used")
    public Long totalCreditsUsed;

    public GetOrgSummaryData200ApplicationJSONOrgProjectDataMetrics withTotalCreditsUsed(Long totalCreditsUsed) {
        this.totalCreditsUsed = totalCreditsUsed;
        return this;
    }
    
    /**
     * Total duration, in seconds.
     */
    @JsonProperty("total_duration_secs")
    public Long totalDurationSecs;

    public GetOrgSummaryData200ApplicationJSONOrgProjectDataMetrics withTotalDurationSecs(Long totalDurationSecs) {
        this.totalDurationSecs = totalDurationSecs;
        return this;
    }
    
    /**
     * The total number of runs.
     */
    @JsonProperty("total_runs")
    public Long totalRuns;

    public GetOrgSummaryData200ApplicationJSONOrgProjectDataMetrics withTotalRuns(Long totalRuns) {
        this.totalRuns = totalRuns;
        return this;
    }
    
    public GetOrgSummaryData200ApplicationJSONOrgProjectDataMetrics(@JsonProperty("success_rate") Float successRate, @JsonProperty("total_credits_used") Long totalCreditsUsed, @JsonProperty("total_duration_secs") Long totalDurationSecs, @JsonProperty("total_runs") Long totalRuns) {
        this.successRate = successRate;
        this.totalCreditsUsed = totalCreditsUsed;
        this.totalDurationSecs = totalDurationSecs;
        this.totalRuns = totalRuns;
  }
}
