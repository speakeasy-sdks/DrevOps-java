# webhook

### Available Operations

* [createWebhook](#createwebhook) - Create a webhook
* [deleteWebhook](#deletewebhook) - Delete a webhook
* [getWebhookById](#getwebhookbyid) - Get a webhook
* [getWebhooks](#getwebhooks) - List webhooks
* [updateWebhook](#updatewebhook) - Update a webhook

## createWebhook

Create a webhook

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.CreateWebhookRequestBody;
import DrevOps.CircleCi.models.operations.CreateWebhookRequestBodyEvents;
import DrevOps.CircleCi.models.operations.CreateWebhookRequestBodyScope;
import DrevOps.CircleCi.models.operations.CreateWebhookRequestBodyScopeType;
import DrevOps.CircleCi.models.operations.CreateWebhookResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            CreateWebhookRequestBody req = new CreateWebhookRequestBody(                new DrevOps.CircleCi.models.operations.CreateWebhookRequestBodyEvents[]{{
                                add(CreateWebhookRequestBodyEvents.WORKFLOW_COMPLETED),
                                add(CreateWebhookRequestBodyEvents.WORKFLOW_COMPLETED),
                            }}, "esse",                 new CreateWebhookRequestBodyScope("78a7bd46-6d28-4c10-ab3c-dca4251904e5", CreateWebhookRequestBodyScopeType.PROJECT);, "aspernatur", "sequi", false);            

            CreateWebhookResponse res = sdk.webhook.createWebhook(req);

            if (res.webhook != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [DrevOps.CircleCi.models.operations.CreateWebhookRequestBody](../../models/operations/CreateWebhookRequestBody.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[DrevOps.CircleCi.models.operations.CreateWebhookResponse](../../models/operations/CreateWebhookResponse.md)**


## deleteWebhook

Delete a webhook

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.DeleteWebhookRequest;
import DrevOps.CircleCi.models.operations.DeleteWebhookResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            DeleteWebhookRequest req = new DeleteWebhookRequest("c7e0bc71-78e4-4796-b2a7-0c688282aa48");            

            DeleteWebhookResponse res = sdk.webhook.deleteWebhook(req);

            if (res.messageResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [DrevOps.CircleCi.models.operations.DeleteWebhookRequest](../../models/operations/DeleteWebhookRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[DrevOps.CircleCi.models.operations.DeleteWebhookResponse](../../models/operations/DeleteWebhookResponse.md)**


## getWebhookById

Get a webhook by id.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetWebhookByIdRequest;
import DrevOps.CircleCi.models.operations.GetWebhookByIdResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetWebhookByIdRequest req = new GetWebhookByIdRequest("2562f222-e981-47ee-97cb-e61e6b7b95bc");            

            GetWebhookByIdResponse res = sdk.webhook.getWebhookById(req);

            if (res.webhook != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [DrevOps.CircleCi.models.operations.GetWebhookByIdRequest](../../models/operations/GetWebhookByIdRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[DrevOps.CircleCi.models.operations.GetWebhookByIdResponse](../../models/operations/GetWebhookByIdResponse.md)**


## getWebhooks

Get a list of webhook that match the given scope-type and scope-id

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetWebhooksRequest;
import DrevOps.CircleCi.models.operations.GetWebhooksResponse;
import DrevOps.CircleCi.models.operations.GetWebhooksScopeType;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetWebhooksRequest req = new GetWebhooksRequest("0ab3c20c-4f37-489f-9871-f99dd2efd121", GetWebhooksScopeType.PROJECT);            

            GetWebhooksResponse res = sdk.webhook.getWebhooks(req);

            if (res.getWebhooks200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [DrevOps.CircleCi.models.operations.GetWebhooksRequest](../../models/operations/GetWebhooksRequest.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[DrevOps.CircleCi.models.operations.GetWebhooksResponse](../../models/operations/GetWebhooksResponse.md)**


## updateWebhook

Update a webhook

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.UpdateWebhookRequest;
import DrevOps.CircleCi.models.operations.UpdateWebhookRequestBody;
import DrevOps.CircleCi.models.operations.UpdateWebhookRequestBodyEvents;
import DrevOps.CircleCi.models.operations.UpdateWebhookResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            UpdateWebhookRequest req = new UpdateWebhookRequest("aa6f1e67-4bdb-404f-9575-6082d68ea19f") {{
                requestBody = new UpdateWebhookRequestBody() {{
                    events = new DrevOps.CircleCi.models.operations.UpdateWebhookRequestBodyEvents[]{{
                        add(UpdateWebhookRequestBodyEvents.JOB_COMPLETED),
                    }};
                    name = "Allison Bednar I";
                    signingSecret = "adipisci";
                    url = "iste";
                    verifyTls = false;
                }};;
            }};            

            UpdateWebhookResponse res = sdk.webhook.updateWebhook(req);

            if (res.webhook != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [DrevOps.CircleCi.models.operations.UpdateWebhookRequest](../../models/operations/UpdateWebhookRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[DrevOps.CircleCi.models.operations.UpdateWebhookResponse](../../models/operations/UpdateWebhookResponse.md)**

