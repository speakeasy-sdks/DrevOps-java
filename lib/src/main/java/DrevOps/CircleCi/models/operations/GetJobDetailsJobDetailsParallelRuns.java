/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetJobDetailsJobDetailsParallelRuns - Info about a status of the parallel run.
 */
public class GetJobDetailsJobDetailsParallelRuns {
    /**
     * Index of the parallel run.
     */
    @JsonProperty("index")
    public Long index;

    public GetJobDetailsJobDetailsParallelRuns withIndex(Long index) {
        this.index = index;
        return this;
    }
    
    /**
     * Status of the parallel run.
     */
    @JsonProperty("status")
    public String status;

    public GetJobDetailsJobDetailsParallelRuns withStatus(String status) {
        this.status = status;
        return this;
    }
    
    public GetJobDetailsJobDetailsParallelRuns(@JsonProperty("index") Long index, @JsonProperty("status") String status) {
        this.index = index;
        this.status = status;
  }
}
