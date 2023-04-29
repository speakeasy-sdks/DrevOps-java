/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import DrevOps.CircleCi.utils.DateTimeDeserializer;
import DrevOps.CircleCi.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * TriggerPipelinePipelineCreation - A pipeline creation response.
 */
public class TriggerPipelinePipelineCreation {
    /**
     * The date and time the pipeline was created.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public TriggerPipelinePipelineCreation withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * The unique ID of the pipeline.
     */
    @JsonProperty("id")
    public String id;
    public TriggerPipelinePipelineCreation withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The number of the pipeline.
     */
    @JsonProperty("number")
    public Long number;
    public TriggerPipelinePipelineCreation withNumber(Long number) {
        this.number = number;
        return this;
    }
    
    /**
     * The current state of the pipeline.
     */
    @JsonProperty("state")
    public TriggerPipelinePipelineCreationStateEnum state;
    public TriggerPipelinePipelineCreation withState(TriggerPipelinePipelineCreationStateEnum state) {
        this.state = state;
        return this;
    }
    
    public TriggerPipelinePipelineCreation(@JsonProperty("created_at") OffsetDateTime createdAt, @JsonProperty("id") String id, @JsonProperty("number") Long number, @JsonProperty("state") TriggerPipelinePipelineCreationStateEnum state) {
        this.createdAt = createdAt;
        this.id = id;
        this.number = number;
        this.state = state;
  }
}
