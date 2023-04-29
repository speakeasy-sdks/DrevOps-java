/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetOrgSummaryData200ApplicationJSONOrgProjectDataTrends - Trends for a single project, across all branches.
 */
public class GetOrgSummaryData200ApplicationJSONOrgProjectDataTrends {
    /**
     * The trend value for the success rate.
     */
    @JsonProperty("success_rate")
    public Float successRate;
    public GetOrgSummaryData200ApplicationJSONOrgProjectDataTrends withSuccessRate(Float successRate) {
        this.successRate = successRate;
        return this;
    }
    
    /**
     * The trend value for total credits consumed.
     */
    @JsonProperty("total_credits_used")
    public Float totalCreditsUsed;
    public GetOrgSummaryData200ApplicationJSONOrgProjectDataTrends withTotalCreditsUsed(Float totalCreditsUsed) {
        this.totalCreditsUsed = totalCreditsUsed;
        return this;
    }
    
    /**
     * Trend value for total duration.
     */
    @JsonProperty("total_duration_secs")
    public Float totalDurationSecs;
    public GetOrgSummaryData200ApplicationJSONOrgProjectDataTrends withTotalDurationSecs(Float totalDurationSecs) {
        this.totalDurationSecs = totalDurationSecs;
        return this;
    }
    
    /**
     * The trend value for total number of runs.
     */
    @JsonProperty("total_runs")
    public Float totalRuns;
    public GetOrgSummaryData200ApplicationJSONOrgProjectDataTrends withTotalRuns(Float totalRuns) {
        this.totalRuns = totalRuns;
        return this;
    }
    
    public GetOrgSummaryData200ApplicationJSONOrgProjectDataTrends(@JsonProperty("success_rate") Float successRate, @JsonProperty("total_credits_used") Float totalCreditsUsed, @JsonProperty("total_duration_secs") Float totalDurationSecs, @JsonProperty("total_runs") Float totalRuns) {
        this.successRate = successRate;
        this.totalCreditsUsed = totalCreditsUsed;
        this.totalDurationSecs = totalDurationSecs;
        this.totalRuns = totalRuns;
  }
}
