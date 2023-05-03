/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import DrevOps.CircleCi.utils.DateTimeDeserializer;
import DrevOps.CircleCi.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * ListMyPipelinesPipelineListResponsePipeline - A pipeline response.
 */
public class ListMyPipelinesPipelineListResponsePipeline {
    /**
     * The date and time the pipeline was created.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public ListMyPipelinesPipelineListResponsePipeline withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * A sequence of errors that have occurred within the pipeline.
     */
    @JsonProperty("errors")
    public ListMyPipelinesPipelineListResponsePipelineErrors[] errors;
    public ListMyPipelinesPipelineListResponsePipeline withErrors(ListMyPipelinesPipelineListResponsePipelineErrors[] errors) {
        this.errors = errors;
        return this;
    }
    
    /**
     * The unique ID of the pipeline.
     */
    @JsonProperty("id")
    public String id;
    public ListMyPipelinesPipelineListResponsePipeline withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The number of the pipeline.
     */
    @JsonProperty("number")
    public Long number;
    public ListMyPipelinesPipelineListResponsePipeline withNumber(Long number) {
        this.number = number;
        return this;
    }
    
    /**
     * The project-slug for the pipeline.
     */
    @JsonProperty("project_slug")
    public String projectSlug;
    public ListMyPipelinesPipelineListResponsePipeline withProjectSlug(String projectSlug) {
        this.projectSlug = projectSlug;
        return this;
    }
    
    /**
     * The current state of the pipeline.
     */
    @JsonProperty("state")
    public ListMyPipelinesPipelineListResponsePipelineStateEnum state;
    public ListMyPipelinesPipelineListResponsePipeline withState(ListMyPipelinesPipelineListResponsePipelineStateEnum state) {
        this.state = state;
        return this;
    }
    
    /**
     * A summary of the trigger.
     */
    @JsonProperty("trigger")
    public ListMyPipelinesPipelineListResponsePipelineTrigger trigger;
    public ListMyPipelinesPipelineListResponsePipeline withTrigger(ListMyPipelinesPipelineListResponsePipelineTrigger trigger) {
        this.trigger = trigger;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trigger_parameters")
    public java.util.Map<String, Object> triggerParameters;
    public ListMyPipelinesPipelineListResponsePipeline withTriggerParameters(java.util.Map<String, Object> triggerParameters) {
        this.triggerParameters = triggerParameters;
        return this;
    }
    
    /**
     * The date and time the pipeline was last updated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public ListMyPipelinesPipelineListResponsePipeline withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    /**
     * VCS information for the pipeline.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vcs")
    public ListMyPipelinesPipelineListResponsePipelineVcs vcs;
    public ListMyPipelinesPipelineListResponsePipeline withVcs(ListMyPipelinesPipelineListResponsePipelineVcs vcs) {
        this.vcs = vcs;
        return this;
    }
    
    public ListMyPipelinesPipelineListResponsePipeline(@JsonProperty("created_at") OffsetDateTime createdAt, @JsonProperty("errors") ListMyPipelinesPipelineListResponsePipelineErrors[] errors, @JsonProperty("id") String id, @JsonProperty("number") Long number, @JsonProperty("project_slug") String projectSlug, @JsonProperty("state") ListMyPipelinesPipelineListResponsePipelineStateEnum state, @JsonProperty("trigger") ListMyPipelinesPipelineListResponsePipelineTrigger trigger) {
        this.createdAt = createdAt;
        this.errors = errors;
        this.id = id;
        this.number = number;
        this.projectSlug = projectSlug;
        this.state = state;
        this.trigger = trigger;
  }
}