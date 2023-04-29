/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ListPipelinesPipelineListResponsePipelineErrorsTypeEnum - The type of error.
 */
public enum ListPipelinesPipelineListResponsePipelineErrorsTypeEnum {
    CONFIG("config"),
    CONFIG_FETCH("config-fetch"),
    TIMEOUT("timeout"),
    PERMISSION("permission"),
    OTHER("other"),
    PLAN("plan");

    @JsonValue
    public final String value;

    private ListPipelinesPipelineListResponsePipelineErrorsTypeEnum(String value) {
        this.value = value;
    }
}
