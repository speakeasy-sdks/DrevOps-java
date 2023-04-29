/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetOrgSummaryData200ApplicationJSONOrgDataMetrics - Metrics for a single org metrics.
 */
public class GetOrgSummaryData200ApplicationJSONOrgDataMetrics {
    @JsonProperty("success_rate")
    public Float successRate;
    public GetOrgSummaryData200ApplicationJSONOrgDataMetrics withSuccessRate(Float successRate) {
        this.successRate = successRate;
        return this;
    }
    
    /**
     * The average number of runs per day.
     */
    @JsonProperty("throughput")
    public Float throughput;
    public GetOrgSummaryData200ApplicationJSONOrgDataMetrics withThroughput(Float throughput) {
        this.throughput = throughput;
        return this;
    }
    
    /**
     * The total credits consumed over the current timeseries interval.
     */
    @JsonProperty("total_credits_used")
    public Long totalCreditsUsed;
    public GetOrgSummaryData200ApplicationJSONOrgDataMetrics withTotalCreditsUsed(Long totalCreditsUsed) {
        this.totalCreditsUsed = totalCreditsUsed;
        return this;
    }
    
    /**
     * Total duration, in seconds.
     */
    @JsonProperty("total_duration_secs")
    public Long totalDurationSecs;
    public GetOrgSummaryData200ApplicationJSONOrgDataMetrics withTotalDurationSecs(Long totalDurationSecs) {
        this.totalDurationSecs = totalDurationSecs;
        return this;
    }
    
    /**
     * The total number of runs.
     */
    @JsonProperty("total_runs")
    public Long totalRuns;
    public GetOrgSummaryData200ApplicationJSONOrgDataMetrics withTotalRuns(Long totalRuns) {
        this.totalRuns = totalRuns;
        return this;
    }
    
    public GetOrgSummaryData200ApplicationJSONOrgDataMetrics(@JsonProperty("success_rate") Float successRate, @JsonProperty("throughput") Float throughput, @JsonProperty("total_credits_used") Long totalCreditsUsed, @JsonProperty("total_duration_secs") Long totalDurationSecs, @JsonProperty("total_runs") Long totalRuns) {
        this.successRate = successRate;
        this.throughput = throughput;
        this.totalCreditsUsed = totalCreditsUsed;
        this.totalDurationSecs = totalDurationSecs;
        this.totalRuns = totalRuns;
  }
}
