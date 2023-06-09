/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * GetCheckoutKeyCheckoutKeyCheckoutKeyType - The type of checkout key. This may be either `deploy-key` or `github-user-key`.
 */
public enum GetCheckoutKeyCheckoutKeyCheckoutKeyType {
    DEPLOY_KEY("deploy-key"),
    GITHUB_USER_KEY("github-user-key");

    @JsonValue
    public final String value;

    private GetCheckoutKeyCheckoutKeyCheckoutKeyType(String value) {
        this.value = value;
    }
}
