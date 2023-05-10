/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetOrgSummaryData200ApplicationJSON - Summary metrics with trends for the entire org, and for each project.
 */
public class GetOrgSummaryData200ApplicationJSON {
    /**
     * A list of all the project names in the organization.
     */
    @JsonProperty("all_projects")
    public String[] allProjects;

    public GetOrgSummaryData200ApplicationJSON withAllProjects(String[] allProjects) {
        this.allProjects = allProjects;
        return this;
    }
    
    /**
     * Aggregated metrics for an org, with trends.
     */
    @JsonProperty("org_data")
    public GetOrgSummaryData200ApplicationJSONOrgData orgData;

    public GetOrgSummaryData200ApplicationJSON withOrgData(GetOrgSummaryData200ApplicationJSONOrgData orgData) {
        this.orgData = orgData;
        return this;
    }
    
    /**
     * Metrics for a single project, across all branches
     */
    @JsonProperty("org_project_data")
    public GetOrgSummaryData200ApplicationJSONOrgProjectData[] orgProjectData;

    public GetOrgSummaryData200ApplicationJSON withOrgProjectData(GetOrgSummaryData200ApplicationJSONOrgProjectData[] orgProjectData) {
        this.orgProjectData = orgProjectData;
        return this;
    }
    
    public GetOrgSummaryData200ApplicationJSON(@JsonProperty("all_projects") String[] allProjects, @JsonProperty("org_data") GetOrgSummaryData200ApplicationJSONOrgData orgData, @JsonProperty("org_project_data") GetOrgSummaryData200ApplicationJSONOrgProjectData[] orgProjectData) {
        this.allProjects = allProjects;
        this.orgData = orgData;
        this.orgProjectData = orgProjectData;
  }
}
