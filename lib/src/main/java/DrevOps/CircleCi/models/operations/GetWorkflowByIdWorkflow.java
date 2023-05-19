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
 * GetWorkflowByIdWorkflow - A workflow
 */
public class GetWorkflowByIdWorkflow {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("canceled_by")
    public String canceledBy;

    public GetWorkflowByIdWorkflow withCanceledBy(String canceledBy) {
        this.canceledBy = canceledBy;
        return this;
    }
    
    /**
     * The date and time the workflow was created.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public GetWorkflowByIdWorkflow withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errored_by")
    public String erroredBy;

    public GetWorkflowByIdWorkflow withErroredBy(String erroredBy) {
        this.erroredBy = erroredBy;
        return this;
    }
    
    /**
     * The unique ID of the workflow.
     */
    @JsonProperty("id")
    public String id;

    public GetWorkflowByIdWorkflow withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The name of the workflow.
     */
    @JsonProperty("name")
    public String name;

    public GetWorkflowByIdWorkflow withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * The ID of the pipeline this workflow belongs to.
     */
    @JsonProperty("pipeline_id")
    public String pipelineId;

    public GetWorkflowByIdWorkflow withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    
    /**
     * The number of the pipeline this workflow belongs to.
     */
    @JsonProperty("pipeline_number")
    public Long pipelineNumber;

    public GetWorkflowByIdWorkflow withPipelineNumber(Long pipelineNumber) {
        this.pipelineNumber = pipelineNumber;
        return this;
    }
    
    /**
     * The project-slug for the pipeline this workflow belongs to.
     */
    @JsonProperty("project_slug")
    public String projectSlug;

    public GetWorkflowByIdWorkflow withProjectSlug(String projectSlug) {
        this.projectSlug = projectSlug;
        return this;
    }
    
    @JsonProperty("started_by")
    public String startedBy;

    public GetWorkflowByIdWorkflow withStartedBy(String startedBy) {
        this.startedBy = startedBy;
        return this;
    }
    
    /**
     * The current status of the workflow.
     */
    @JsonProperty("status")
    public GetWorkflowByIdWorkflowStatus status;

    public GetWorkflowByIdWorkflow withStatus(GetWorkflowByIdWorkflowStatus status) {
        this.status = status;
        return this;
    }
    
    /**
     * The date and time the workflow stopped.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("stopped_at")
    public OffsetDateTime stoppedAt;

    public GetWorkflowByIdWorkflow withStoppedAt(OffsetDateTime stoppedAt) {
        this.stoppedAt = stoppedAt;
        return this;
    }
    
    /**
     * Tag used for the workflow
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag")
    public GetWorkflowByIdWorkflowTag tag;

    public GetWorkflowByIdWorkflow withTag(GetWorkflowByIdWorkflowTag tag) {
        this.tag = tag;
        return this;
    }
    
    public GetWorkflowByIdWorkflow(@JsonProperty("created_at") OffsetDateTime createdAt, @JsonProperty("id") String id, @JsonProperty("name") String name, @JsonProperty("pipeline_id") String pipelineId, @JsonProperty("pipeline_number") Long pipelineNumber, @JsonProperty("project_slug") String projectSlug, @JsonProperty("started_by") String startedBy, @JsonProperty("status") GetWorkflowByIdWorkflowStatus status, @JsonProperty("stopped_at") OffsetDateTime stoppedAt) {
        this.createdAt = createdAt;
        this.id = id;
        this.name = name;
        this.pipelineId = pipelineId;
        this.pipelineNumber = pipelineNumber;
        this.projectSlug = projectSlug;
        this.startedBy = startedBy;
        this.status = status;
        this.stoppedAt = stoppedAt;
  }
}
