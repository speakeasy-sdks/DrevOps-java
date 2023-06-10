# DeleteScheduleByIdResponse


## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `contentType`                                                                                                            | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `messageResponse`                                                                                                        | [DeleteScheduleByIdMessageResponse](../../models/operations/DeleteScheduleByIdMessageResponse.md)                        | :heavy_minus_sign:                                                                                                       | A confirmation message.                                                                                                  |
| `statusCode`                                                                                                             | *Integer*                                                                                                                | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `rawResponse`                                                                                                            | [HttpResponse<byte[]>](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html) | :heavy_minus_sign:                                                                                                       | N/A                                                                                                                      |
| `deleteScheduleByIdDefaultApplicationJSONObject`                                                                         | [DeleteScheduleByIdDefaultApplicationJSON](../../models/operations/DeleteScheduleByIdDefaultApplicationJSON.md)          | :heavy_minus_sign:                                                                                                       | Error response.                                                                                                          |