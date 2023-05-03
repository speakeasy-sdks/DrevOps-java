/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateEnvVarEnvironmentVariablePair - The environment variable.
 */
public class CreateEnvVarEnvironmentVariablePair {
    /**
     * The name of the environment variable.
     */
    @JsonProperty("name")
    public String name;
    public CreateEnvVarEnvironmentVariablePair withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * The value of the environment variable.
     */
    @JsonProperty("value")
    public String value;
    public CreateEnvVarEnvironmentVariablePair withValue(String value) {
        this.value = value;
        return this;
    }
    
    public CreateEnvVarEnvironmentVariablePair(@JsonProperty("name") String name, @JsonProperty("value") String value) {
        this.name = name;
        this.value = value;
  }
}