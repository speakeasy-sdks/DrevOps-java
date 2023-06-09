/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RerunWorkflow202ApplicationJSON - A response to rerunning a workflow
 */
public class RerunWorkflow202ApplicationJSON {
    /**
     * The ID of the newly-created workflow.
     */
    @JsonProperty("workflow_id")
    public String workflowId;

    public RerunWorkflow202ApplicationJSON withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    
    public RerunWorkflow202ApplicationJSON(@JsonProperty("workflow_id") String workflowId) {
        this.workflowId = workflowId;
  }
}
