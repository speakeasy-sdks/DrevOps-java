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

            ContinuePipelineRequestBody req = new ContinuePipelineRequestBody("dolores", "minus") {{
                parameters = new java.util.HashMap<String, Object>() {{
                    put("dolor", "vero");
                    put("nostrum", "hic");
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

            GetPipelineByIdRequest req = new GetPipelineByIdRequest("e9b90c28-909b-43fe-89a8-d9cbf4863332");            

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

            GetPipelineByNumberRequest req = new GetPipelineByNumberRequest("ipsum", "hic");            

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

            GetPipelineConfigByIdRequest req = new GetPipelineConfigByIdRequest("9b77f3a4-1006-474e-bf69-280d1ba77a89");            

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

            ListMyPipelinesRequest req = new ListMyPipelinesRequest("necessitatibus") {{
                pageToken = "distinctio";
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
                orgSlug = "asperiores";
                pageToken = "nihil";
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

            ListPipelinesForProjectRequest req = new ListPipelinesForProjectRequest("ipsum") {{
                branch = "voluptate";
                pageToken = "id";
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

            ListWorkflowsByPipelineIdRequest req = new ListWorkflowsByPipelineIdRequest("e4203ce5-e6a9-45d8-a0d4-46ce2af7a73c") {{
                pageToken = "tenetur";
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

            TriggerPipelineRequest req = new TriggerPipelineRequest("amet") {{
                requestBody = new TriggerPipelineTriggerPipelineParameters() {{
                    branch = "feature/design-new-api";
                    parameters = new java.util.HashMap<String, Object>() {{
                        put("accusamus", "numquam");
                        put("enim", "dolorem");
                        put("sapiente", "totam");
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
