/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class ListCheckoutKeysResponse {
    /**
     * A sequence of checkout keys.
     */
    
    public ListCheckoutKeysCheckoutKeyListResponse checkoutKeyListResponse;

    public ListCheckoutKeysResponse withCheckoutKeyListResponse(ListCheckoutKeysCheckoutKeyListResponse checkoutKeyListResponse) {
        this.checkoutKeyListResponse = checkoutKeyListResponse;
        return this;
    }
    
    
    public String contentType;

    public ListCheckoutKeysResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public ListCheckoutKeysResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public ListCheckoutKeysResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Error response.
     */
    
    public ListCheckoutKeysDefaultApplicationJSON listCheckoutKeysDefaultApplicationJSONObject;

    public ListCheckoutKeysResponse withListCheckoutKeysDefaultApplicationJSONObject(ListCheckoutKeysDefaultApplicationJSON listCheckoutKeysDefaultApplicationJSONObject) {
        this.listCheckoutKeysDefaultApplicationJSONObject = listCheckoutKeysDefaultApplicationJSONObject;
        return this;
    }
    
    public ListCheckoutKeysResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
