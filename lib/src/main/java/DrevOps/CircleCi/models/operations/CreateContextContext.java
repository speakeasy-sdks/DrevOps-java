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
 * CreateContextContext - The new context
 */
public class CreateContextContext {
    /**
     * The date and time the context was created.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public CreateContextContext withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * The unique ID of the context.
     */
    @JsonProperty("id")
    public String id;

    public CreateContextContext withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The user defined name of the context.
     */
    @JsonProperty("name")
    public String name;

    public CreateContextContext withName(String name) {
        this.name = name;
        return this;
    }
    
    public CreateContextContext(@JsonProperty("created_at") OffsetDateTime createdAt, @JsonProperty("id") String id, @JsonProperty("name") String name) {
        this.createdAt = createdAt;
        this.id = id;
        this.name = name;
  }
}
