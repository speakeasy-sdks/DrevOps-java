# GetProjectWorkflowsPageDataResponse


## Fields

| Field                                                                                                                             | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `contentType`                                                                                                                     | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               |
| `statusCode`                                                                                                                      | *Integer*                                                                                                                         | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               |
| `rawResponse`                                                                                                                     | [HttpResponse<byte[]>](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html)          | :heavy_minus_sign:                                                                                                                | N/A                                                                                                                               |
| `getProjectWorkflowsPageData200ApplicationJSONObject`                                                                             | [GetProjectWorkflowsPageData200ApplicationJSON](../../models/operations/GetProjectWorkflowsPageData200ApplicationJSON.md)         | :heavy_minus_sign:                                                                                                                | Aggregated summary metrics and trends by workflow and branches                                                                    |
| `getProjectWorkflowsPageDataDefaultApplicationJSONObject`                                                                         | [GetProjectWorkflowsPageDataDefaultApplicationJSON](../../models/operations/GetProjectWorkflowsPageDataDefaultApplicationJSON.md) | :heavy_minus_sign:                                                                                                                | Error response.                                                                                                                   |