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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            CreateWebhookRequestBody req = new CreateWebhookRequestBody(                new DrevOps.CircleCi.models.operations.CreateWebhookRequestBodyEvents[]{{
                                add(CreateWebhookRequestBodyEvents.WORKFLOW_COMPLETED),
                                add(CreateWebhookRequestBodyEvents.WORKFLOW_COMPLETED),
                            }}, "ab",                 new CreateWebhookRequestBodyScope("904e523c-7e0b-4c71-b8e4-796f2a70c688", CreateWebhookRequestBodyScopeType.PROJECT);, "consequuntur", "deleniti", false);            

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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            DeleteWebhookRequest req = new DeleteWebhookRequest("2aa48256-2f22-42e9-817e-e17cbe61e6b7");            

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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetWebhookByIdRequest req = new GetWebhookByIdRequest("b95bc0ab-3c20-4c4f-b789-fd871f99dd2e");            

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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetWebhooksRequest req = new GetWebhooksRequest("fd121aa6-f1e6-474b-9b04-f15756082d68", GetWebhooksScopeType.PROJECT);            

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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            UpdateWebhookRequest req = new UpdateWebhookRequest("ea19f1d1-7051-4339-9080-86a1840394c2") {{
                requestBody = new UpdateWebhookRequestBody() {{
                    events = new DrevOps.CircleCi.models.operations.UpdateWebhookRequestBodyEvents[]{{
                        add(UpdateWebhookRequestBodyEvents.WORKFLOW_COMPLETED),
                        add(UpdateWebhookRequestBodyEvents.WORKFLOW_COMPLETED),
                    }};
                    name = "Elisa Mosciski";
                    signingSecret = "voluptas";
                    url = "asperiores";
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
