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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            CreateCheckoutKeyRequest req = new CreateCheckoutKeyRequest("nihil") {{
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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            CreateEnvVarRequest req = new CreateEnvVarRequest("sit") {{
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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            DeleteCheckoutKeyRequest req = new DeleteCheckoutKeyRequest("expedita", "neque");            

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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            DeleteEnvVarRequest req = new DeleteEnvVarRequest("sed", "vel");            

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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetCheckoutKeyRequest req = new GetCheckoutKeyRequest("libero", "voluptas");            

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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetEnvVarRequest req = new GetEnvVarRequest("deserunt", "quam");            

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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetProjectBySlugRequest req = new GetProjectBySlugRequest("ipsum");            

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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            ListCheckoutKeysRequest req = new ListCheckoutKeysRequest("incidunt");            

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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            ListEnvVarsRequest req = new ListEnvVarsRequest("qui");            

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
