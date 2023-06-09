/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import DrevOps.CircleCi.utils.DateTimeDeserializer;
import DrevOps.CircleCi.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

public class ListCheckoutKeysCheckoutKeyListResponseCheckoutKey {
    /**
     * The date and time the checkout key was created.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created-at")
    public OffsetDateTime createdAt;

    public ListCheckoutKeysCheckoutKeyListResponseCheckoutKey withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * An SSH key fingerprint.
     */
    @JsonProperty("fingerprint")
    public String fingerprint;

    public ListCheckoutKeysCheckoutKeyListResponseCheckoutKey withFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }
    
    /**
     * A boolean value that indicates if this key is preferred.
     */
    @JsonProperty("preferred")
    public Boolean preferred;

    public ListCheckoutKeysCheckoutKeyListResponseCheckoutKey withPreferred(Boolean preferred) {
        this.preferred = preferred;
        return this;
    }
    
    /**
     * A public SSH key.
     */
    @JsonProperty("public-key")
    public String publicKey;

    public ListCheckoutKeysCheckoutKeyListResponseCheckoutKey withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    
    /**
     * The type of checkout key. This may be either `deploy-key` or `github-user-key`.
     */
    @JsonProperty("type")
    public ListCheckoutKeysCheckoutKeyListResponseCheckoutKeyCheckoutKeyType type;

    public ListCheckoutKeysCheckoutKeyListResponseCheckoutKey withType(ListCheckoutKeysCheckoutKeyListResponseCheckoutKeyCheckoutKeyType type) {
        this.type = type;
        return this;
    }
    
    public ListCheckoutKeysCheckoutKeyListResponseCheckoutKey(@JsonProperty("created-at") OffsetDateTime createdAt, @JsonProperty("fingerprint") String fingerprint, @JsonProperty("preferred") Boolean preferred, @JsonProperty("public-key") String publicKey, @JsonProperty("type") ListCheckoutKeysCheckoutKeyListResponseCheckoutKeyCheckoutKeyType type) {
        this.createdAt = createdAt;
        this.fingerprint = fingerprint;
        this.preferred = preferred;
        this.publicKey = publicKey;
        this.type = type;
  }
}
