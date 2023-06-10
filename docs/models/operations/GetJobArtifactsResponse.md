# GetJobArtifactsResponse


## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `artifactListResponse`                                                                                                   | [GetJobArtifactsArtifactListResponse](../../models/operations/GetJobArtifactsArtifactListResponse.md)                    | :heavy_minus_sign:                                                                                                       | A paginated list of the job's artifacts.                                                                                 |
| `contentType`                                                                                                            | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `statusCode`                                                                                                             | *Integer*                                                                                                                | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `rawResponse`                                                                                                            | [HttpResponse<byte[]>](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html) | :heavy_minus_sign:                                                                                                       | N/A                                                                                                                      |
| `getJobArtifactsDefaultApplicationJSONObject`                                                                            | [GetJobArtifactsDefaultApplicationJSON](../../models/operations/GetJobArtifactsDefaultApplicationJSON.md)                | :heavy_minus_sign:                                                                                                       | Error response.                                                                                                          |