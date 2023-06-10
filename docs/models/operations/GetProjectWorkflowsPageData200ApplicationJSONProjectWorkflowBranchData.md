# GetProjectWorkflowsPageData200ApplicationJSONProjectWorkflowBranchData


## Fields

| Field                                                                                                                                                                                     | Type                                                                                                                                                                                      | Required                                                                                                                                                                                  | Description                                                                                                                                                                               | Example                                                                                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `branch`                                                                                                                                                                                  | *String*                                                                                                                                                                                  | :heavy_check_mark:                                                                                                                                                                        | The VCS branch of a workflow's trigger.                                                                                                                                                   | main                                                                                                                                                                                      |
| `metrics`                                                                                                                                                                                 | [GetProjectWorkflowsPageData200ApplicationJSONProjectWorkflowBranchDataMetrics](../../models/operations/GetProjectWorkflowsPageData200ApplicationJSONProjectWorkflowBranchDataMetrics.md) | :heavy_check_mark:                                                                                                                                                                        | Metrics aggregated across a workflow or branchfor a project.                                                                                                                              |                                                                                                                                                                                           |
| `trends`                                                                                                                                                                                  | [GetProjectWorkflowsPageData200ApplicationJSONProjectWorkflowBranchDataTrends](../../models/operations/GetProjectWorkflowsPageData200ApplicationJSONProjectWorkflowBranchDataTrends.md)   | :heavy_check_mark:                                                                                                                                                                        | Trends aggregated across a workflow or branch for a project.                                                                                                                              |                                                                                                                                                                                           |
| `workflowName`                                                                                                                                                                            | *String*                                                                                                                                                                                  | :heavy_check_mark:                                                                                                                                                                        | The name of the workflow.                                                                                                                                                                 | build-and-test                                                                                                                                                                            |