/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetWorkflowSummary200ApplicationJSONMetricsDurationMetrics - Metrics relating to the duration of runs for a workflow.
 */
public class GetWorkflowSummary200ApplicationJSONMetricsDurationMetrics {
    /**
     * The max duration, in seconds, among a group of runs.
     */
    @JsonProperty("max")
    public Long max;

    public GetWorkflowSummary200ApplicationJSONMetricsDurationMetrics withMax(Long max) {
        this.max = max;
        return this;
    }
    
    /**
     * The mean duration, in seconds, among a group of runs.
     */
    @JsonProperty("mean")
    public Long mean;

    public GetWorkflowSummary200ApplicationJSONMetricsDurationMetrics withMean(Long mean) {
        this.mean = mean;
        return this;
    }
    
    /**
     * The median duration, in seconds, among a group of runs.
     */
    @JsonProperty("median")
    public Long median;

    public GetWorkflowSummary200ApplicationJSONMetricsDurationMetrics withMedian(Long median) {
        this.median = median;
        return this;
    }
    
    /**
     * The minimum duration, in seconds, among a group of runs.
     */
    @JsonProperty("min")
    public Long min;

    public GetWorkflowSummary200ApplicationJSONMetricsDurationMetrics withMin(Long min) {
        this.min = min;
        return this;
    }
    
    /**
     * The 95th percentile duration, in seconds, among a group of runs.
     */
    @JsonProperty("p95")
    public Long p95;

    public GetWorkflowSummary200ApplicationJSONMetricsDurationMetrics withP95(Long p95) {
        this.p95 = p95;
        return this;
    }
    
    /**
     * The standard deviation, in seconds, among a group of runs.
     */
    @JsonProperty("standard_deviation")
    public Float standardDeviation;

    public GetWorkflowSummary200ApplicationJSONMetricsDurationMetrics withStandardDeviation(Float standardDeviation) {
        this.standardDeviation = standardDeviation;
        return this;
    }
    
    public GetWorkflowSummary200ApplicationJSONMetricsDurationMetrics(@JsonProperty("max") Long max, @JsonProperty("mean") Long mean, @JsonProperty("median") Long median, @JsonProperty("min") Long min, @JsonProperty("p95") Long p95, @JsonProperty("standard_deviation") Float standardDeviation) {
        this.max = max;
        this.mean = mean;
        this.median = median;
        this.min = min;
        this.p95 = p95;
        this.standardDeviation = standardDeviation;
  }
}
