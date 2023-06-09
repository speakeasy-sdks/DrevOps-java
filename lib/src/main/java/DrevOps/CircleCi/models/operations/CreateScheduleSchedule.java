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
 * CreateScheduleSchedule - A schedule response
 */
public class CreateScheduleSchedule {
    /**
     * The attribution actor who will run the scheduled pipeline.
     */
    @JsonProperty("actor")
    public CreateScheduleScheduleUser actor;

    public CreateScheduleSchedule withActor(CreateScheduleScheduleUser actor) {
        this.actor = actor;
        return this;
    }
    
    /**
     * The date and time the pipeline was created.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created-at")
    public OffsetDateTime createdAt;

    public CreateScheduleSchedule withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * Description of the schedule.
     */
    @JsonProperty("description")
    public String description;

    public CreateScheduleSchedule withDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * The unique ID of the schedule.
     */
    @JsonProperty("id")
    public String id;

    public CreateScheduleSchedule withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * Name of the schedule.
     */
    @JsonProperty("name")
    public String name;

    public CreateScheduleSchedule withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * Pipeline parameters represented as key-value pairs. Must contain branch or tag.
     */
    @JsonProperty("parameters")
    public java.util.Map<String, Object> parameters;

    public CreateScheduleSchedule withParameters(java.util.Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }
    
    /**
     * The project-slug for the schedule
     */
    @JsonProperty("project-slug")
    public String projectSlug;

    public CreateScheduleSchedule withProjectSlug(String projectSlug) {
        this.projectSlug = projectSlug;
        return this;
    }
    
    /**
     * Timetable that specifies when a schedule triggers.
     */
    @JsonProperty("timetable")
    public Object timetable;

    public CreateScheduleSchedule withTimetable(Object timetable) {
        this.timetable = timetable;
        return this;
    }
    
    /**
     * The date and time the pipeline was last updated.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated-at")
    public OffsetDateTime updatedAt;

    public CreateScheduleSchedule withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    public CreateScheduleSchedule(@JsonProperty("actor") CreateScheduleScheduleUser actor, @JsonProperty("created-at") OffsetDateTime createdAt, @JsonProperty("description") String description, @JsonProperty("id") String id, @JsonProperty("name") String name, @JsonProperty("parameters") java.util.Map<String, Object> parameters, @JsonProperty("project-slug") String projectSlug, @JsonProperty("timetable") Object timetable, @JsonProperty("updated-at") OffsetDateTime updatedAt) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.description = description;
        this.id = id;
        this.name = name;
        this.parameters = parameters;
        this.projectSlug = projectSlug;
        this.timetable = timetable;
        this.updatedAt = updatedAt;
  }
}
