# ListWorkflowJobsWorkflowJobListResponseJob

Job


## Fields

| Field                                                                                                                           | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     | Example                                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `approvalRequestId`                                                                                                             | *String*                                                                                                                        | :heavy_minus_sign:                                                                                                              | The unique ID of the job.                                                                                                       |                                                                                                                                 |
| `approvedBy`                                                                                                                    | *String*                                                                                                                        | :heavy_minus_sign:                                                                                                              | The unique ID of the user.                                                                                                      |                                                                                                                                 |
| `canceledBy`                                                                                                                    | *String*                                                                                                                        | :heavy_minus_sign:                                                                                                              | The unique ID of the user.                                                                                                      |                                                                                                                                 |
| `dependencies`                                                                                                                  | List<*String*>                                                                                                                  | :heavy_check_mark:                                                                                                              | A sequence of the unique job IDs for the jobs that this job depends upon in the workflow.                                       |                                                                                                                                 |
| `id`                                                                                                                            | *String*                                                                                                                        | :heavy_check_mark:                                                                                                              | The unique ID of the job.                                                                                                       |                                                                                                                                 |
| `jobNumber`                                                                                                                     | *Long*                                                                                                                          | :heavy_minus_sign:                                                                                                              | The number of the job.                                                                                                          |                                                                                                                                 |
| `name`                                                                                                                          | *String*                                                                                                                        | :heavy_check_mark:                                                                                                              | The name of the job.                                                                                                            |                                                                                                                                 |
| `projectSlug`                                                                                                                   | *String*                                                                                                                        | :heavy_check_mark:                                                                                                              | The project-slug for the job.                                                                                                   | gh/CircleCI-Public/api-preview-docs                                                                                             |
| `startedAt`                                                                                                                     | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                       | :heavy_check_mark:                                                                                                              | The date and time the job started.                                                                                              |                                                                                                                                 |
| `status`                                                                                                                        | [ListWorkflowJobsWorkflowJobListResponseJobStatus](../../models/operations/ListWorkflowJobsWorkflowJobListResponseJobStatus.md) | :heavy_check_mark:                                                                                                              | The current status of the job.                                                                                                  |                                                                                                                                 |
| `stoppedAt`                                                                                                                     | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                       | :heavy_minus_sign:                                                                                                              | The time when the job stopped.                                                                                                  |                                                                                                                                 |
| `type`                                                                                                                          | [ListWorkflowJobsWorkflowJobListResponseJobType](../../models/operations/ListWorkflowJobsWorkflowJobListResponseJobType.md)     | :heavy_check_mark:                                                                                                              | The type of job.                                                                                                                |                                                                                                                                 |