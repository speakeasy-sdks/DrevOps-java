/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class DeleteScheduleByIdResponse {
    
    public String contentType;

    public DeleteScheduleByIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * A confirmation message.
     */
    
    public DeleteScheduleByIdMessageResponse messageResponse;

    public DeleteScheduleByIdResponse withMessageResponse(DeleteScheduleByIdMessageResponse messageResponse) {
        this.messageResponse = messageResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public DeleteScheduleByIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public DeleteScheduleByIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Error response.
     */
    
    public DeleteScheduleByIdDefaultApplicationJSON deleteScheduleByIdDefaultApplicationJSONObject;

    public DeleteScheduleByIdResponse withDeleteScheduleByIdDefaultApplicationJSONObject(DeleteScheduleByIdDefaultApplicationJSON deleteScheduleByIdDefaultApplicationJSONObject) {
        this.deleteScheduleByIdDefaultApplicationJSONObject = deleteScheduleByIdDefaultApplicationJSONObject;
        return this;
    }
    
    public DeleteScheduleByIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
