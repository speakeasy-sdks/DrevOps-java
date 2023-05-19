/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListSchedulesForProject200ApplicationJSONScheduleTimetable1 - Timetable that specifies when a schedule triggers.
 */
public class ListSchedulesForProject200ApplicationJSONScheduleTimetable1 {
    /**
     * Days in a month in which the schedule triggers. This is mutually exclusive with days in a week.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("days-of-month")
    public Long[] daysOfMonth;

    public ListSchedulesForProject200ApplicationJSONScheduleTimetable1 withDaysOfMonth(Long[] daysOfMonth) {
        this.daysOfMonth = daysOfMonth;
        return this;
    }
    
    /**
     * Days in a week in which the schedule triggers.
     */
    @JsonProperty("days-of-week")
    public ListSchedulesForProject200ApplicationJSONScheduleTimetable1DaysOfWeek[] daysOfWeek;

    public ListSchedulesForProject200ApplicationJSONScheduleTimetable1 withDaysOfWeek(ListSchedulesForProject200ApplicationJSONScheduleTimetable1DaysOfWeek[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
        return this;
    }
    
    /**
     * Hours in a day in which the schedule triggers.
     */
    @JsonProperty("hours-of-day")
    public Long[] hoursOfDay;

    public ListSchedulesForProject200ApplicationJSONScheduleTimetable1 withHoursOfDay(Long[] hoursOfDay) {
        this.hoursOfDay = hoursOfDay;
        return this;
    }
    
    /**
     * Months in which the schedule triggers.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("months")
    public ListSchedulesForProject200ApplicationJSONScheduleTimetable1Months[] months;

    public ListSchedulesForProject200ApplicationJSONScheduleTimetable1 withMonths(ListSchedulesForProject200ApplicationJSONScheduleTimetable1Months[] months) {
        this.months = months;
        return this;
    }
    
    /**
     * Number of times a schedule triggers per hour, value must be between 1 and 60
     */
    @JsonProperty("per-hour")
    public Long perHour;

    public ListSchedulesForProject200ApplicationJSONScheduleTimetable1 withPerHour(Long perHour) {
        this.perHour = perHour;
        return this;
    }
    
    public ListSchedulesForProject200ApplicationJSONScheduleTimetable1(@JsonProperty("days-of-week") ListSchedulesForProject200ApplicationJSONScheduleTimetable1DaysOfWeek[] daysOfWeek, @JsonProperty("hours-of-day") Long[] hoursOfDay, @JsonProperty("per-hour") Long perHour) {
        this.daysOfWeek = daysOfWeek;
        this.hoursOfDay = hoursOfDay;
        this.perHour = perHour;
  }
}
