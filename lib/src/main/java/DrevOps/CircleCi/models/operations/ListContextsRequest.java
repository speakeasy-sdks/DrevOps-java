/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import DrevOps.CircleCi.utils.SpeakeasyMetadata;

public class ListContextsRequest {
    /**
     * The unique ID of the owner of the context. Specify either this or owner-slug.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=owner-id")
    public String ownerId;

    public ListContextsRequest withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    
    /**
     * A string that represents an organization. Specify either this or owner-id. Cannot be used for accounts.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=owner-slug")
    public String ownerSlug;

    public ListContextsRequest withOwnerSlug(String ownerSlug) {
        this.ownerSlug = ownerSlug;
        return this;
    }
    
    /**
     * The type of the owner. Defaults to "organization". Accounts are only used as context owners in server.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=owner-type")
    public ListContextsOwnerTypeEnum ownerType;

    public ListContextsRequest withOwnerType(ListContextsOwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    
    /**
     * A token to retrieve the next page of results.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page-token")
    public String pageToken;

    public ListContextsRequest withPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    
    public ListContextsRequest(){}
}
