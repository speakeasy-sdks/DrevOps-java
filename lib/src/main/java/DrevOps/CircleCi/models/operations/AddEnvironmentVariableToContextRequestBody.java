/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddEnvironmentVariableToContextRequestBody {
    /**
     * The value of the environment variable
     */
    @JsonProperty("value")
    public String value;

    public AddEnvironmentVariableToContextRequestBody withValue(String value) {
        this.value = value;
        return this;
    }
    
    public AddEnvironmentVariableToContextRequestBody(@JsonProperty("value") String value) {
        this.value = value;
  }
}
