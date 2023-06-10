# GetProjectWorkflowRuns200ApplicationJSONItems


## Fields

| Field                                                                                                                                                    | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              | Example                                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `branch`                                                                                                                                                 | *String*                                                                                                                                                 | :heavy_check_mark:                                                                                                                                       | The VCS branch of a Workflow's trigger.                                                                                                                  | main                                                                                                                                                     |
| `createdAt`                                                                                                                                              | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                                                | :heavy_check_mark:                                                                                                                                       | The date and time the workflow was created.                                                                                                              |                                                                                                                                                          |
| `creditsUsed`                                                                                                                                            | *Long*                                                                                                                                                   | :heavy_check_mark:                                                                                                                                       | The number of credits used during execution. Note that Insights is not a real time financial reporting tool and should not be used for credit reporting. |                                                                                                                                                          |
| `duration`                                                                                                                                               | *Long*                                                                                                                                                   | :heavy_check_mark:                                                                                                                                       | The duration in seconds of a run.                                                                                                                        |                                                                                                                                                          |
| `id`                                                                                                                                                     | *String*                                                                                                                                                 | :heavy_check_mark:                                                                                                                                       | The unique ID of the workflow.                                                                                                                           |                                                                                                                                                          |
| `status`                                                                                                                                                 | [GetProjectWorkflowRuns200ApplicationJSONItemsStatus](../../models/operations/GetProjectWorkflowRuns200ApplicationJSONItemsStatus.md)                    | :heavy_check_mark:                                                                                                                                       | Workflow status.                                                                                                                                         |                                                                                                                                                          |
| `stoppedAt`                                                                                                                                              | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                                                | :heavy_check_mark:                                                                                                                                       | The date and time the workflow stopped.                                                                                                                  |                                                                                                                                                          |