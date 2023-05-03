/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import DrevOps.CircleCi.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteScheduleByIdRequest {
    /**
     * The unique ID of the schedule.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=schedule-id")
    public String scheduleId;
    public DeleteScheduleByIdRequest withScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    
    public DeleteScheduleByIdRequest(@JsonProperty("schedule-id") String scheduleId) {
        this.scheduleId = scheduleId;
  }
}