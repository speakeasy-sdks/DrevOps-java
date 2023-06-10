# GetProjectWorkflowRunsResponse


## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `contentType`                                                                                                            | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `statusCode`                                                                                                             | *Integer*                                                                                                                | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `rawResponse`                                                                                                            | [HttpResponse<byte[]>](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html) | :heavy_minus_sign:                                                                                                       | N/A                                                                                                                      |
| `getProjectWorkflowRuns200ApplicationJSONObject`                                                                         | [GetProjectWorkflowRuns200ApplicationJSON](../../models/operations/GetProjectWorkflowRuns200ApplicationJSON.md)          | :heavy_minus_sign:                                                                                                       | A paginated list of recent workflow runs                                                                                 |
| `getProjectWorkflowRunsDefaultApplicationJSONObject`                                                                     | [GetProjectWorkflowRunsDefaultApplicationJSON](../../models/operations/GetProjectWorkflowRunsDefaultApplicationJSON.md)  | :heavy_minus_sign:                                                                                                       | Error response.                                                                                                          |