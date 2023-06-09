/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetProjectBySlugProject - NOTE: The definition of Project is subject to change.
 */
public class GetProjectBySlugProject {
    @JsonProperty("id")
    public String id;

    public GetProjectBySlugProject withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The name of the project
     */
    @JsonProperty("name")
    public String name;

    public GetProjectBySlugProject withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * The id of the organization the project belongs to
     */
    @JsonProperty("organization_id")
    public String organizationId;

    public GetProjectBySlugProject withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    
    /**
     * The name of the organization the project belongs to
     */
    @JsonProperty("organization_name")
    public String organizationName;

    public GetProjectBySlugProject withOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }
    
    /**
     * The slug of the organization the project belongs to
     */
    @JsonProperty("organization_slug")
    public String organizationSlug;

    public GetProjectBySlugProject withOrganizationSlug(String organizationSlug) {
        this.organizationSlug = organizationSlug;
        return this;
    }
    
    /**
     * Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
     */
    @JsonProperty("slug")
    public String slug;

    public GetProjectBySlugProject withSlug(String slug) {
        this.slug = slug;
        return this;
    }
    
    /**
     * Information about the VCS that hosts the project source code.
     */
    @JsonProperty("vcs_info")
    public GetProjectBySlugProjectVcsInfo vcsInfo;

    public GetProjectBySlugProject withVcsInfo(GetProjectBySlugProjectVcsInfo vcsInfo) {
        this.vcsInfo = vcsInfo;
        return this;
    }
    
    public GetProjectBySlugProject(@JsonProperty("id") String id, @JsonProperty("name") String name, @JsonProperty("organization_id") String organizationId, @JsonProperty("organization_name") String organizationName, @JsonProperty("organization_slug") String organizationSlug, @JsonProperty("slug") String slug, @JsonProperty("vcs_info") GetProjectBySlugProjectVcsInfo vcsInfo) {
        this.id = id;
        this.name = name;
        this.organizationId = organizationId;
        this.organizationName = organizationName;
        this.organizationSlug = organizationSlug;
        this.slug = slug;
        this.vcsInfo = vcsInfo;
  }
}
