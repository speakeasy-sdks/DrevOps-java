/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import DrevOps.CircleCi.utils.SpeakeasyMetadata;

public class ListPipelinesRequest {
    /**
     * Only include entries created by your user.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=mine")
    public Boolean mine;

    public ListPipelinesRequest withMine(Boolean mine) {
        this.mine = mine;
        return this;
    }
    
    /**
     * Org slug in the form `vcs-slug/org-name`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=org-slug")
    public String orgSlug;

    public ListPipelinesRequest withOrgSlug(String orgSlug) {
        this.orgSlug = orgSlug;
        return this;
    }
    
    /**
     * A token to retrieve the next page of results.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page-token")
    public String pageToken;

    public ListPipelinesRequest withPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    
    public ListPipelinesRequest(){}
}
