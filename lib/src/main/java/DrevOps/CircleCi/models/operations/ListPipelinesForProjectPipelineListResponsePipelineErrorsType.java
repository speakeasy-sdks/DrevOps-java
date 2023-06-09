/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ListPipelinesForProjectPipelineListResponsePipelineErrorsType - The type of error.
 */
public enum ListPipelinesForProjectPipelineListResponsePipelineErrorsType {
    CONFIG("config"),
    CONFIG_FETCH("config-fetch"),
    TIMEOUT("timeout"),
    PERMISSION("permission"),
    OTHER("other"),
    PLAN("plan");

    @JsonValue
    public final String value;

    private ListPipelinesForProjectPipelineListResponsePipelineErrorsType(String value) {
        this.value = value;
    }
}
