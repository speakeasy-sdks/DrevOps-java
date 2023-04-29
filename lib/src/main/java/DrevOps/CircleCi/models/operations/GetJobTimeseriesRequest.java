/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import DrevOps.CircleCi.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class GetJobTimeseriesRequest {
    /**
     * The name of a vcs branch. If not passed we will scope the API call to the default branch.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=branch")
    public String branch;
    public GetJobTimeseriesRequest withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    /**
     * Include only executions that started before this date. This date can be at most 90 days after the start-date.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=end-date")
    public OffsetDateTime endDate;
    public GetJobTimeseriesRequest withEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
        return this;
    }
    
    /**
     * The granularity for which to query timeseries data.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=granularity")
    public GetJobTimeseriesGranularityEnum granularity;
    public GetJobTimeseriesRequest withGranularity(GetJobTimeseriesGranularityEnum granularity) {
        this.granularity = granularity;
        return this;
    }
    
    /**
     * Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project-slug")
    public String projectSlug;
    public GetJobTimeseriesRequest withProjectSlug(String projectSlug) {
        this.projectSlug = projectSlug;
        return this;
    }
    
    /**
     * Include only executions that started at or after this date. This must be specified if an end-date is provided.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=start-date")
    public OffsetDateTime startDate;
    public GetJobTimeseriesRequest withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    /**
     * The name of the workflow.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workflow-name")
    public String workflowName;
    public GetJobTimeseriesRequest withWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }
    
    public GetJobTimeseriesRequest(@JsonProperty("project-slug") String projectSlug, @JsonProperty("workflow-name") String workflowName) {
        this.projectSlug = projectSlug;
        this.workflowName = workflowName;
  }
}
