# pipeline

### Available Operations

* [continuePipeline](#continuepipeline) - Continue a pipeline
* [getPipelineById](#getpipelinebyid) - Get a pipeline by ID
* [getPipelineByNumber](#getpipelinebynumber) - Get a pipeline by pipeline number
* [getPipelineConfigById](#getpipelineconfigbyid) - Get a pipeline's configuration
* [listMyPipelines](#listmypipelines) - Get your pipelines
* [listPipelines](#listpipelines) - Get a list of pipelines
* [listPipelinesForProject](#listpipelinesforproject) - Get all pipelines
* [listWorkflowsByPipelineId](#listworkflowsbypipelineid) - Get a pipeline's workflows
* [triggerPipeline](#triggerpipeline) - Trigger a new pipeline

## continuePipeline

Continue a pipeline from the setup phase.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.ContinuePipelineRequestBody;
import DrevOps.CircleCi.models.operations.ContinuePipelineResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            ContinuePipelineRequestBody req = new ContinuePipelineRequestBody("cumque", "corporis") {{
                parameters = new java.util.HashMap<String, Object>() {{
                    put("libero", "nobis");
                    put("dolores", "quis");
                    put("totam", "dignissimos");
                    put("eaque", "quis");
                }};
            }};            

            ContinuePipelineResponse res = sdk.pipeline.continuePipeline(req);

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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [DrevOps.CircleCi.models.operations.ContinuePipelineRequestBody](../../models/operations/ContinuePipelineRequestBody.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[DrevOps.CircleCi.models.operations.ContinuePipelineResponse](../../models/operations/ContinuePipelineResponse.md)**


## getPipelineById

Returns a pipeline by the pipeline ID.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetPipelineByIdRequest;
import DrevOps.CircleCi.models.operations.GetPipelineByIdResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetPipelineByIdRequest req = new GetPipelineByIdRequest("3202c73d-5fe9-4b90-8289-09b3fe49a8d9");            

            GetPipelineByIdResponse res = sdk.pipeline.getPipelineById(req);

            if (res.pipeline != null) {
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
| `request`                                                                                                      | [DrevOps.CircleCi.models.operations.GetPipelineByIdRequest](../../models/operations/GetPipelineByIdRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[DrevOps.CircleCi.models.operations.GetPipelineByIdResponse](../../models/operations/GetPipelineByIdResponse.md)**


## getPipelineByNumber

Returns a pipeline by the pipeline number.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetPipelineByNumberRequest;
import DrevOps.CircleCi.models.operations.GetPipelineByNumberResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetPipelineByNumberRequest req = new GetPipelineByNumberRequest("nobis", "libero");            

            GetPipelineByNumberResponse res = sdk.pipeline.getPipelineByNumber(req);

            if (res.pipeline != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [DrevOps.CircleCi.models.operations.GetPipelineByNumberRequest](../../models/operations/GetPipelineByNumberRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[DrevOps.CircleCi.models.operations.GetPipelineByNumberResponse](../../models/operations/GetPipelineByNumberResponse.md)**


## getPipelineConfigById

Returns a pipeline's configuration by ID.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetPipelineConfigByIdRequest;
import DrevOps.CircleCi.models.operations.GetPipelineConfigByIdResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetPipelineConfigByIdRequest req = new GetPipelineConfigByIdRequest("f4863332-3f9b-477f-ba41-00674ebf6928");            

            GetPipelineConfigByIdResponse res = sdk.pipeline.getPipelineConfigById(req);

            if (res.pipelineConfig != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [DrevOps.CircleCi.models.operations.GetPipelineConfigByIdRequest](../../models/operations/GetPipelineConfigByIdRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[DrevOps.CircleCi.models.operations.GetPipelineConfigByIdResponse](../../models/operations/GetPipelineConfigByIdResponse.md)**


## listMyPipelines

Returns a sequence of all pipelines for this project triggered by the user.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.ListMyPipelinesRequest;
import DrevOps.CircleCi.models.operations.ListMyPipelinesResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            ListMyPipelinesRequest req = new ListMyPipelinesRequest("sit") {{
                pageToken = "fugiat";
            }};            

            ListMyPipelinesResponse res = sdk.pipeline.listMyPipelines(req);

            if (res.pipelineListResponse != null) {
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
| `request`                                                                                                      | [DrevOps.CircleCi.models.operations.ListMyPipelinesRequest](../../models/operations/ListMyPipelinesRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[DrevOps.CircleCi.models.operations.ListMyPipelinesResponse](../../models/operations/ListMyPipelinesResponse.md)**


## listPipelines

Returns all pipelines for the most recently built projects (max 250) you follow in an organization.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.ListPipelinesRequest;
import DrevOps.CircleCi.models.operations.ListPipelinesResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            ListPipelinesRequest req = new ListPipelinesRequest() {{
                mine = false;
                orgSlug = "ab";
                pageToken = "soluta";
            }};            

            ListPipelinesResponse res = sdk.pipeline.listPipelines(req);

            if (res.pipelineListResponse != null) {
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
| `request`                                                                                                  | [DrevOps.CircleCi.models.operations.ListPipelinesRequest](../../models/operations/ListPipelinesRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[DrevOps.CircleCi.models.operations.ListPipelinesResponse](../../models/operations/ListPipelinesResponse.md)**


## listPipelinesForProject

Returns all pipelines for this project.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.ListPipelinesForProjectRequest;
import DrevOps.CircleCi.models.operations.ListPipelinesForProjectResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            ListPipelinesForProjectRequest req = new ListPipelinesForProjectRequest("dolorum") {{
                branch = "iusto";
                pageToken = "voluptate";
            }};            

            ListPipelinesForProjectResponse res = sdk.pipeline.listPipelinesForProject(req);

            if (res.pipelineListResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [DrevOps.CircleCi.models.operations.ListPipelinesForProjectRequest](../../models/operations/ListPipelinesForProjectRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[DrevOps.CircleCi.models.operations.ListPipelinesForProjectResponse](../../models/operations/ListPipelinesForProjectResponse.md)**


## listWorkflowsByPipelineId

Returns a paginated list of workflows by pipeline ID.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.ListWorkflowsByPipelineIdRequest;
import DrevOps.CircleCi.models.operations.ListWorkflowsByPipelineIdResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            ListWorkflowsByPipelineIdRequest req = new ListWorkflowsByPipelineIdRequest("a89ebf73-7ae4-4203-8e5e-6a95d8a0d446") {{
                pageToken = "quod";
            }};            

            ListWorkflowsByPipelineIdResponse res = sdk.pipeline.listWorkflowsByPipelineId(req);

            if (res.workflowListResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [DrevOps.CircleCi.models.operations.ListWorkflowsByPipelineIdRequest](../../models/operations/ListWorkflowsByPipelineIdRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[DrevOps.CircleCi.models.operations.ListWorkflowsByPipelineIdResponse](../../models/operations/ListWorkflowsByPipelineIdResponse.md)**


## triggerPipeline

Triggers a new pipeline on the project.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.TriggerPipelineRequest;
import DrevOps.CircleCi.models.operations.TriggerPipelineResponse;
import DrevOps.CircleCi.models.operations.TriggerPipelineTriggerPipelineParameters;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            TriggerPipelineRequest req = new TriggerPipelineRequest("officiis") {{
                requestBody = new TriggerPipelineTriggerPipelineParameters() {{
                    branch = "feature/design-new-api";
                    parameters = new java.util.HashMap<String, Object>() {{
                        put("dolorum", "a");
                    }};
                    tag = "v3.1.4159";
                }};;
            }};            

            TriggerPipelineResponse res = sdk.pipeline.triggerPipeline(req);

            if (res.pipelineCreation != null) {
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
| `request`                                                                                                      | [DrevOps.CircleCi.models.operations.TriggerPipelineRequest](../../models/operations/TriggerPipelineRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[DrevOps.CircleCi.models.operations.TriggerPipelineResponse](../../models/operations/TriggerPipelineResponse.md)**

