/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPipelineByNumberPipelineVcs - VCS information for the pipeline.
 */
public class GetPipelineByNumberPipelineVcs {
    /**
     * The branch where the pipeline ran. The HEAD commit on this branch was used for the pipeline. Note that `branch` and `tag` are mutually exclusive. To trigger a pipeline for a PR by number use `pull/&lt;number&gt;/head` for the PR ref or `pull/&lt;number&gt;/merge` for the merge ref (GitHub only).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    public String branch;

    public GetPipelineByNumberPipelineVcs withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    /**
     * The latest commit in the pipeline.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("commit")
    public GetPipelineByNumberPipelineVcsCommit commit;

    public GetPipelineByNumberPipelineVcs withCommit(GetPipelineByNumberPipelineVcsCommit commit) {
        this.commit = commit;
        return this;
    }
    
    /**
     * URL for the repository where the trigger originated. For fork-PR pipelines, this is the URL to the fork. For other pipelines the `origin_` and `target_repository_url`s will be the same.
     */
    @JsonProperty("origin_repository_url")
    public String originRepositoryUrl;

    public GetPipelineByNumberPipelineVcs withOriginRepositoryUrl(String originRepositoryUrl) {
        this.originRepositoryUrl = originRepositoryUrl;
        return this;
    }
    
    /**
     * Name of the VCS provider (e.g. GitHub, Bitbucket).
     */
    @JsonProperty("provider_name")
    public String providerName;

    public GetPipelineByNumberPipelineVcs withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    
    /**
     * The code review id.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("review_id")
    public String reviewId;

    public GetPipelineByNumberPipelineVcs withReviewId(String reviewId) {
        this.reviewId = reviewId;
        return this;
    }
    
    /**
     * The code review URL.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("review_url")
    public String reviewUrl;

    public GetPipelineByNumberPipelineVcs withReviewUrl(String reviewUrl) {
        this.reviewUrl = reviewUrl;
        return this;
    }
    
    /**
     * The code revision the pipeline ran.
     */
    @JsonProperty("revision")
    public String revision;

    public GetPipelineByNumberPipelineVcs withRevision(String revision) {
        this.revision = revision;
        return this;
    }
    
    /**
     * The tag used by the pipeline. The commit that this tag points to was used for the pipeline. Note that `branch` and `tag` are mutually exclusive.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag")
    public String tag;

    public GetPipelineByNumberPipelineVcs withTag(String tag) {
        this.tag = tag;
        return this;
    }
    
    /**
     * URL for the repository the trigger targets (i.e. the repository where the PR will be merged). For fork-PR pipelines, this is the URL to the parent repo. For other pipelines, the `origin_` and `target_repository_url`s will be the same.
     */
    @JsonProperty("target_repository_url")
    public String targetRepositoryUrl;

    public GetPipelineByNumberPipelineVcs withTargetRepositoryUrl(String targetRepositoryUrl) {
        this.targetRepositoryUrl = targetRepositoryUrl;
        return this;
    }
    
    public GetPipelineByNumberPipelineVcs(@JsonProperty("origin_repository_url") String originRepositoryUrl, @JsonProperty("provider_name") String providerName, @JsonProperty("revision") String revision, @JsonProperty("target_repository_url") String targetRepositoryUrl) {
        this.originRepositoryUrl = originRepositoryUrl;
        this.providerName = providerName;
        this.revision = revision;
        this.targetRepositoryUrl = targetRepositoryUrl;
  }
}
