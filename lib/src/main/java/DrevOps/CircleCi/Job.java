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
import java.time.OffsetDateTime;

public class Job {
	
	private SDKConfiguration sdkConfiguration;

	public Job(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Cancel job
     * Cancel job with a given job number.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.CancelJobResponse cancelJob(DrevOps.CircleCi.models.operations.CancelJobRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.CancelJobRequest.class, baseUrl, "/project/{project-slug}/job/{job-number}/cancel", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.CancelJobResponse res = new DrevOps.CircleCi.models.operations.CancelJobResponse(contentType, httpRes.statusCode()) {{
            messageResponse = null;
            cancelJobDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.CancelJobMessageResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.CancelJobMessageResponse.class);
                res.messageResponse = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.CancelJobDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.CancelJobDefaultApplicationJSON.class);
                res.cancelJobDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get a job's artifacts
     * Returns a job's artifacts.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.GetJobArtifactsResponse getJobArtifacts(DrevOps.CircleCi.models.operations.GetJobArtifactsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.GetJobArtifactsRequest.class, baseUrl, "/project/{project-slug}/{job-number}/artifacts", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.GetJobArtifactsResponse res = new DrevOps.CircleCi.models.operations.GetJobArtifactsResponse(contentType, httpRes.statusCode()) {{
            artifactListResponse = null;
            getJobArtifactsDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetJobArtifactsArtifactListResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetJobArtifactsArtifactListResponse.class);
                res.artifactListResponse = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetJobArtifactsDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetJobArtifactsDefaultApplicationJSON.class);
                res.getJobArtifactsDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get job details
     * Returns job details.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.GetJobDetailsResponse getJobDetails(DrevOps.CircleCi.models.operations.GetJobDetailsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.GetJobDetailsRequest.class, baseUrl, "/project/{project-slug}/job/{job-number}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.GetJobDetailsResponse res = new DrevOps.CircleCi.models.operations.GetJobDetailsResponse(contentType, httpRes.statusCode()) {{
            jobDetails = null;
            getJobDetailsDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetJobDetailsJobDetails out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetJobDetailsJobDetails.class);
                res.jobDetails = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetJobDetailsDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetJobDetailsDefaultApplicationJSON.class);
                res.getJobDetailsDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get test metadata
     * Get test metadata for a build. In the rare case where there is more than 250MB of test data on the job, no results will be returned.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.GetTestsResponse getTests(DrevOps.CircleCi.models.operations.GetTestsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.GetTestsRequest.class, baseUrl, "/project/{project-slug}/{job-number}/tests", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.GetTestsResponse res = new DrevOps.CircleCi.models.operations.GetTestsResponse(contentType, httpRes.statusCode()) {{
            testsResponse = null;
            getTestsDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetTestsTestsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetTestsTestsResponse.class);
                res.testsResponse = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetTestsDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetTestsDefaultApplicationJSON.class);
                res.getTestsDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }
}