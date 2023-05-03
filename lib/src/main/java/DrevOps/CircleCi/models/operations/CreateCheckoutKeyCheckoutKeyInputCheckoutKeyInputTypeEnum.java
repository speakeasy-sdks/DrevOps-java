/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CreateCheckoutKeyCheckoutKeyInputCheckoutKeyInputTypeEnum - The type of checkout key to create. This may be either `deploy-key` or `user-key`.
 */
public enum CreateCheckoutKeyCheckoutKeyInputCheckoutKeyInputTypeEnum {
    USER_KEY("user-key"),
    DEPLOY_KEY("deploy-key");

    @JsonValue
    public final String value;

    private CreateCheckoutKeyCheckoutKeyInputCheckoutKeyInputTypeEnum(String value) {
        this.value = value;
    }
}