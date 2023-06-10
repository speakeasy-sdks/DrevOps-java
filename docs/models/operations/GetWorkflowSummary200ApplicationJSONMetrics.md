# GetWorkflowSummary200ApplicationJSONMetrics

Metrics aggregated across a workflow for a given time window.


## Fields

| Field                                                                                                                                                                             | Type                                                                                                                                                                              | Required                                                                                                                                                                          | Description                                                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `durationMetrics`                                                                                                                                                                 | [GetWorkflowSummary200ApplicationJSONMetricsDurationMetrics](../../models/operations/GetWorkflowSummary200ApplicationJSONMetricsDurationMetrics.md)                               | :heavy_check_mark:                                                                                                                                                                | Metrics relating to the duration of runs for a workflow.                                                                                                                          |
| `failedRuns`                                                                                                                                                                      | *Long*                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                | The number of failed runs.                                                                                                                                                        |
| `mttr`                                                                                                                                                                            | *Long*                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                | The mean time to recovery (mean time between failures and their next success) in seconds.                                                                                         |
| `successRate`                                                                                                                                                                     | *Float*                                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                                | N/A                                                                                                                                                                               |
| `successfulRuns`                                                                                                                                                                  | *Long*                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                | The number of successful runs.                                                                                                                                                    |
| `throughput`                                                                                                                                                                      | *Float*                                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                                | The average number of runs per day.                                                                                                                                               |
| `totalCreditsUsed`                                                                                                                                                                | *Long*                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                | The total credits consumed by the workflow in the aggregation window. Note that Insights is not a real time financial reporting tool and should not be used for credit reporting. |
| `totalRuns`                                                                                                                                                                       | *Long*                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                | The total number of runs.                                                                                                                                                         |
| `windowEnd`                                                                                                                                                                       | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                                                                         | :heavy_check_mark:                                                                                                                                                                | The end of the aggregation window for workflow metrics.                                                                                                                           |
| `windowStart`                                                                                                                                                                     | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                                                                         | :heavy_check_mark:                                                                                                                                                                | The start of the aggregation window for workflow metrics.                                                                                                                         |