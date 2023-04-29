/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListMyPipelinesPipelineListResponsePipelineVcsCommit - The latest commit in the pipeline.
 */
public class ListMyPipelinesPipelineListResponsePipelineVcsCommit {
    /**
     * The body of the commit message.
     */
    @JsonProperty("body")
    public String body;
    public ListMyPipelinesPipelineListResponsePipelineVcsCommit withBody(String body) {
        this.body = body;
        return this;
    }
    
    /**
     * The subject of the commit message.
     */
    @JsonProperty("subject")
    public String subject;
    public ListMyPipelinesPipelineListResponsePipelineVcsCommit withSubject(String subject) {
        this.subject = subject;
        return this;
    }
    
    public ListMyPipelinesPipelineListResponsePipelineVcsCommit(@JsonProperty("body") String body, @JsonProperty("subject") String subject) {
        this.body = body;
        this.subject = subject;
  }
}
