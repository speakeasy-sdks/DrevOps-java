/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import DrevOps.CircleCi.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteEnvironmentVariableFromContextRequest {
    /**
     * ID of the context (UUID)
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=context-id")
    public String contextId;
    public DeleteEnvironmentVariableFromContextRequest withContextId(String contextId) {
        this.contextId = contextId;
        return this;
    }
    
    /**
     * The name of the environment variable
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=env-var-name")
    public String envVarName;
    public DeleteEnvironmentVariableFromContextRequest withEnvVarName(String envVarName) {
        this.envVarName = envVarName;
        return this;
    }
    
    public DeleteEnvironmentVariableFromContextRequest(@JsonProperty("context-id") String contextId, @JsonProperty("env-var-name") String envVarName) {
        this.contextId = contextId;
        this.envVarName = envVarName;
  }
}