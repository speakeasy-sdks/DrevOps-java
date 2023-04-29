/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateScheduleScheduleTimetable2 - Timetable that specifies when a schedule triggers.
 */
public class CreateScheduleScheduleTimetable2 {
    /**
     * Days in a month in which the schedule triggers. This is mutually exclusive with days in a week.
     */
    @JsonProperty("days-of-month")
    public Long[] daysOfMonth;
    public CreateScheduleScheduleTimetable2 withDaysOfMonth(Long[] daysOfMonth) {
        this.daysOfMonth = daysOfMonth;
        return this;
    }
    
    /**
     * Days in a week in which the schedule triggers.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("days-of-week")
    public CreateScheduleScheduleTimetable2DaysOfWeekEnum[] daysOfWeek;
    public CreateScheduleScheduleTimetable2 withDaysOfWeek(CreateScheduleScheduleTimetable2DaysOfWeekEnum[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
        return this;
    }
    
    /**
     * Hours in a day in which the schedule triggers.
     */
    @JsonProperty("hours-of-day")
    public Long[] hoursOfDay;
    public CreateScheduleScheduleTimetable2 withHoursOfDay(Long[] hoursOfDay) {
        this.hoursOfDay = hoursOfDay;
        return this;
    }
    
    /**
     * Months in which the schedule triggers.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("months")
    public CreateScheduleScheduleTimetable2MonthsEnum[] months;
    public CreateScheduleScheduleTimetable2 withMonths(CreateScheduleScheduleTimetable2MonthsEnum[] months) {
        this.months = months;
        return this;
    }
    
    /**
     * Number of times a schedule triggers per hour, value must be between 1 and 60
     */
    @JsonProperty("per-hour")
    public Long perHour;
    public CreateScheduleScheduleTimetable2 withPerHour(Long perHour) {
        this.perHour = perHour;
        return this;
    }
    
    public CreateScheduleScheduleTimetable2(@JsonProperty("days-of-month") Long[] daysOfMonth, @JsonProperty("hours-of-day") Long[] hoursOfDay, @JsonProperty("per-hour") Long perHour) {
        this.daysOfMonth = daysOfMonth;
        this.hoursOfDay = hoursOfDay;
        this.perHour = perHour;
  }
}
