# context

### Available Operations

* [addEnvironmentVariableToContext](#addenvironmentvariabletocontext) - Add or update an environment variable
* [createContext](#createcontext) - Create a new context
* [deleteContext](#deletecontext) - Delete a context
* [deleteEnvironmentVariableFromContext](#deleteenvironmentvariablefromcontext) - Remove an environment variable
* [getContext](#getcontext) - Get a context
* [listContexts](#listcontexts) - List contexts
* [listEnvironmentVariablesFromContext](#listenvironmentvariablesfromcontext) - List environment variables

## addEnvironmentVariableToContext

Create or update an environment variable within a context. Returns information about the environment variable, not including its value.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.AddEnvironmentVariableToContextRequest;
import DrevOps.CircleCi.models.operations.AddEnvironmentVariableToContextRequestBody;
import DrevOps.CircleCi.models.operations.AddEnvironmentVariableToContextResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            AddEnvironmentVariableToContextRequest req = new AddEnvironmentVariableToContextRequest("05dfc2dd-f7cc-478c-a1ba-928fc816742c", "cum") {{
                requestBody = new AddEnvironmentVariableToContextRequestBody("some-secret-value");;
            }};            

            AddEnvironmentVariableToContextResponse res = sdk.context.addEnvironmentVariableToContext(req);

            if (res.addEnvironmentVariableToContext200ApplicationJSONAnyOf != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## createContext

Create a new context

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.CreateContextRequestBody;
import DrevOps.CircleCi.models.operations.CreateContextRequestBodyOwner1;
import DrevOps.CircleCi.models.operations.CreateContextRequestBodyOwner1Type;
import DrevOps.CircleCi.models.operations.CreateContextRequestBodyOwner2;
import DrevOps.CircleCi.models.operations.CreateContextRequestBodyOwner2Type;
import DrevOps.CircleCi.models.operations.CreateContextResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            CreateContextRequestBody req = new CreateContextRequestBody("esse",                 new CreateContextRequestBodyOwner1("955907af-f1a3-4a2f-a946-7739251aa52c") {{
                                id = "92059293-96fe-4a75-96eb-10faaa2352c5";
                                type = CreateContextRequestBodyOwner1Type.ORGANIZATION;
                            }});            

            CreateContextResponse res = sdk.context.createContext(req);

            if (res.context != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## deleteContext

Delete a context

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.DeleteContextRequest;
import DrevOps.CircleCi.models.operations.DeleteContextResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            DeleteContextRequest req = new DeleteContextRequest("3f5ad019-da1f-4fe7-8f09-7b0074f15471");            

            DeleteContextResponse res = sdk.context.deleteContext(req);

            if (res.messageResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## deleteEnvironmentVariableFromContext

Delete an environment variable from a context.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.DeleteEnvironmentVariableFromContextRequest;
import DrevOps.CircleCi.models.operations.DeleteEnvironmentVariableFromContextResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            DeleteEnvironmentVariableFromContextRequest req = new DeleteEnvironmentVariableFromContextRequest("b5e6e13b-99d4-488e-9e91-e450ad2abd44", "qui");            

            DeleteEnvironmentVariableFromContextResponse res = sdk.context.deleteEnvironmentVariableFromContext(req);

            if (res.messageResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getContext

Returns basic information about a context.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetContextRequest;
import DrevOps.CircleCi.models.operations.GetContextResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetContextRequest req = new GetContextRequest("69802d50-2a94-4bb4-b63c-969e9a3efa77");            

            GetContextResponse res = sdk.context.getContext(req);

            if (res.context != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## listContexts

List all contexts for an owner.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.ListContextsOwnerType;
import DrevOps.CircleCi.models.operations.ListContextsRequest;
import DrevOps.CircleCi.models.operations.ListContextsResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            ListContextsRequest req = new ListContextsRequest() {{
                ownerId = "dfb14cd6-6ae3-495e-bb9b-a88f3a669970";
                ownerSlug = "nihil";
                ownerType = ListContextsOwnerType.ACCOUNT;
                pageToken = "distinctio";
            }};            

            ListContextsResponse res = sdk.context.listContexts(req);

            if (res.listContexts200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## listEnvironmentVariablesFromContext

List information about environment variables in a context, not including their values.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.ListEnvironmentVariablesFromContextRequest;
import DrevOps.CircleCi.models.operations.ListEnvironmentVariablesFromContextResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            ListEnvironmentVariablesFromContextRequest req = new ListEnvironmentVariablesFromContextRequest("a4469b6e-2141-4959-890a-fa563e2516fe") {{
                pageToken = "eius";
            }};            

            ListEnvironmentVariablesFromContextResponse res = sdk.context.listEnvironmentVariablesFromContext(req);

            if (res.listEnvironmentVariablesFromContext200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
