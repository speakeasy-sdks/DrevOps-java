# GetPipelineByIdPipelineTrigger

A summary of the trigger.


## Fields

| Field                                                                                                 | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `actor`                                                                                               | [GetPipelineByIdPipelineTriggerActor](../../models/operations/GetPipelineByIdPipelineTriggerActor.md) | :heavy_check_mark:                                                                                    | The user who triggered the Pipeline.                                                                  |
| `receivedAt`                                                                                          | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)             | :heavy_check_mark:                                                                                    | The date and time the trigger was received.                                                           |
| `type`                                                                                                | [GetPipelineByIdPipelineTriggerType](../../models/operations/GetPipelineByIdPipelineTriggerType.md)   | :heavy_check_mark:                                                                                    | The type of trigger.                                                                                  |