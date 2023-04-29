/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import DrevOps.CircleCi.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateCheckoutKeyRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public CreateCheckoutKeyCheckoutKeyInput requestBody;
    public CreateCheckoutKeyRequest withRequestBody(CreateCheckoutKeyCheckoutKeyInput requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project-slug")
    public String projectSlug;
    public CreateCheckoutKeyRequest withProjectSlug(String projectSlug) {
        this.projectSlug = projectSlug;
        return this;
    }
    
    public CreateCheckoutKeyRequest(@JsonProperty("project-slug") String projectSlug) {
        this.projectSlug = projectSlug;
  }
}
