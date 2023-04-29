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
 * ListMyPipelinesPipelineListResponsePipelineTrigger - A summary of the trigger.
 */
public class ListMyPipelinesPipelineListResponsePipelineTrigger {
    /**
     * The user who triggered the Pipeline.
     */
    @JsonProperty("actor")
    public ListMyPipelinesPipelineListResponsePipelineTriggerActor actor;
    public ListMyPipelinesPipelineListResponsePipelineTrigger withActor(ListMyPipelinesPipelineListResponsePipelineTriggerActor actor) {
        this.actor = actor;
        return this;
    }
    
    /**
     * The date and time the trigger was received.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("received_at")
    public OffsetDateTime receivedAt;
    public ListMyPipelinesPipelineListResponsePipelineTrigger withReceivedAt(OffsetDateTime receivedAt) {
        this.receivedAt = receivedAt;
        return this;
    }
    
    /**
     * The type of trigger.
     */
    @JsonProperty("type")
    public ListMyPipelinesPipelineListResponsePipelineTriggerTypeEnum type;
    public ListMyPipelinesPipelineListResponsePipelineTrigger withType(ListMyPipelinesPipelineListResponsePipelineTriggerTypeEnum type) {
        this.type = type;
        return this;
    }
    
    public ListMyPipelinesPipelineListResponsePipelineTrigger(@JsonProperty("actor") ListMyPipelinesPipelineListResponsePipelineTriggerActor actor, @JsonProperty("received_at") OffsetDateTime receivedAt, @JsonProperty("type") ListMyPipelinesPipelineListResponsePipelineTriggerTypeEnum type) {
        this.actor = actor;
        this.receivedAt = receivedAt;
        this.type = type;
  }
}
