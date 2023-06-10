# GetOrgSummaryData200ApplicationJSONOrgDataMetrics

Metrics for a single org metrics.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `successRate`                                                    | *Float*                                                          | :heavy_check_mark:                                               | N/A                                                              |
| `throughput`                                                     | *Float*                                                          | :heavy_check_mark:                                               | The average number of runs per day.                              |
| `totalCreditsUsed`                                               | *Long*                                                           | :heavy_check_mark:                                               | The total credits consumed over the current timeseries interval. |
| `totalDurationSecs`                                              | *Long*                                                           | :heavy_check_mark:                                               | Total duration, in seconds.                                      |
| `totalRuns`                                                      | *Long*                                                           | :heavy_check_mark:                                               | The total number of runs.                                        |