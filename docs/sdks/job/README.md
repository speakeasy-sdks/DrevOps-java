# job

### Available Operations

* [cancelJob](#canceljob) - Cancel job
* [getJobArtifacts](#getjobartifacts) - Get a job's artifacts
* [getJobDetails](#getjobdetails) - Get job details
* [getTests](#gettests) - Get test metadata

## cancelJob

Cancel job with a given job number.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.CancelJobRequest;
import DrevOps.CircleCi.models.operations.CancelJobResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            CancelJobRequest req = new CancelJobRequest("eaque", "pariatur");            

            CancelJobResponse res = sdk.job.cancelJob(req);

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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [DrevOps.CircleCi.models.operations.CancelJobRequest](../../models/operations/CancelJobRequest.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[DrevOps.CircleCi.models.operations.CancelJobResponse](../../models/operations/CancelJobResponse.md)**


## getJobArtifacts

Returns a job's artifacts.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetJobArtifactsRequest;
import DrevOps.CircleCi.models.operations.GetJobArtifactsResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetJobArtifactsRequest req = new GetJobArtifactsRequest("nemo", "voluptatibus");            

            GetJobArtifactsResponse res = sdk.job.getJobArtifacts(req);

            if (res.artifactListResponse != null) {
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
| `request`                                                                                                      | [DrevOps.CircleCi.models.operations.GetJobArtifactsRequest](../../models/operations/GetJobArtifactsRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[DrevOps.CircleCi.models.operations.GetJobArtifactsResponse](../../models/operations/GetJobArtifactsResponse.md)**


## getJobDetails

Returns job details.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetJobDetailsRequest;
import DrevOps.CircleCi.models.operations.GetJobDetailsResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetJobDetailsRequest req = new GetJobDetailsRequest("perferendis", "fugiat");            

            GetJobDetailsResponse res = sdk.job.getJobDetails(req);

            if (res.jobDetails != null) {
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
| `request`                                                                                                  | [DrevOps.CircleCi.models.operations.GetJobDetailsRequest](../../models/operations/GetJobDetailsRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[DrevOps.CircleCi.models.operations.GetJobDetailsResponse](../../models/operations/GetJobDetailsResponse.md)**


## getTests

Get test metadata for a build. In the rare case where there is more than 250MB of test data on the job, no results will be returned.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetTestsRequest;
import DrevOps.CircleCi.models.operations.GetTestsResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetTestsRequest req = new GetTestsRequest("amet", "aut");            

            GetTestsResponse res = sdk.job.getTests(req);

            if (res.testsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [DrevOps.CircleCi.models.operations.GetTestsRequest](../../models/operations/GetTestsRequest.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[DrevOps.CircleCi.models.operations.GetTestsResponse](../../models/operations/GetTestsResponse.md)**

