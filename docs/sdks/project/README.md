# project

### Available Operations

* [createCheckoutKey](#createcheckoutkey) - Create a new checkout key
* [createEnvVar](#createenvvar) - Create an environment variable
* [deleteCheckoutKey](#deletecheckoutkey) - Delete a checkout key
* [deleteEnvVar](#deleteenvvar) - Delete an environment variable
* [getCheckoutKey](#getcheckoutkey) - Get a checkout key
* [getEnvVar](#getenvvar) - Get a masked environment variable
* [getProjectBySlug](#getprojectbyslug) - Get a project
* [listCheckoutKeys](#listcheckoutkeys) - Get all checkout keys
* [listEnvVars](#listenvvars) - List all environment variables

## createCheckoutKey

Creates a new checkout key. This API request is only usable with a user API token.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.CreateCheckoutKeyCheckoutKeyInput;
import DrevOps.CircleCi.models.operations.CreateCheckoutKeyCheckoutKeyInputCheckoutKeyInputType;
import DrevOps.CircleCi.models.operations.CreateCheckoutKeyRequest;
import DrevOps.CircleCi.models.operations.CreateCheckoutKeyResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            CreateCheckoutKeyRequest req = new CreateCheckoutKeyRequest("esse") {{
                requestBody = new CreateCheckoutKeyCheckoutKeyInput(CreateCheckoutKeyCheckoutKeyInputCheckoutKeyInputType.DEPLOY_KEY);;
            }};            

            CreateCheckoutKeyResponse res = sdk.project.createCheckoutKey(req);

            if (res.checkoutKey != null) {
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
| `request`                                                                                                          | [DrevOps.CircleCi.models.operations.CreateCheckoutKeyRequest](../../models/operations/CreateCheckoutKeyRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[DrevOps.CircleCi.models.operations.CreateCheckoutKeyResponse](../../models/operations/CreateCheckoutKeyResponse.md)**


## createEnvVar

Creates a new environment variable.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.CreateEnvVarEnvironmentVariablePair;
import DrevOps.CircleCi.models.operations.CreateEnvVarRequest;
import DrevOps.CircleCi.models.operations.CreateEnvVarResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            CreateEnvVarRequest req = new CreateEnvVarRequest("harum") {{
                requestBody = new CreateEnvVarEnvironmentVariablePair("foo", "xxxx1234");;
            }};            

            CreateEnvVarResponse res = sdk.project.createEnvVar(req);

            if (res.environmentVariablePair != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [DrevOps.CircleCi.models.operations.CreateEnvVarRequest](../../models/operations/CreateEnvVarRequest.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[DrevOps.CircleCi.models.operations.CreateEnvVarResponse](../../models/operations/CreateEnvVarResponse.md)**


## deleteCheckoutKey

Deletes the checkout key.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.DeleteCheckoutKeyRequest;
import DrevOps.CircleCi.models.operations.DeleteCheckoutKeyResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            DeleteCheckoutKeyRequest req = new DeleteCheckoutKeyRequest("iusto", "ipsum");            

            DeleteCheckoutKeyResponse res = sdk.project.deleteCheckoutKey(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [DrevOps.CircleCi.models.operations.DeleteCheckoutKeyRequest](../../models/operations/DeleteCheckoutKeyRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[DrevOps.CircleCi.models.operations.DeleteCheckoutKeyResponse](../../models/operations/DeleteCheckoutKeyResponse.md)**


## deleteEnvVar

Deletes the environment variable named :name.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.DeleteEnvVarRequest;
import DrevOps.CircleCi.models.operations.DeleteEnvVarResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            DeleteEnvVarRequest req = new DeleteEnvVarRequest("quisquam", "tenetur");            

            DeleteEnvVarResponse res = sdk.project.deleteEnvVar(req);

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

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [DrevOps.CircleCi.models.operations.DeleteEnvVarRequest](../../models/operations/DeleteEnvVarRequest.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[DrevOps.CircleCi.models.operations.DeleteEnvVarResponse](../../models/operations/DeleteEnvVarResponse.md)**


## getCheckoutKey

Returns an individual checkout key.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetCheckoutKeyRequest;
import DrevOps.CircleCi.models.operations.GetCheckoutKeyResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetCheckoutKeyRequest req = new GetCheckoutKeyRequest("amet", "tempore");            

            GetCheckoutKeyResponse res = sdk.project.getCheckoutKey(req);

            if (res.checkoutKey != null) {
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
| `request`                                                                                                    | [DrevOps.CircleCi.models.operations.GetCheckoutKeyRequest](../../models/operations/GetCheckoutKeyRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[DrevOps.CircleCi.models.operations.GetCheckoutKeyResponse](../../models/operations/GetCheckoutKeyResponse.md)**


## getEnvVar

Returns the masked value of environment variable :name.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetEnvVarRequest;
import DrevOps.CircleCi.models.operations.GetEnvVarResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetEnvVarRequest req = new GetEnvVarRequest("accusamus", "numquam");            

            GetEnvVarResponse res = sdk.project.getEnvVar(req);

            if (res.environmentVariablePair != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [DrevOps.CircleCi.models.operations.GetEnvVarRequest](../../models/operations/GetEnvVarRequest.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[DrevOps.CircleCi.models.operations.GetEnvVarResponse](../../models/operations/GetEnvVarResponse.md)**


## getProjectBySlug

Retrieves a project by project slug.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetProjectBySlugRequest;
import DrevOps.CircleCi.models.operations.GetProjectBySlugResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetProjectBySlugRequest req = new GetProjectBySlugRequest("enim");            

            GetProjectBySlugResponse res = sdk.project.getProjectBySlug(req);

            if (res.project != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [DrevOps.CircleCi.models.operations.GetProjectBySlugRequest](../../models/operations/GetProjectBySlugRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[DrevOps.CircleCi.models.operations.GetProjectBySlugResponse](../../models/operations/GetProjectBySlugResponse.md)**


## listCheckoutKeys

Returns a sequence of checkout keys for `:project`.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.ListCheckoutKeysRequest;
import DrevOps.CircleCi.models.operations.ListCheckoutKeysResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            ListCheckoutKeysRequest req = new ListCheckoutKeysRequest("dolorem");            

            ListCheckoutKeysResponse res = sdk.project.listCheckoutKeys(req);

            if (res.checkoutKeyListResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [DrevOps.CircleCi.models.operations.ListCheckoutKeysRequest](../../models/operations/ListCheckoutKeysRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[DrevOps.CircleCi.models.operations.ListCheckoutKeysResponse](../../models/operations/ListCheckoutKeysResponse.md)**


## listEnvVars

Returns four 'x' characters, in addition to the last four ASCII characters of the value, consistent with the display of environment variable values on the CircleCI website.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.ListEnvVarsRequest;
import DrevOps.CircleCi.models.operations.ListEnvVarsResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            ListEnvVarsRequest req = new ListEnvVarsRequest("sapiente");            

            ListEnvVarsResponse res = sdk.project.listEnvVars(req);

            if (res.environmentVariableListResponse != null) {
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
| `request`                                                                                              | [DrevOps.CircleCi.models.operations.ListEnvVarsRequest](../../models/operations/ListEnvVarsRequest.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[DrevOps.CircleCi.models.operations.ListEnvVarsResponse](../../models/operations/ListEnvVarsResponse.md)**

