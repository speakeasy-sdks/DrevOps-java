/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * GetScheduleByIdScheduleTimetable2Months - Month, in three letters format.
 */
public enum GetScheduleByIdScheduleTimetable2Months {
    MAR("MAR"),
    NOV("NOV"),
    DEC("DEC"),
    JUN("JUN"),
    MAY("MAY"),
    OCT("OCT"),
    FEB("FEB"),
    APR("APR"),
    SEP("SEP"),
    AUG("AUG"),
    JAN("JAN"),
    JUL("JUL");

    @JsonValue
    public final String value;

    private GetScheduleByIdScheduleTimetable2Months(String value) {
        this.value = value;
    }
}