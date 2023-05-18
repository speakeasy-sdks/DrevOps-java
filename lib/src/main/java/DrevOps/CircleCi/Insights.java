/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi;

import DrevOps.CircleCi.utils.HTTPClient;
import DrevOps.CircleCi.utils.HTTPRequest;
import DrevOps.CircleCi.utils.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class Insights {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Insights(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    /**
     * Get all branches for a project
     * Get a list of all branches for a specified project. The list will only contain branches currently available within Insights. The maximum number of branches returned by this endpoint is 5,000.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.GetAllInsightsBranchesResponse getAllInsightsBranches(DrevOps.CircleCi.models.operations.GetAllInsightsBranchesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.GetAllInsightsBranchesRequest.class, baseUrl, "/insights/{project-slug}/branches", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        java.util.List<NameValuePair> queryParams = DrevOps.CircleCi.utils.Utils.getQueryParams(DrevOps.CircleCi.models.operations.GetAllInsightsBranchesRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.GetAllInsightsBranchesResponse res = new DrevOps.CircleCi.models.operations.GetAllInsightsBranchesResponse(contentType, httpRes.statusCode()) {{
            getAllInsightsBranches200ApplicationJSONAny = null;
            getAllInsightsBranchesDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Object out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Object.class);
                res.getAllInsightsBranches200ApplicationJSONAny = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetAllInsightsBranchesDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetAllInsightsBranchesDefaultApplicationJSON.class);
                res.getAllInsightsBranchesDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get flaky tests for a project
     * Get a list of flaky tests for a given project. Flaky tests are branch agnostic. 
     *              A flaky test is a test that passed and failed in the same commit.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.GetFlakyTestsResponse getFlakyTests(DrevOps.CircleCi.models.operations.GetFlakyTestsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.GetFlakyTestsRequest.class, baseUrl, "/insights/{project-slug}/flaky-tests", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.GetFlakyTestsResponse res = new DrevOps.CircleCi.models.operations.GetFlakyTestsResponse(contentType, httpRes.statusCode()) {{
            getFlakyTests200ApplicationJSONObject = null;
            getFlakyTestsDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetFlakyTests200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetFlakyTests200ApplicationJSON.class);
                res.getFlakyTests200ApplicationJSONObject = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetFlakyTestsDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetFlakyTestsDefaultApplicationJSON.class);
                res.getFlakyTestsDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Job timeseries data
     * Get timeseries data for all jobs within a workflow.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.GetJobTimeseriesResponse getJobTimeseries(DrevOps.CircleCi.models.operations.GetJobTimeseriesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.GetJobTimeseriesRequest.class, baseUrl, "/insights/time-series/{project-slug}/workflows/{workflow-name}/jobs", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        java.util.List<NameValuePair> queryParams = DrevOps.CircleCi.utils.Utils.getQueryParams(DrevOps.CircleCi.models.operations.GetJobTimeseriesRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.GetJobTimeseriesResponse res = new DrevOps.CircleCi.models.operations.GetJobTimeseriesResponse(contentType, httpRes.statusCode()) {{
            getJobTimeseries200ApplicationJSONObject = null;
            getJobTimeseriesDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetJobTimeseries200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetJobTimeseries200ApplicationJSON.class);
                res.getJobTimeseries200ApplicationJSONObject = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetJobTimeseriesDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetJobTimeseriesDefaultApplicationJSON.class);
                res.getJobTimeseriesDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get summary metrics with trends for the entire org, and for each project.
     * Gets aggregated summary metrics with trends for the entire org. 
     *               Also gets aggregated metrics and trends for each project belonging to the org.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.GetOrgSummaryDataResponse getOrgSummaryData(DrevOps.CircleCi.models.operations.GetOrgSummaryDataRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.GetOrgSummaryDataRequest.class, baseUrl, "/insights/{org-slug}/summary", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        java.util.List<NameValuePair> queryParams = DrevOps.CircleCi.utils.Utils.getQueryParams(DrevOps.CircleCi.models.operations.GetOrgSummaryDataRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.GetOrgSummaryDataResponse res = new DrevOps.CircleCi.models.operations.GetOrgSummaryDataResponse(contentType, httpRes.statusCode()) {{
            getOrgSummaryData200ApplicationJSONObject = null;
            getOrgSummaryDataDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetOrgSummaryData200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetOrgSummaryData200ApplicationJSON.class);
                res.getOrgSummaryData200ApplicationJSONObject = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetOrgSummaryDataDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetOrgSummaryDataDefaultApplicationJSON.class);
                res.getOrgSummaryDataDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get summary metrics for a project workflow's jobs.
     * Get summary metrics for a project workflow's jobs. Job runs going back at most 90 days are included in the aggregation window. Metrics are refreshed daily, and thus may not include executions from the last 24 hours. Please note that Insights is not a financial reporting tool and should not be used for precise credit reporting.  Credit reporting from Insights does not use the same source of truth as the billing information that is found in the Plan Overview page in the CircleCI UI, nor does the underlying data have the same data accuracy guarantees as the billing information in the CircleCI UI.  This may lead to discrepancies between credits reported from Insights and the billing information in the Plan Overview page of the CircleCI UI.  For precise credit reporting, always use the Plan Overview page in the CircleCI UI.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.GetProjectWorkflowJobMetricsResponse getProjectWorkflowJobMetrics(DrevOps.CircleCi.models.operations.GetProjectWorkflowJobMetricsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.GetProjectWorkflowJobMetricsRequest.class, baseUrl, "/insights/{project-slug}/workflows/{workflow-name}/jobs", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        java.util.List<NameValuePair> queryParams = DrevOps.CircleCi.utils.Utils.getQueryParams(DrevOps.CircleCi.models.operations.GetProjectWorkflowJobMetricsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.GetProjectWorkflowJobMetricsResponse res = new DrevOps.CircleCi.models.operations.GetProjectWorkflowJobMetricsResponse(contentType, httpRes.statusCode()) {{
            getProjectWorkflowJobMetrics200ApplicationJSONObject = null;
            getProjectWorkflowJobMetricsDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetProjectWorkflowJobMetrics200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetProjectWorkflowJobMetrics200ApplicationJSON.class);
                res.getProjectWorkflowJobMetrics200ApplicationJSONObject = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetProjectWorkflowJobMetricsDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetProjectWorkflowJobMetricsDefaultApplicationJSON.class);
                res.getProjectWorkflowJobMetricsDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get summary metrics for a project's workflows
     * Get summary metrics for a project's workflows.  Workflow runs going back at most 90 days are included in the aggregation window. Metrics are refreshed daily, and thus may not include executions from the last 24 hours.  Please note that Insights is not a financial reporting tool and should not be used for precise credit reporting.  Credit reporting from Insights does not use the same source of truth as the billing information that is found in the Plan Overview page in the CircleCI UI, nor does the underlying data have the same data accuracy guarantees as the billing information in the CircleCI UI.  This may lead to discrepancies between credits reported from Insights and the billing information in the Plan Overview page of the CircleCI UI.  For precise credit reporting, always use the Plan Overview page in the CircleCI UI.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.GetProjectWorkflowMetricsResponse getProjectWorkflowMetrics(DrevOps.CircleCi.models.operations.GetProjectWorkflowMetricsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.GetProjectWorkflowMetricsRequest.class, baseUrl, "/insights/{project-slug}/workflows", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        java.util.List<NameValuePair> queryParams = DrevOps.CircleCi.utils.Utils.getQueryParams(DrevOps.CircleCi.models.operations.GetProjectWorkflowMetricsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.GetProjectWorkflowMetricsResponse res = new DrevOps.CircleCi.models.operations.GetProjectWorkflowMetricsResponse(contentType, httpRes.statusCode()) {{
            getProjectWorkflowMetrics200ApplicationJSONObject = null;
            getProjectWorkflowMetricsDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetProjectWorkflowMetrics200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetProjectWorkflowMetrics200ApplicationJSON.class);
                res.getProjectWorkflowMetrics200ApplicationJSONObject = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetProjectWorkflowMetricsDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetProjectWorkflowMetricsDefaultApplicationJSON.class);
                res.getProjectWorkflowMetricsDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get recent runs of a workflow
     * Get recent runs of a workflow. Runs going back at most 90 days are returned. Please note that Insights is not a financial reporting tool and should not be used for precise credit reporting.  Credit reporting from Insights does not use the same source of truth as the billing information that is found in the Plan Overview page in the CircleCI UI, nor does the underlying data have the same data accuracy guarantees as the billing information in the CircleCI UI.  This may lead to discrepancies between credits reported from Insights and the billing information in the Plan Overview page of the CircleCI UI.  For precise credit reporting, always use the Plan Overview page in the CircleCI UI.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.GetProjectWorkflowRunsResponse getProjectWorkflowRuns(DrevOps.CircleCi.models.operations.GetProjectWorkflowRunsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.GetProjectWorkflowRunsRequest.class, baseUrl, "/insights/{project-slug}/workflows/{workflow-name}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        java.util.List<NameValuePair> queryParams = DrevOps.CircleCi.utils.Utils.getQueryParams(DrevOps.CircleCi.models.operations.GetProjectWorkflowRunsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.GetProjectWorkflowRunsResponse res = new DrevOps.CircleCi.models.operations.GetProjectWorkflowRunsResponse(contentType, httpRes.statusCode()) {{
            getProjectWorkflowRuns200ApplicationJSONObject = null;
            getProjectWorkflowRunsDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetProjectWorkflowRuns200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetProjectWorkflowRuns200ApplicationJSON.class);
                res.getProjectWorkflowRuns200ApplicationJSONObject = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetProjectWorkflowRunsDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetProjectWorkflowRunsDefaultApplicationJSON.class);
                res.getProjectWorkflowRunsDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get test metrics for a project's workflows
     * Get test metrics for a project's workflows. Currently tests metrics are calculated based on 10 most recent workflow runs.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.GetProjectWorkflowTestMetricsResponse getProjectWorkflowTestMetrics(DrevOps.CircleCi.models.operations.GetProjectWorkflowTestMetricsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.GetProjectWorkflowTestMetricsRequest.class, baseUrl, "/insights/{project-slug}/workflows/{workflow-name}/test-metrics", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        java.util.List<NameValuePair> queryParams = DrevOps.CircleCi.utils.Utils.getQueryParams(DrevOps.CircleCi.models.operations.GetProjectWorkflowTestMetricsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.GetProjectWorkflowTestMetricsResponse res = new DrevOps.CircleCi.models.operations.GetProjectWorkflowTestMetricsResponse(contentType, httpRes.statusCode()) {{
            getProjectWorkflowTestMetrics200ApplicationJSONObject = null;
            getProjectWorkflowTestMetricsDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetProjectWorkflowTestMetrics200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetProjectWorkflowTestMetrics200ApplicationJSON.class);
                res.getProjectWorkflowTestMetrics200ApplicationJSONObject = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetProjectWorkflowTestMetricsDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetProjectWorkflowTestMetricsDefaultApplicationJSON.class);
                res.getProjectWorkflowTestMetricsDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get summary metrics and trends for a project across it's workflows and branches
     * Get summary metrics and trends for a project at workflow and branch level. 
     *              Workflow runs going back at most 90 days are included in the aggregation window. 
     *              Trends are only supported upto last 30 days. 
     *              Please note that Insights is not a financial reporting tool and should not be used for precise credit reporting.  Credit reporting from Insights does not use the same source of truth as the billing information that is found in the Plan Overview page in the CircleCI UI, nor does the underlying data have the same data accuracy guarantees as the billing information in the CircleCI UI.  This may lead to discrepancies between credits reported from Insights and the billing information in the Plan Overview page of the CircleCI UI.  For precise credit reporting, always use the Plan Overview page in the CircleCI UI.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.GetProjectWorkflowsPageDataResponse getProjectWorkflowsPageData(DrevOps.CircleCi.models.operations.GetProjectWorkflowsPageDataRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.GetProjectWorkflowsPageDataRequest.class, baseUrl, "/insights/pages/{project-slug}/summary", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        java.util.List<NameValuePair> queryParams = DrevOps.CircleCi.utils.Utils.getQueryParams(DrevOps.CircleCi.models.operations.GetProjectWorkflowsPageDataRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.GetProjectWorkflowsPageDataResponse res = new DrevOps.CircleCi.models.operations.GetProjectWorkflowsPageDataResponse(contentType, httpRes.statusCode()) {{
            getProjectWorkflowsPageData200ApplicationJSONObject = null;
            getProjectWorkflowsPageDataDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetProjectWorkflowsPageData200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetProjectWorkflowsPageData200ApplicationJSON.class);
                res.getProjectWorkflowsPageData200ApplicationJSONObject = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetProjectWorkflowsPageDataDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetProjectWorkflowsPageDataDefaultApplicationJSON.class);
                res.getProjectWorkflowsPageDataDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get metrics and trends for workflows
     * Get the metrics and trends for a particular workflow on a single branch or all branches
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.GetWorkflowSummaryResponse getWorkflowSummary(DrevOps.CircleCi.models.operations.GetWorkflowSummaryRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.GetWorkflowSummaryRequest.class, baseUrl, "/insights/{project-slug}/workflows/{workflow-name}/summary", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        java.util.List<NameValuePair> queryParams = DrevOps.CircleCi.utils.Utils.getQueryParams(DrevOps.CircleCi.models.operations.GetWorkflowSummaryRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.GetWorkflowSummaryResponse res = new DrevOps.CircleCi.models.operations.GetWorkflowSummaryResponse(contentType, httpRes.statusCode()) {{
            getWorkflowSummary200ApplicationJSONObject = null;
            getWorkflowSummaryDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetWorkflowSummary200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetWorkflowSummary200ApplicationJSON.class);
                res.getWorkflowSummary200ApplicationJSONObject = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetWorkflowSummaryDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetWorkflowSummaryDefaultApplicationJSON.class);
                res.getWorkflowSummaryDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }
}