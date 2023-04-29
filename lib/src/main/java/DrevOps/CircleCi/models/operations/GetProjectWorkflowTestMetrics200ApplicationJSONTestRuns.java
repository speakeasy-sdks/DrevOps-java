/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetProjectWorkflowTestMetrics200ApplicationJSONTestRuns {
    /**
     * The number of the pipeline associated with the provided test counts
     */
    @JsonProperty("pipeline_number")
    public Long pipelineNumber;
    public GetProjectWorkflowTestMetrics200ApplicationJSONTestRuns withPipelineNumber(Long pipelineNumber) {
        this.pipelineNumber = pipelineNumber;
        return this;
    }
    
    /**
     * The success rate calculated from test counts
     */
    @JsonProperty("success_rate")
    public Float successRate;
    public GetProjectWorkflowTestMetrics200ApplicationJSONTestRuns withSuccessRate(Float successRate) {
        this.successRate = successRate;
        return this;
    }
    
    /**
     * Test counts for a given pipeline number
     */
    @JsonProperty("test_counts")
    public GetProjectWorkflowTestMetrics200ApplicationJSONTestRunsTestCounts testCounts;
    public GetProjectWorkflowTestMetrics200ApplicationJSONTestRuns withTestCounts(GetProjectWorkflowTestMetrics200ApplicationJSONTestRunsTestCounts testCounts) {
        this.testCounts = testCounts;
        return this;
    }
    
    /**
     * The ID of the workflow associated with the provided test counts
     */
    @JsonProperty("workflow_id")
    public Object workflowId;
    public GetProjectWorkflowTestMetrics200ApplicationJSONTestRuns withWorkflowId(Object workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    
    public GetProjectWorkflowTestMetrics200ApplicationJSONTestRuns(@JsonProperty("pipeline_number") Long pipelineNumber, @JsonProperty("success_rate") Float successRate, @JsonProperty("test_counts") GetProjectWorkflowTestMetrics200ApplicationJSONTestRunsTestCounts testCounts, @JsonProperty("workflow_id") Object workflowId) {
        this.pipelineNumber = pipelineNumber;
        this.successRate = successRate;
        this.testCounts = testCounts;
        this.workflowId = workflowId;
  }
}
