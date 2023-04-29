/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetJobTimeseries200ApplicationJSONItemsMetricsDurationMetrics - Metrics relating to the duration of runs for a workflow.
 */
public class GetJobTimeseries200ApplicationJSONItemsMetricsDurationMetrics {
    /**
     * The max duration, in seconds, among a group of runs.
     */
    @JsonProperty("max")
    public Long max;
    public GetJobTimeseries200ApplicationJSONItemsMetricsDurationMetrics withMax(Long max) {
        this.max = max;
        return this;
    }
    
    /**
     * The median duration, in seconds, among a group of runs.
     */
    @JsonProperty("median")
    public Long median;
    public GetJobTimeseries200ApplicationJSONItemsMetricsDurationMetrics withMedian(Long median) {
        this.median = median;
        return this;
    }
    
    /**
     * The minimum duration, in seconds, among a group of runs.
     */
    @JsonProperty("min")
    public Long min;
    public GetJobTimeseries200ApplicationJSONItemsMetricsDurationMetrics withMin(Long min) {
        this.min = min;
        return this;
    }
    
    /**
     * The 95th percentile duration, in seconds, among a group of runs.
     */
    @JsonProperty("p95")
    public Long p95;
    public GetJobTimeseries200ApplicationJSONItemsMetricsDurationMetrics withP95(Long p95) {
        this.p95 = p95;
        return this;
    }
    
    /**
     * The total duration, in seconds, added across a group of runs.
     */
    @JsonProperty("total")
    public Long total;
    public GetJobTimeseries200ApplicationJSONItemsMetricsDurationMetrics withTotal(Long total) {
        this.total = total;
        return this;
    }
    
    public GetJobTimeseries200ApplicationJSONItemsMetricsDurationMetrics(@JsonProperty("max") Long max, @JsonProperty("median") Long median, @JsonProperty("min") Long min, @JsonProperty("p95") Long p95, @JsonProperty("total") Long total) {
        this.max = max;
        this.median = median;
        this.min = min;
        this.p95 = p95;
        this.total = total;
  }
}
