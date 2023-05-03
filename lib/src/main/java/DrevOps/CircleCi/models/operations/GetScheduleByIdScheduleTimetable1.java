/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetScheduleByIdScheduleTimetable1 - Timetable that specifies when a schedule triggers.
 */
public class GetScheduleByIdScheduleTimetable1 {
    /**
     * Days in a month in which the schedule triggers. This is mutually exclusive with days in a week.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("days-of-month")
    public Long[] daysOfMonth;
    public GetScheduleByIdScheduleTimetable1 withDaysOfMonth(Long[] daysOfMonth) {
        this.daysOfMonth = daysOfMonth;
        return this;
    }
    
    /**
     * Days in a week in which the schedule triggers.
     */
    @JsonProperty("days-of-week")
    public GetScheduleByIdScheduleTimetable1DaysOfWeekEnum[] daysOfWeek;
    public GetScheduleByIdScheduleTimetable1 withDaysOfWeek(GetScheduleByIdScheduleTimetable1DaysOfWeekEnum[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
        return this;
    }
    
    /**
     * Hours in a day in which the schedule triggers.
     */
    @JsonProperty("hours-of-day")
    public Long[] hoursOfDay;
    public GetScheduleByIdScheduleTimetable1 withHoursOfDay(Long[] hoursOfDay) {
        this.hoursOfDay = hoursOfDay;
        return this;
    }
    
    /**
     * Months in which the schedule triggers.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("months")
    public GetScheduleByIdScheduleTimetable1MonthsEnum[] months;
    public GetScheduleByIdScheduleTimetable1 withMonths(GetScheduleByIdScheduleTimetable1MonthsEnum[] months) {
        this.months = months;
        return this;
    }
    
    /**
     * Number of times a schedule triggers per hour, value must be between 1 and 60
     */
    @JsonProperty("per-hour")
    public Long perHour;
    public GetScheduleByIdScheduleTimetable1 withPerHour(Long perHour) {
        this.perHour = perHour;
        return this;
    }
    
    public GetScheduleByIdScheduleTimetable1(@JsonProperty("days-of-week") GetScheduleByIdScheduleTimetable1DaysOfWeekEnum[] daysOfWeek, @JsonProperty("hours-of-day") Long[] hoursOfDay, @JsonProperty("per-hour") Long perHour) {
        this.daysOfWeek = daysOfWeek;
        this.hoursOfDay = hoursOfDay;
        this.perHour = perHour;
  }
}