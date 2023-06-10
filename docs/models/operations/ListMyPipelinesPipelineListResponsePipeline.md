# ListMyPipelinesPipelineListResponsePipeline

A pipeline response.


## Fields

| Field                                                                                                                                   | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             | Example                                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `createdAt`                                                                                                                             | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                               | :heavy_check_mark:                                                                                                                      | The date and time the pipeline was created.                                                                                             |                                                                                                                                         |
| `errors`                                                                                                                                | List<[ListMyPipelinesPipelineListResponsePipelineErrors](../../models/operations/ListMyPipelinesPipelineListResponsePipelineErrors.md)> | :heavy_check_mark:                                                                                                                      | A sequence of errors that have occurred within the pipeline.                                                                            |                                                                                                                                         |
| `id`                                                                                                                                    | *String*                                                                                                                                | :heavy_check_mark:                                                                                                                      | The unique ID of the pipeline.                                                                                                          | 5034460f-c7c4-4c43-9457-de07e2029e7b                                                                                                    |
| `number`                                                                                                                                | *Long*                                                                                                                                  | :heavy_check_mark:                                                                                                                      | The number of the pipeline.                                                                                                             | 25                                                                                                                                      |
| `projectSlug`                                                                                                                           | *String*                                                                                                                                | :heavy_check_mark:                                                                                                                      | The project-slug for the pipeline.                                                                                                      | gh/CircleCI-Public/api-preview-docs                                                                                                     |
| `state`                                                                                                                                 | [ListMyPipelinesPipelineListResponsePipelineState](../../models/operations/ListMyPipelinesPipelineListResponsePipelineState.md)         | :heavy_check_mark:                                                                                                                      | The current state of the pipeline.                                                                                                      |                                                                                                                                         |
| `trigger`                                                                                                                               | [ListMyPipelinesPipelineListResponsePipelineTrigger](../../models/operations/ListMyPipelinesPipelineListResponsePipelineTrigger.md)     | :heavy_check_mark:                                                                                                                      | A summary of the trigger.                                                                                                               |                                                                                                                                         |
| `triggerParameters`                                                                                                                     | Map<String, *Object*>                                                                                                                   | :heavy_minus_sign:                                                                                                                      | N/A                                                                                                                                     |                                                                                                                                         |
| `updatedAt`                                                                                                                             | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                               | :heavy_minus_sign:                                                                                                                      | The date and time the pipeline was last updated.                                                                                        |                                                                                                                                         |
| `vcs`                                                                                                                                   | [ListMyPipelinesPipelineListResponsePipelineVcs](../../models/operations/ListMyPipelinesPipelineListResponsePipelineVcs.md)             | :heavy_minus_sign:                                                                                                                      | VCS information for the pipeline.                                                                                                       |                                                                                                                                         |