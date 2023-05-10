/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListPipelinesPipelineListResponsePipelineTriggerActor - The user who triggered the Pipeline.
 */
public class ListPipelinesPipelineListResponsePipelineTriggerActor {
    /**
     * URL to the user's avatar on the VCS
     */
    @JsonProperty("avatar_url")
    public String avatarUrl;

    public ListPipelinesPipelineListResponsePipelineTriggerActor withAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    
    /**
     * The login information for the user on the VCS.
     */
    @JsonProperty("login")
    public String login;

    public ListPipelinesPipelineListResponsePipelineTriggerActor withLogin(String login) {
        this.login = login;
        return this;
    }
    
    public ListPipelinesPipelineListResponsePipelineTriggerActor(@JsonProperty("avatar_url") String avatarUrl, @JsonProperty("login") String login) {
        this.avatarUrl = avatarUrl;
        this.login = login;
  }
}
