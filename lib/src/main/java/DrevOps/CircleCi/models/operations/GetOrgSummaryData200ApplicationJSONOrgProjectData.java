/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetOrgSummaryData200ApplicationJSONOrgProjectData {
    /**
     * Metrics for a single project, across all branches.
     */
    @JsonProperty("metrics")
    public GetOrgSummaryData200ApplicationJSONOrgProjectDataMetrics metrics;

    public GetOrgSummaryData200ApplicationJSONOrgProjectData withMetrics(GetOrgSummaryData200ApplicationJSONOrgProjectDataMetrics metrics) {
        this.metrics = metrics;
        return this;
    }
    
    /**
     * The name of the project.
     */
    @JsonProperty("project_name")
    public String projectName;

    public GetOrgSummaryData200ApplicationJSONOrgProjectData withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    
    /**
     * Trends for a single project, across all branches.
     */
    @JsonProperty("trends")
    public GetOrgSummaryData200ApplicationJSONOrgProjectDataTrends trends;

    public GetOrgSummaryData200ApplicationJSONOrgProjectData withTrends(GetOrgSummaryData200ApplicationJSONOrgProjectDataTrends trends) {
        this.trends = trends;
        return this;
    }
    
    public GetOrgSummaryData200ApplicationJSONOrgProjectData(@JsonProperty("metrics") GetOrgSummaryData200ApplicationJSONOrgProjectDataMetrics metrics, @JsonProperty("project_name") String projectName, @JsonProperty("trends") GetOrgSummaryData200ApplicationJSONOrgProjectDataTrends trends) {
        this.metrics = metrics;
        this.projectName = projectName;
        this.trends = trends;
  }
}
