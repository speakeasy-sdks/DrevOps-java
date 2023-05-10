/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetFlakyTests200ApplicationJSONFlakyTests {
    /**
     * The class the test belongs to.
     */
    @JsonProperty("classname")
    public String classname;

    public GetFlakyTests200ApplicationJSONFlakyTests withClassname(String classname) {
        this.classname = classname;
        return this;
    }
    
    /**
     * The file the test belongs to.
     */
    @JsonProperty("file")
    public String file;

    public GetFlakyTests200ApplicationJSONFlakyTests withFile(String file) {
        this.file = file;
        return this;
    }
    
    /**
     * The name of the job.
     */
    @JsonProperty("job-name")
    public String jobName;

    public GetFlakyTests200ApplicationJSONFlakyTests withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    
    /**
     * The number of the job.
     */
    @JsonProperty("job-number")
    public Long jobNumber;

    public GetFlakyTests200ApplicationJSONFlakyTests withJobNumber(Long jobNumber) {
        this.jobNumber = jobNumber;
        return this;
    }
    
    /**
     * The number of the pipeline.
     */
    @JsonProperty("pipeline-number")
    public Long pipelineNumber;

    public GetFlakyTests200ApplicationJSONFlakyTests withPipelineNumber(Long pipelineNumber) {
        this.pipelineNumber = pipelineNumber;
        return this;
    }
    
    /**
     * The source of the test.
     */
    @JsonProperty("source")
    public String source;

    public GetFlakyTests200ApplicationJSONFlakyTests withSource(String source) {
        this.source = source;
        return this;
    }
    
    /**
     * The name of the test.
     */
    @JsonProperty("test-name")
    public String testName;

    public GetFlakyTests200ApplicationJSONFlakyTests withTestName(String testName) {
        this.testName = testName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("time-wasted")
    public Long timeWasted;

    public GetFlakyTests200ApplicationJSONFlakyTests withTimeWasted(Long timeWasted) {
        this.timeWasted = timeWasted;
        return this;
    }
    
    /**
     * The number of times the test flaked.
     */
    @JsonProperty("times-flaked")
    public Long timesFlaked;

    public GetFlakyTests200ApplicationJSONFlakyTests withTimesFlaked(Long timesFlaked) {
        this.timesFlaked = timesFlaked;
        return this;
    }
    
    /**
     * The date and time when workflow was created.
     */
    @JsonProperty("workflow-created-at")
    public Object workflowCreatedAt;

    public GetFlakyTests200ApplicationJSONFlakyTests withWorkflowCreatedAt(Object workflowCreatedAt) {
        this.workflowCreatedAt = workflowCreatedAt;
        return this;
    }
    
    /**
     * The ID of the workflow associated with the provided test counts
     */
    @JsonProperty("workflow-id")
    public Object workflowId;

    public GetFlakyTests200ApplicationJSONFlakyTests withWorkflowId(Object workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    
    /**
     * The name of the workflow.
     */
    @JsonProperty("workflow-name")
    public String workflowName;

    public GetFlakyTests200ApplicationJSONFlakyTests withWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }
    
    public GetFlakyTests200ApplicationJSONFlakyTests(@JsonProperty("classname") String classname, @JsonProperty("file") String file, @JsonProperty("job-name") String jobName, @JsonProperty("job-number") Long jobNumber, @JsonProperty("pipeline-number") Long pipelineNumber, @JsonProperty("source") String source, @JsonProperty("test-name") String testName, @JsonProperty("times-flaked") Long timesFlaked, @JsonProperty("workflow-created-at") Object workflowCreatedAt, @JsonProperty("workflow-id") Object workflowId, @JsonProperty("workflow-name") String workflowName) {
        this.classname = classname;
        this.file = file;
        this.jobName = jobName;
        this.jobNumber = jobNumber;
        this.pipelineNumber = pipelineNumber;
        this.source = source;
        this.testName = testName;
        this.timesFlaked = timesFlaked;
        this.workflowCreatedAt = workflowCreatedAt;
        this.workflowId = workflowId;
        this.workflowName = workflowName;
  }
}
