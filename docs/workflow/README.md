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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            ApprovePendingApprovalJobByIdRequest req = new ApprovePendingApprovalJobByIdRequest("0642dac7-af51-45cc-813a-a63aae8d6786", "4dbb675f-d5e6-40b3-b5ed-4f6fbee41f33");            

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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            CancelWorkflowRequest req = new CancelWorkflowRequest("317fe35b-60eb-41ea-8265-55ba3c28744e");            

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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetWorkflowByIdRequest req = new GetWorkflowByIdRequest("d53b88f3-a8d8-4f5c-8b2f-2fb7b194a276");            

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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            ListWorkflowJobsRequest req = new ListWorkflowJobsRequest("b26916fe-1f08-4f42-94e3-698f447f603e");            

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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            RerunWorkflowRequest req = new RerunWorkflowRequest("8b445e80-ca55-4efd-a0e4-57e1858b6a89") {{
                requestBody = new RerunWorkflowRerunWorkflowParameters() {{
                    enableSsh = false;
                    fromFailed = false;
                    jobs = new String[]{{
                        add("be3a5aa8-e482-44d0-ab40-75088e518620"),
                        add("65e904f3-b119-44b8-abf6-03a79f9dfe0a"),
                        add("b7da8a50-ce18-47f8-abc1-73d689eee952"),
                        add("6f8d986e-881e-4ad4-b0e1-012563f94e29"),
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
