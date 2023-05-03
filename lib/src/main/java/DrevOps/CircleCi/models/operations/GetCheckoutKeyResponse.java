/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetCheckoutKeyResponse {
    /**
     * The checkout key.
     */
    
    public GetCheckoutKeyCheckoutKey checkoutKey;
    public GetCheckoutKeyResponse withCheckoutKey(GetCheckoutKeyCheckoutKey checkoutKey) {
        this.checkoutKey = checkoutKey;
        return this;
    }
    
    
    public String contentType;
    public GetCheckoutKeyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public GetCheckoutKeyResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetCheckoutKeyResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Error response.
     */
    
    public GetCheckoutKeyDefaultApplicationJSON getCheckoutKeyDefaultApplicationJSONObject;
    public GetCheckoutKeyResponse withGetCheckoutKeyDefaultApplicationJSONObject(GetCheckoutKeyDefaultApplicationJSON getCheckoutKeyDefaultApplicationJSONObject) {
        this.getCheckoutKeyDefaultApplicationJSONObject = getCheckoutKeyDefaultApplicationJSONObject;
        return this;
    }
    
    public GetCheckoutKeyResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}