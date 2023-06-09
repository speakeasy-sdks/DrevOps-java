/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RerunWorkflowRerunWorkflowParameters - The information you can supply when rerunning a workflow.
 */
public class RerunWorkflowRerunWorkflowParameters {
    /**
     * Whether to enable SSH access for the triggering user on the newly-rerun job. Requires the jobs parameter to be used and so is mutually exclusive with the from_failed parameter.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enable_ssh")
    public Boolean enableSsh;

    public RerunWorkflowRerunWorkflowParameters withEnableSsh(Boolean enableSsh) {
        this.enableSsh = enableSsh;
        return this;
    }
    
    /**
     * Whether to rerun the workflow from the failed job. Mutually exclusive with the jobs parameter.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("from_failed")
    public Boolean fromFailed;

    public RerunWorkflowRerunWorkflowParameters withFromFailed(Boolean fromFailed) {
        this.fromFailed = fromFailed;
        return this;
    }
    
    /**
     * A list of job IDs to rerun.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jobs")
    public String[] jobs;

    public RerunWorkflowRerunWorkflowParameters withJobs(String[] jobs) {
        this.jobs = jobs;
        return this;
    }
    
    /**
     * Completes rerun using sparse trees logic, an optimization for workflows that have disconnected subgraphs. Requires jobs parameter and so is mutually exclusive with the from_failed parameter.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sparse_tree")
    public Boolean sparseTree;

    public RerunWorkflowRerunWorkflowParameters withSparseTree(Boolean sparseTree) {
        this.sparseTree = sparseTree;
        return this;
    }
    
    public RerunWorkflowRerunWorkflowParameters(){}
}
