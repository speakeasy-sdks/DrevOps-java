# UpdateWebhookRequestBody

The parameters for an update webhook request


## Fields

| Field                                                                                             | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `events`                                                                                          | List<[UpdateWebhookRequestBodyEvents](../../models/operations/UpdateWebhookRequestBodyEvents.md)> | :heavy_minus_sign:                                                                                | Events that will trigger the webhook                                                              |
| `name`                                                                                            | *String*                                                                                          | :heavy_minus_sign:                                                                                | Name of the webhook                                                                               |
| `signingSecret`                                                                                   | *String*                                                                                          | :heavy_minus_sign:                                                                                | Secret used to build an HMAC hash of the payload and passed as a header in the webhook request    |
| `url`                                                                                             | *String*                                                                                          | :heavy_minus_sign:                                                                                | URL to deliver the webhook to. Note: protocol must be included as well (only https is supported)  |
| `verifyTls`                                                                                       | *Boolean*                                                                                         | :heavy_minus_sign:                                                                                | Whether to enforce TLS certificate verification when delivering the webhook                       |