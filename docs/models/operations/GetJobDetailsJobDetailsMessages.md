# GetJobDetailsJobDetailsMessages

Message from CircleCI execution platform.


## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `message`                                                       | *String*                                                        | :heavy_check_mark:                                              | Information describing message.                                 |
| `reason`                                                        | *String*                                                        | :heavy_minus_sign:                                              | Value describing the reason for message to be added to the job. |
| `type`                                                          | *String*                                                        | :heavy_check_mark:                                              | Message type.                                                   |