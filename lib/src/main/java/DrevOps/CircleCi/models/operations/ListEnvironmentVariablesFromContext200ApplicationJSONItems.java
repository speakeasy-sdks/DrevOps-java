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

public class ListEnvironmentVariablesFromContext200ApplicationJSONItems {
    /**
     * ID of the context (UUID)
     */
    @JsonProperty("context_id")
    public String contextId;
    public ListEnvironmentVariablesFromContext200ApplicationJSONItems withContextId(String contextId) {
        this.contextId = contextId;
        return this;
    }
    
    /**
     * The date and time the environment variable was created.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public ListEnvironmentVariablesFromContext200ApplicationJSONItems withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * The date and time the environment variable was updated
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public ListEnvironmentVariablesFromContext200ApplicationJSONItems withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    /**
     * The name of the environment variable
     */
    @JsonProperty("variable")
    public String variable;
    public ListEnvironmentVariablesFromContext200ApplicationJSONItems withVariable(String variable) {
        this.variable = variable;
        return this;
    }
    
    public ListEnvironmentVariablesFromContext200ApplicationJSONItems(@JsonProperty("context_id") String contextId, @JsonProperty("created_at") OffsetDateTime createdAt, @JsonProperty("updated_at") OffsetDateTime updatedAt, @JsonProperty("variable") String variable) {
        this.contextId = contextId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.variable = variable;
  }
}
