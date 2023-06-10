# GetProjectWorkflowsPageData200ApplicationJSONProjectDataTrends

Metric trends aggregated across all workflows and branches for a project.


## Fields

| Field                                               | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `successRate`                                       | *Float*                                             | :heavy_check_mark:                                  | The trend value for the success rate.               |
| `throughput`                                        | *Float*                                             | :heavy_check_mark:                                  | Trend value for the average number of runs per day. |
| `totalCreditsUsed`                                  | *Float*                                             | :heavy_check_mark:                                  | The trend value for total credits consumed.         |
| `totalDurationSecs`                                 | *Float*                                             | :heavy_check_mark:                                  | Trend value for total duration.                     |
| `totalRuns`                                         | *Float*                                             | :heavy_check_mark:                                  | The trend value for total number of runs.           |