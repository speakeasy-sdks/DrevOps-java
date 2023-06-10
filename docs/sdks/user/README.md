# user

### Available Operations

* [getCollaborations](#getcollaborations) - Collaborations
* [getCurrentUser](#getcurrentuser) - User Information
* [getUser](#getuser) - User Information

## getCollaborations

Provides the set of organizations of which a user is a member or a collaborator.

The set of organizations that a user can collaborate on is composed of:

* Organizations that the current user belongs to across VCS types (e.g. BitBucket, GitHub)
* The parent organization of repository that the user can collaborate on, but is not necessarily a member of
* The organization of the current user's account

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetCollaborationsResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetCollaborationsResponse res = sdk.user.getCollaborations();

            if (res.collaborations != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[DrevOps.CircleCi.models.operations.GetCollaborationsResponse](../../models/operations/GetCollaborationsResponse.md)**


## getCurrentUser

Provides information about the user that is currently signed in.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetCurrentUserResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetCurrentUserResponse res = sdk.user.getCurrentUser();

            if (res.user != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[DrevOps.CircleCi.models.operations.GetCurrentUserResponse](../../models/operations/GetCurrentUserResponse.md)**


## getUser

Provides information about the user with the given ID.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetUserRequest;
import DrevOps.CircleCi.models.operations.GetUserResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetUserRequest req = new GetUserRequest("fb008c42-e141-4aac-b66c-8dd6b1442907");            

            GetUserResponse res = sdk.user.getUser(req);

            if (res.user != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `request`                                                                                      | [DrevOps.CircleCi.models.operations.GetUserRequest](../../models/operations/GetUserRequest.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |


### Response

**[DrevOps.CircleCi.models.operations.GetUserResponse](../../models/operations/GetUserResponse.md)**

