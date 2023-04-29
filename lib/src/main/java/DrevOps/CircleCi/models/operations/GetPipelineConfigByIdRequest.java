/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import DrevOps.CircleCi.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPipelineConfigByIdRequest {
    /**
     * The unique ID of the pipeline.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=pipeline-id")
    public String pipelineId;
    public GetPipelineConfigByIdRequest withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    
    public GetPipelineConfigByIdRequest(@JsonProperty("pipeline-id") String pipelineId) {
        this.pipelineId = pipelineId;
  }
}
