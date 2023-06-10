# ContinuePipelineRequestBody


## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `configuration`                                            | *String*                                                   | :heavy_check_mark:                                         | A configuration string for the pipeline.                   |
| `continuationKey`                                          | *String*                                                   | :heavy_check_mark:                                         | A pipeline continuation key.                               |
| `parameters`                                               | Map<String, *Object*>                                      | :heavy_minus_sign:                                         | An object containing pipeline parameters and their values. |