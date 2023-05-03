/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ListMyPipelinesPipelineListResponsePipelineErrorsTypeEnum - The type of error.
 */
public enum ListMyPipelinesPipelineListResponsePipelineErrorsTypeEnum {
    CONFIG("config"),
    CONFIG_FETCH("config-fetch"),
    TIMEOUT("timeout"),
    PERMISSION("permission"),
    OTHER("other"),
    PLAN("plan");

    @JsonValue
    public final String value;

    private ListMyPipelinesPipelineListResponsePipelineErrorsTypeEnum(String value) {
        this.value = value;
    }
}