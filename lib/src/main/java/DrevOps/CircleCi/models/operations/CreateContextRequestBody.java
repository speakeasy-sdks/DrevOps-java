/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateContextRequestBody {
    /**
     * The user defined name of the context.
     */
    @JsonProperty("name")
    public String name;

    public CreateContextRequestBody withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("owner")
    public Object owner;

    public CreateContextRequestBody withOwner(Object owner) {
        this.owner = owner;
        return this;
    }
    
    public CreateContextRequestBody(@JsonProperty("name") String name, @JsonProperty("owner") Object owner) {
        this.name = name;
        this.owner = owner;
  }
}
