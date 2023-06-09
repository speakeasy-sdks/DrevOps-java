/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetProjectBySlugResponse {
    
    public String contentType;

    public GetProjectBySlugResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * A project object
     */
    
    public GetProjectBySlugProject project;

    public GetProjectBySlugResponse withProject(GetProjectBySlugProject project) {
        this.project = project;
        return this;
    }
    
    
    public Integer statusCode;

    public GetProjectBySlugResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetProjectBySlugResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Error response.
     */
    
    public GetProjectBySlugDefaultApplicationJSON getProjectBySlugDefaultApplicationJSONObject;

    public GetProjectBySlugResponse withGetProjectBySlugDefaultApplicationJSONObject(GetProjectBySlugDefaultApplicationJSON getProjectBySlugDefaultApplicationJSONObject) {
        this.getProjectBySlugDefaultApplicationJSONObject = getProjectBySlugDefaultApplicationJSONObject;
        return this;
    }
    
    public GetProjectBySlugResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
