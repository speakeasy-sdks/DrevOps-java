/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetCollaborationsCollaboration {
    /**
     * URL to the user's avatar on the VCS
     */
    @JsonProperty("avatar_url")
    public String avatarUrl;

    public GetCollaborationsCollaboration withAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    
    /**
     * The UUID of the organization
     */
    @JsonProperty("id")
    public String id;

    public GetCollaborationsCollaboration withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The name of the organization
     */
    @JsonProperty("name")
    public String name;

    public GetCollaborationsCollaboration withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * The slug of the organization
     */
    @JsonProperty("slug")
    public String slug;

    public GetCollaborationsCollaboration withSlug(String slug) {
        this.slug = slug;
        return this;
    }
    
    /**
     * The VCS provider
     */
    @JsonProperty("vcs-type")
    public String vcsType;

    public GetCollaborationsCollaboration withVcsType(String vcsType) {
        this.vcsType = vcsType;
        return this;
    }
    
    public GetCollaborationsCollaboration(@JsonProperty("avatar_url") String avatarUrl, @JsonProperty("id") String id, @JsonProperty("name") String name, @JsonProperty("slug") String slug, @JsonProperty("vcs-type") String vcsType) {
        this.avatarUrl = avatarUrl;
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.vcsType = vcsType;
  }
}
