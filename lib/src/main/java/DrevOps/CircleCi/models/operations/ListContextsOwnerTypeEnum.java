/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ListContextsOwnerTypeEnum - The type of the owner. Defaults to "organization". Accounts are only used as context owners in server.
 */
public enum ListContextsOwnerTypeEnum {
    ACCOUNT("account"),
    ORGANIZATION("organization");

    @JsonValue
    public final String value;

    private ListContextsOwnerTypeEnum(String value) {
        this.value = value;
    }
}
