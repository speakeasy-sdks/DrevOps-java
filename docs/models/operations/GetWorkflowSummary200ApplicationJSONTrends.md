# GetWorkflowSummary200ApplicationJSONTrends

Trends for aggregated metrics across a workflow for a given time window.


## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `failedRuns`                                                                         | *Float*                                                                              | :heavy_check_mark:                                                                   | The trend value for number of failed runs.                                           |
| `medianDurationSecs`                                                                 | *Float*                                                                              | :heavy_check_mark:                                                                   | Trend value for the 50th percentile duration for a workflow for a given time window. |
| `mttr`                                                                               | *Float*                                                                              | :heavy_check_mark:                                                                   | trend for mean time to recovery (mean time between failures and their next success). |
| `p95DurationSecs`                                                                    | *Float*                                                                              | :heavy_check_mark:                                                                   | Trend value for the 95th percentile duration for a workflow for a given time window. |
| `successRate`                                                                        | *Float*                                                                              | :heavy_check_mark:                                                                   | The trend value for the success rate.                                                |
| `throughput`                                                                         | *Float*                                                                              | :heavy_check_mark:                                                                   | Trend value for the average number of runs per day.                                  |
| `totalCreditsUsed`                                                                   | *Float*                                                                              | :heavy_check_mark:                                                                   | The trend value for total credits consumed.                                          |
| `totalRuns`                                                                          | *Float*                                                                              | :heavy_check_mark:                                                                   | The trend value for total number of runs.                                            |