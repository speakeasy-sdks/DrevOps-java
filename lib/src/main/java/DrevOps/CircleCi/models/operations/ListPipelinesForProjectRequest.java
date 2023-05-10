/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import DrevOps.CircleCi.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListPipelinesForProjectRequest {
    /**
     * The name of a vcs branch.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=branch")
    public String branch;

    public ListPipelinesForProjectRequest withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    /**
     * A token to retrieve the next page of results.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page-token")
    public String pageToken;

    public ListPipelinesForProjectRequest withPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    
    /**
     * Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project-slug")
    public String projectSlug;

    public ListPipelinesForProjectRequest withProjectSlug(String projectSlug) {
        this.projectSlug = projectSlug;
        return this;
    }
    
    public ListPipelinesForProjectRequest(@JsonProperty("project-slug") String projectSlug) {
        this.projectSlug = projectSlug;
  }
}
