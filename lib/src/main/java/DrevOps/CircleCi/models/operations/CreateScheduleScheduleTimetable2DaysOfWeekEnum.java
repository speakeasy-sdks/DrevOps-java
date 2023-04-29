/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CreateScheduleScheduleTimetable2DaysOfWeekEnum - Day in a week, in three letters format
 */
public enum CreateScheduleScheduleTimetable2DaysOfWeekEnum {
    TUE("TUE"),
    SAT("SAT"),
    SUN("SUN"),
    MON("MON"),
    THU("THU"),
    WED("WED"),
    FRI("FRI");

    @JsonValue
    public final String value;

    private CreateScheduleScheduleTimetable2DaysOfWeekEnum(String value) {
        this.value = value;
    }
}
