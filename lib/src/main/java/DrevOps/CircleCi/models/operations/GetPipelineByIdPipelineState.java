/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * GetPipelineByIdPipelineState - The current state of the pipeline.
 */
public enum GetPipelineByIdPipelineState {
    CREATED("created"),
    ERRORED("errored"),
    SETUP_PENDING("setup-pending"),
    SETUP("setup"),
    PENDING("pending");

    @JsonValue
    public final String value;

    private GetPipelineByIdPipelineState(String value) {
        this.value = value;
    }
}
