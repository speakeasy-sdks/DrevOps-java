/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import DrevOps.CircleCi.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPipelineByNumberRequest {
    /**
     * The number of the pipeline.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=pipeline-number")
    public Object pipelineNumber;
    public GetPipelineByNumberRequest withPipelineNumber(Object pipelineNumber) {
        this.pipelineNumber = pipelineNumber;
        return this;
    }
    
    /**
     * Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project-slug")
    public String projectSlug;
    public GetPipelineByNumberRequest withProjectSlug(String projectSlug) {
        this.projectSlug = projectSlug;
        return this;
    }
    
    public GetPipelineByNumberRequest(@JsonProperty("pipeline-number") Object pipelineNumber, @JsonProperty("project-slug") String projectSlug) {
        this.pipelineNumber = pipelineNumber;
        this.projectSlug = projectSlug;
  }
}
