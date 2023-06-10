# GetProjectWorkflowsPageData200ApplicationJSONProjectWorkflowBranchDataMetrics

Metrics aggregated across a workflow or branchfor a project.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `p95DurationSecs`                                                | *Float*                                                          | :heavy_check_mark:                                               | The 95th percentile duration among a group of workflow runs.     |
| `successRate`                                                    | *Float*                                                          | :heavy_check_mark:                                               | N/A                                                              |
| `totalCreditsUsed`                                               | *Long*                                                           | :heavy_check_mark:                                               | The total credits consumed over the current timeseries interval. |
| `totalRuns`                                                      | *Long*                                                           | :heavy_check_mark:                                               | The total number of runs.                                        |