/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import DrevOps.CircleCi.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetProjectWorkflowsPageDataRequest {
    /**
     * The names of VCS branches to include in branch-level workflow metrics.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=branches")
    public GetProjectWorkflowsPageDataBranches branches;

    public GetProjectWorkflowsPageDataRequest withBranches(GetProjectWorkflowsPageDataBranches branches) {
        this.branches = branches;
        return this;
    }
    
    /**
     * Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project-slug")
    public String projectSlug;

    public GetProjectWorkflowsPageDataRequest withProjectSlug(String projectSlug) {
        this.projectSlug = projectSlug;
        return this;
    }
    
    /**
     * The time window used to calculate summary metrics.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=reporting-window")
    public GetProjectWorkflowsPageDataReportingWindow reportingWindow;

    public GetProjectWorkflowsPageDataRequest withReportingWindow(GetProjectWorkflowsPageDataReportingWindow reportingWindow) {
        this.reportingWindow = reportingWindow;
        return this;
    }
    
    /**
     * The names of workflows to include in workflow-level metrics.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=workflow-names")
    public GetProjectWorkflowsPageDataWorkflowNames workflowNames;

    public GetProjectWorkflowsPageDataRequest withWorkflowNames(GetProjectWorkflowsPageDataWorkflowNames workflowNames) {
        this.workflowNames = workflowNames;
        return this;
    }
    
    public GetProjectWorkflowsPageDataRequest(@JsonProperty("project-slug") String projectSlug) {
        this.projectSlug = projectSlug;
  }
}
