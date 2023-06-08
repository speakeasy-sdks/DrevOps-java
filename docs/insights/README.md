# insights

### Available Operations

* [getAllInsightsBranches](#getallinsightsbranches) - Get all branches for a project
* [getFlakyTests](#getflakytests) - Get flaky tests for a project
* [getJobTimeseries](#getjobtimeseries) - Job timeseries data
* [getOrgSummaryData](#getorgsummarydata) - Get summary metrics with trends for the entire org, and for each project.
* [getProjectWorkflowJobMetrics](#getprojectworkflowjobmetrics) - Get summary metrics for a project workflow's jobs.
* [getProjectWorkflowMetrics](#getprojectworkflowmetrics) - Get summary metrics for a project's workflows
* [getProjectWorkflowRuns](#getprojectworkflowruns) - Get recent runs of a workflow
* [getProjectWorkflowTestMetrics](#getprojectworkflowtestmetrics) - Get test metrics for a project's workflows
* [getProjectWorkflowsPageData](#getprojectworkflowspagedata) - Get summary metrics and trends for a project across it's workflows and branches
* [getWorkflowSummary](#getworkflowsummary) - Get metrics and trends for workflows

## getAllInsightsBranches

Get a list of all branches for a specified project. The list will only contain branches currently available within Insights. The maximum number of branches returned by this endpoint is 5,000.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetAllInsightsBranchesRequest;
import DrevOps.CircleCi.models.operations.GetAllInsightsBranchesResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetAllInsightsBranchesRequest req = new GetAllInsightsBranchesRequest("maxime") {{
                workflowName = "deleniti";
            }};            

            GetAllInsightsBranchesResponse res = sdk.insights.getAllInsightsBranches(req);

            if (res.getAllInsightsBranches200ApplicationJSONAny != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getFlakyTests

Get a list of flaky tests for a given project. Flaky tests are branch agnostic. 
             A flaky test is a test that passed and failed in the same commit.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetFlakyTestsRequest;
import DrevOps.CircleCi.models.operations.GetFlakyTestsResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetFlakyTestsRequest req = new GetFlakyTestsRequest("facilis");            

            GetFlakyTestsResponse res = sdk.insights.getFlakyTests(req);

            if (res.getFlakyTests200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getJobTimeseries

Get timeseries data for all jobs within a workflow.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetJobTimeseriesGranularity;
import DrevOps.CircleCi.models.operations.GetJobTimeseriesRequest;
import DrevOps.CircleCi.models.operations.GetJobTimeseriesResponse;
import DrevOps.CircleCi.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetJobTimeseriesRequest req = new GetJobTimeseriesRequest("in", "architecto") {{
                branch = "architecto";
                endDate = OffsetDateTime.parse("2021-12-11T05:14:57.773Z");
                granularity = GetJobTimeseriesGranularity.HOURLY;
                startDate = OffsetDateTime.parse("2022-01-01T10:06:00.916Z");
            }};            

            GetJobTimeseriesResponse res = sdk.insights.getJobTimeseries(req);

            if (res.getJobTimeseries200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgSummaryData

Gets aggregated summary metrics with trends for the entire org. 
              Also gets aggregated metrics and trends for each project belonging to the org.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetOrgSummaryDataReportingWindow;
import DrevOps.CircleCi.models.operations.GetOrgSummaryDataRequest;
import DrevOps.CircleCi.models.operations.GetOrgSummaryDataResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetOrgSummaryDataRequest req = new GetOrgSummaryDataRequest("quibusdam") {{
                projectNames = new java.util.HashMap<String, Object>() {{
                    put("saepe", "pariatur");
                }};
                reportingWindow = GetOrgSummaryDataReportingWindow.LAST7_DAYS;
            }};            

            GetOrgSummaryDataResponse res = sdk.insights.getOrgSummaryData(req);

            if (res.getOrgSummaryData200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getProjectWorkflowJobMetrics

Get summary metrics for a project workflow's jobs. Job runs going back at most 90 days are included in the aggregation window. Metrics are refreshed daily, and thus may not include executions from the last 24 hours. Please note that Insights is not a financial reporting tool and should not be used for precise credit reporting.  Credit reporting from Insights does not use the same source of truth as the billing information that is found in the Plan Overview page in the CircleCI UI, nor does the underlying data have the same data accuracy guarantees as the billing information in the CircleCI UI.  This may lead to discrepancies between credits reported from Insights and the billing information in the Plan Overview page of the CircleCI UI.  For precise credit reporting, always use the Plan Overview page in the CircleCI UI.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetProjectWorkflowJobMetricsReportingWindow;
import DrevOps.CircleCi.models.operations.GetProjectWorkflowJobMetricsRequest;
import DrevOps.CircleCi.models.operations.GetProjectWorkflowJobMetricsResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetProjectWorkflowJobMetricsRequest req = new GetProjectWorkflowJobMetricsRequest("consequuntur", "praesentium") {{
                allBranches = false;
                branch = "natus";
                pageToken = "magni";
                reportingWindow = GetProjectWorkflowJobMetricsReportingWindow.LAST7_DAYS;
            }};            

            GetProjectWorkflowJobMetricsResponse res = sdk.insights.getProjectWorkflowJobMetrics(req);

            if (res.getProjectWorkflowJobMetrics200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getProjectWorkflowMetrics

Get summary metrics for a project's workflows.  Workflow runs going back at most 90 days are included in the aggregation window. Metrics are refreshed daily, and thus may not include executions from the last 24 hours.  Please note that Insights is not a financial reporting tool and should not be used for precise credit reporting.  Credit reporting from Insights does not use the same source of truth as the billing information that is found in the Plan Overview page in the CircleCI UI, nor does the underlying data have the same data accuracy guarantees as the billing information in the CircleCI UI.  This may lead to discrepancies between credits reported from Insights and the billing information in the Plan Overview page of the CircleCI UI.  For precise credit reporting, always use the Plan Overview page in the CircleCI UI.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetProjectWorkflowMetricsReportingWindow;
import DrevOps.CircleCi.models.operations.GetProjectWorkflowMetricsRequest;
import DrevOps.CircleCi.models.operations.GetProjectWorkflowMetricsResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetProjectWorkflowMetricsRequest req = new GetProjectWorkflowMetricsRequest("quo") {{
                allBranches = false;
                branch = "illum";
                pageToken = "pariatur";
                reportingWindow = GetProjectWorkflowMetricsReportingWindow.LAST60_DAYS;
            }};            

            GetProjectWorkflowMetricsResponse res = sdk.insights.getProjectWorkflowMetrics(req);

            if (res.getProjectWorkflowMetrics200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getProjectWorkflowRuns

Get recent runs of a workflow. Runs going back at most 90 days are returned. Please note that Insights is not a financial reporting tool and should not be used for precise credit reporting.  Credit reporting from Insights does not use the same source of truth as the billing information that is found in the Plan Overview page in the CircleCI UI, nor does the underlying data have the same data accuracy guarantees as the billing information in the CircleCI UI.  This may lead to discrepancies between credits reported from Insights and the billing information in the Plan Overview page of the CircleCI UI.  For precise credit reporting, always use the Plan Overview page in the CircleCI UI.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetProjectWorkflowRunsRequest;
import DrevOps.CircleCi.models.operations.GetProjectWorkflowRunsResponse;
import DrevOps.CircleCi.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetProjectWorkflowRunsRequest req = new GetProjectWorkflowRunsRequest("ea", "excepturi") {{
                allBranches = false;
                branch = "odit";
                endDate = OffsetDateTime.parse("2022-12-19T20:58:17.857Z");
                pageToken = "ab";
                startDate = OffsetDateTime.parse("2020-11-28T07:34:18.392Z");
            }};            

            GetProjectWorkflowRunsResponse res = sdk.insights.getProjectWorkflowRuns(req);

            if (res.getProjectWorkflowRuns200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getProjectWorkflowTestMetrics

Get test metrics for a project's workflows. Currently tests metrics are calculated based on 10 most recent workflow runs.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetProjectWorkflowTestMetricsRequest;
import DrevOps.CircleCi.models.operations.GetProjectWorkflowTestMetricsResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetProjectWorkflowTestMetricsRequest req = new GetProjectWorkflowTestMetricsRequest("ipsam", "voluptate") {{
                allBranches = false;
                branch = "autem";
            }};            

            GetProjectWorkflowTestMetricsResponse res = sdk.insights.getProjectWorkflowTestMetrics(req);

            if (res.getProjectWorkflowTestMetrics200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getProjectWorkflowsPageData

Get summary metrics and trends for a project at workflow and branch level. 
             Workflow runs going back at most 90 days are included in the aggregation window. 
             Trends are only supported upto last 30 days. 
             Please note that Insights is not a financial reporting tool and should not be used for precise credit reporting.  Credit reporting from Insights does not use the same source of truth as the billing information that is found in the Plan Overview page in the CircleCI UI, nor does the underlying data have the same data accuracy guarantees as the billing information in the CircleCI UI.  This may lead to discrepancies between credits reported from Insights and the billing information in the Plan Overview page of the CircleCI UI.  For precise credit reporting, always use the Plan Overview page in the CircleCI UI.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetProjectWorkflowsPageDataReportingWindow;
import DrevOps.CircleCi.models.operations.GetProjectWorkflowsPageDataRequest;
import DrevOps.CircleCi.models.operations.GetProjectWorkflowsPageDataResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetProjectWorkflowsPageDataRequest req = new GetProjectWorkflowsPageDataRequest("nam") {{
                branches = new java.util.HashMap<String, Object>() {{
                    put("pariatur", "nemo");
                }};
                reportingWindow = GetProjectWorkflowsPageDataReportingWindow.LAST60_DAYS;
                workflowNames = new java.util.HashMap<String, Object>() {{
                    put("fugiat", "amet");
                }};
            }};            

            GetProjectWorkflowsPageDataResponse res = sdk.insights.getProjectWorkflowsPageData(req);

            if (res.getProjectWorkflowsPageData200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getWorkflowSummary

Get the metrics and trends for a particular workflow on a single branch or all branches

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetWorkflowSummaryRequest;
import DrevOps.CircleCi.models.operations.GetWorkflowSummaryResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetWorkflowSummaryRequest req = new GetWorkflowSummaryRequest("aut", "cumque") {{
                allBranches = false;
                branches = new java.util.HashMap<String, Object>() {{
                    put("hic", "libero");
                    put("nobis", "dolores");
                }};
            }};            

            GetWorkflowSummaryResponse res = sdk.insights.getWorkflowSummary(req);

            if (res.getWorkflowSummary200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
