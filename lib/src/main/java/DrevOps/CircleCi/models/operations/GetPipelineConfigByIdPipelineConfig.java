/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPipelineConfigByIdPipelineConfig - The configuration strings for the pipeline.
 */
public class GetPipelineConfigByIdPipelineConfig {
    /**
     * The compiled configuration for the pipeline, after all orb expansion has been performed. If there were errors processing the pipeline's configuration, then this field may be empty.
     */
    @JsonProperty("compiled")
    public String compiled;

    public GetPipelineConfigByIdPipelineConfig withCompiled(String compiled) {
        this.compiled = compiled;
        return this;
    }
    
    /**
     * The compiled setup configuration for the pipeline, after all orb expansion has been performed. If there were errors processing the pipeline's setup workflows, then this field may be empty.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compiled-setup-config")
    public String compiledSetupConfig;

    public GetPipelineConfigByIdPipelineConfig withCompiledSetupConfig(String compiledSetupConfig) {
        this.compiledSetupConfig = compiledSetupConfig;
        return this;
    }
    
    /**
     * The setup configuration for the pipeline used for Setup Workflows. If there were errors processing the pipeline's configuration or if setup workflows are not enabled, then this field should not exist
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("setup-config")
    public String setupConfig;

    public GetPipelineConfigByIdPipelineConfig withSetupConfig(String setupConfig) {
        this.setupConfig = setupConfig;
        return this;
    }
    
    /**
     * The source configuration for the pipeline, before any config compilation has been performed. If there is no config, then this field will be empty.
     */
    @JsonProperty("source")
    public String source;

    public GetPipelineConfigByIdPipelineConfig withSource(String source) {
        this.source = source;
        return this;
    }
    
    public GetPipelineConfigByIdPipelineConfig(@JsonProperty("compiled") String compiled, @JsonProperty("source") String source) {
        this.compiled = compiled;
        this.source = source;
  }
}
