/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPipelineByIdPipelineVcsCommit - The latest commit in the pipeline.
 */
public class GetPipelineByIdPipelineVcsCommit {
    /**
     * The body of the commit message.
     */
    @JsonProperty("body")
    public String body;
    public GetPipelineByIdPipelineVcsCommit withBody(String body) {
        this.body = body;
        return this;
    }
    
    /**
     * The subject of the commit message.
     */
    @JsonProperty("subject")
    public String subject;
    public GetPipelineByIdPipelineVcsCommit withSubject(String subject) {
        this.subject = subject;
        return this;
    }
    
    public GetPipelineByIdPipelineVcsCommit(@JsonProperty("body") String body, @JsonProperty("subject") String subject) {
        this.body = body;
        this.subject = subject;
  }
}