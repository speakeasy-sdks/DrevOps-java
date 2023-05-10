/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListPipelinesPipelineListResponsePipelineVcsCommit - The latest commit in the pipeline.
 */
public class ListPipelinesPipelineListResponsePipelineVcsCommit {
    /**
     * The body of the commit message.
     */
    @JsonProperty("body")
    public String body;

    public ListPipelinesPipelineListResponsePipelineVcsCommit withBody(String body) {
        this.body = body;
        return this;
    }
    
    /**
     * The subject of the commit message.
     */
    @JsonProperty("subject")
    public String subject;

    public ListPipelinesPipelineListResponsePipelineVcsCommit withSubject(String subject) {
        this.subject = subject;
        return this;
    }
    
    public ListPipelinesPipelineListResponsePipelineVcsCommit(@JsonProperty("body") String body, @JsonProperty("subject") String subject) {
        this.body = body;
        this.subject = subject;
  }
}
