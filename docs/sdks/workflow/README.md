# workflow

### Available Operations

* [approvePendingApprovalJobById](#approvependingapprovaljobbyid) - Approve a job
* [cancelWorkflow](#cancelworkflow) - Cancel a workflow
* [getWorkflowById](#getworkflowbyid) - Get a workflow
* [listWorkflowJobs](#listworkflowjobs) - Get a workflow's jobs
* [rerunWorkflow](#rerunworkflow) - Rerun a workflow

## approvePendingApprovalJobById

Approves a pending approval job in a workflow.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.ApprovePendingApprovalJobByIdRequest;
import DrevOps.CircleCi.models.operations.ApprovePendingApprovalJobByIdResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            ApprovePendingApprovalJobByIdRequest req = new ApprovePendingApprovalJobByIdRequest("d08086a1-8403-494c-a607-1f93f5f0642d", "ac7af515-cc41-43aa-a3aa-e8d67864dbb6");            

            ApprovePendingApprovalJobByIdResponse res = sdk.workflow.approvePendingApprovalJobById(req);

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [DrevOps.CircleCi.models.operations.ApprovePendingApprovalJobByIdRequest](../../models/operations/ApprovePendingApprovalJobByIdRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[DrevOps.CircleCi.models.operations.ApprovePendingApprovalJobByIdResponse](../../models/operations/ApprovePendingApprovalJobByIdResponse.md)**


## cancelWorkflow

Cancels a running workflow.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.CancelWorkflowRequest;
import DrevOps.CircleCi.models.operations.CancelWorkflowResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            CancelWorkflowRequest req = new CancelWorkflowRequest("75fd5e60-b375-4ed4-b6fb-ee41f33317fe");            

            CancelWorkflowResponse res = sdk.workflow.cancelWorkflow(req);

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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [DrevOps.CircleCi.models.operations.CancelWorkflowRequest](../../models/operations/CancelWorkflowRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[DrevOps.CircleCi.models.operations.CancelWorkflowResponse](../../models/operations/CancelWorkflowResponse.md)**


## getWorkflowById

Returns summary fields of a workflow by ID.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetWorkflowByIdRequest;
import DrevOps.CircleCi.models.operations.GetWorkflowByIdResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetWorkflowByIdRequest req = new GetWorkflowByIdRequest("35b60eb1-ea42-4655-9ba3-c28744ed53b8");            

            GetWorkflowByIdResponse res = sdk.workflow.getWorkflowById(req);

            if (res.workflow != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [DrevOps.CircleCi.models.operations.GetWorkflowByIdRequest](../../models/operations/GetWorkflowByIdRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[DrevOps.CircleCi.models.operations.GetWorkflowByIdResponse](../../models/operations/GetWorkflowByIdResponse.md)**


## listWorkflowJobs

Returns a sequence of jobs for a workflow.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.ListWorkflowJobsRequest;
import DrevOps.CircleCi.models.operations.ListWorkflowJobsResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            ListWorkflowJobsRequest req = new ListWorkflowJobsRequest("8f3a8d8f-5c0b-42f2-bb7b-194a276b2691");            

            ListWorkflowJobsResponse res = sdk.workflow.listWorkflowJobs(req);

            if (res.workflowJobListResponse != null) {
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
| `request`                                                                                                        | [DrevOps.CircleCi.models.operations.ListWorkflowJobsRequest](../../models/operations/ListWorkflowJobsRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[DrevOps.CircleCi.models.operations.ListWorkflowJobsResponse](../../models/operations/ListWorkflowJobsResponse.md)**


## rerunWorkflow

Reruns a workflow.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.RerunWorkflowRequest;
import DrevOps.CircleCi.models.operations.RerunWorkflowRerunWorkflowParameters;
import DrevOps.CircleCi.models.operations.RerunWorkflowResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            RerunWorkflowRequest req = new RerunWorkflowRequest("6fe1f08f-4294-4e36-98f4-47f603e8b445") {{
                requestBody = new RerunWorkflowRerunWorkflowParameters() {{
                    enableSsh = false;
                    fromFailed = false;
                    jobs = new String[]{{
                        add("80ca55ef-d20e-4457-a185-8b6a89fbe3a5"),
                        add("aa8e4824-d0ab-4407-9088-e51862065e90"),
                        add("4f3b1194-b8ab-4f60-ba79-f9dfe0ab7da8"),
                        add("a50ce187-f86b-4c17-bd68-9eee9526f8d9"),
                    }};
                    sparseTree = false;
                }};;
            }};            

            RerunWorkflowResponse res = sdk.workflow.rerunWorkflow(req);

            if (res.rerunWorkflow202ApplicationJSONObject != null) {
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
| `request`                                                                                                  | [DrevOps.CircleCi.models.operations.RerunWorkflowRequest](../../models/operations/RerunWorkflowRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[DrevOps.CircleCi.models.operations.RerunWorkflowResponse](../../models/operations/RerunWorkflowResponse.md)**

