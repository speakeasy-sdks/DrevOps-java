/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * GetPipelineByIdPipelineStateEnum - The current state of the pipeline.
 */
public enum GetPipelineByIdPipelineStateEnum {
    CREATED("created"),
    ERRORED("errored"),
    SETUP_PENDING("setup-pending"),
    SETUP("setup"),
    PENDING("pending");

    @JsonValue
    public final String value;

    private GetPipelineByIdPipelineStateEnum(String value) {
        this.value = value;
    }
}
