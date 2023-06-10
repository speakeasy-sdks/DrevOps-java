# GetProjectWorkflowsPageData200ApplicationJSONProjectWorkflowBranchDataTrends

Trends aggregated across a workflow or branch for a project.


## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `p95DurationSecs`                                            | *Float*                                                      | :heavy_check_mark:                                           | The 95th percentile duration among a group of workflow runs. |
| `successRate`                                                | *Float*                                                      | :heavy_check_mark:                                           | The trend value for the success rate.                        |
| `totalCreditsUsed`                                           | *Float*                                                      | :heavy_check_mark:                                           | The trend value for total credits consumed.                  |
| `totalRuns`                                                  | *Float*                                                      | :heavy_check_mark:                                           | The trend value for total number of runs.                    |