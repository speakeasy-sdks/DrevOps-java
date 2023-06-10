# GetJobTimeseries200ApplicationJSON

Project level timeseries metrics response


## Fields

| Field                                                                                                               | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `items`                                                                                                             | List<[GetJobTimeseries200ApplicationJSONItems](../../models/operations/GetJobTimeseries200ApplicationJSONItems.md)> | :heavy_check_mark:                                                                                                  | Aggregate metrics for a workflow at a time granularity                                                              |
| `nextPageToken`                                                                                                     | *String*                                                                                                            | :heavy_check_mark:                                                                                                  | A token to pass as a `page-token` query parameter to return the next page of results.                               |