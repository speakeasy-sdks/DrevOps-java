/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetJobDetailsJobDetailsExecutor - Information about executor used for a job.
 */
public class GetJobDetailsJobDetailsExecutor {
    /**
     * Resource class name.
     */
    @JsonProperty("resource_class")
    public String resourceClass;

    public GetJobDetailsJobDetailsExecutor withResourceClass(String resourceClass) {
        this.resourceClass = resourceClass;
        return this;
    }
    
    /**
     * Executor type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;

    public GetJobDetailsJobDetailsExecutor withType(String type) {
        this.type = type;
        return this;
    }
    
    public GetJobDetailsJobDetailsExecutor(@JsonProperty("resource_class") String resourceClass) {
        this.resourceClass = resourceClass;
  }
}
