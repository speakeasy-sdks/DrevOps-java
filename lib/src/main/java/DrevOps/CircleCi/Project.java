/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi;

import DrevOps.CircleCi.utils.HTTPClient;
import DrevOps.CircleCi.utils.HTTPRequest;
import DrevOps.CircleCi.utils.JSON;
import DrevOps.CircleCi.utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;

public class Project {
	
	private SDKConfiguration sdkConfiguration;

	public Project(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create a new checkout key
     * Creates a new checkout key. This API request is only usable with a user API token.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.CreateCheckoutKeyResponse createCheckoutKey(DrevOps.CircleCi.models.operations.CreateCheckoutKeyRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.CreateCheckoutKeyRequest.class, baseUrl, "/project/{project-slug}/checkout-key", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = DrevOps.CircleCi.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.CreateCheckoutKeyResponse res = new DrevOps.CircleCi.models.operations.CreateCheckoutKeyResponse(contentType, httpRes.statusCode()) {{
            checkoutKey = null;
            createCheckoutKeyDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.CreateCheckoutKeyCheckoutKey out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.CreateCheckoutKeyCheckoutKey.class);
                res.checkoutKey = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.CreateCheckoutKeyDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.CreateCheckoutKeyDefaultApplicationJSON.class);
                res.createCheckoutKeyDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Create an environment variable
     * Creates a new environment variable.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.CreateEnvVarResponse createEnvVar(DrevOps.CircleCi.models.operations.CreateEnvVarRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.CreateEnvVarRequest.class, baseUrl, "/project/{project-slug}/envvar", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = DrevOps.CircleCi.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.CreateEnvVarResponse res = new DrevOps.CircleCi.models.operations.CreateEnvVarResponse(contentType, httpRes.statusCode()) {{
            environmentVariablePair = null;
            createEnvVarDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.CreateEnvVarEnvironmentVariablePair out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.CreateEnvVarEnvironmentVariablePair.class);
                res.environmentVariablePair = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.CreateEnvVarDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.CreateEnvVarDefaultApplicationJSON.class);
                res.createEnvVarDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Delete a checkout key
     * Deletes the checkout key.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.DeleteCheckoutKeyResponse deleteCheckoutKey(DrevOps.CircleCi.models.operations.DeleteCheckoutKeyRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.DeleteCheckoutKeyRequest.class, baseUrl, "/project/{project-slug}/checkout-key/{fingerprint}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.DeleteCheckoutKeyResponse res = new DrevOps.CircleCi.models.operations.DeleteCheckoutKeyResponse(contentType, httpRes.statusCode()) {{
            messageResponse = null;
            deleteCheckoutKeyDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.DeleteCheckoutKeyMessageResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.DeleteCheckoutKeyMessageResponse.class);
                res.messageResponse = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.DeleteCheckoutKeyDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.DeleteCheckoutKeyDefaultApplicationJSON.class);
                res.deleteCheckoutKeyDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Delete an environment variable
     * Deletes the environment variable named :name.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.DeleteEnvVarResponse deleteEnvVar(DrevOps.CircleCi.models.operations.DeleteEnvVarRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.DeleteEnvVarRequest.class, baseUrl, "/project/{project-slug}/envvar/{name}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.DeleteEnvVarResponse res = new DrevOps.CircleCi.models.operations.DeleteEnvVarResponse(contentType, httpRes.statusCode()) {{
            messageResponse = null;
            deleteEnvVarDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.DeleteEnvVarMessageResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.DeleteEnvVarMessageResponse.class);
                res.messageResponse = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.DeleteEnvVarDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.DeleteEnvVarDefaultApplicationJSON.class);
                res.deleteEnvVarDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get a checkout key
     * Returns an individual checkout key.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.GetCheckoutKeyResponse getCheckoutKey(DrevOps.CircleCi.models.operations.GetCheckoutKeyRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.GetCheckoutKeyRequest.class, baseUrl, "/project/{project-slug}/checkout-key/{fingerprint}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.GetCheckoutKeyResponse res = new DrevOps.CircleCi.models.operations.GetCheckoutKeyResponse(contentType, httpRes.statusCode()) {{
            checkoutKey = null;
            getCheckoutKeyDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetCheckoutKeyCheckoutKey out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetCheckoutKeyCheckoutKey.class);
                res.checkoutKey = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetCheckoutKeyDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetCheckoutKeyDefaultApplicationJSON.class);
                res.getCheckoutKeyDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get a masked environment variable
     * Returns the masked value of environment variable :name.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.GetEnvVarResponse getEnvVar(DrevOps.CircleCi.models.operations.GetEnvVarRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.GetEnvVarRequest.class, baseUrl, "/project/{project-slug}/envvar/{name}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.GetEnvVarResponse res = new DrevOps.CircleCi.models.operations.GetEnvVarResponse(contentType, httpRes.statusCode()) {{
            environmentVariablePair = null;
            getEnvVarDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetEnvVarEnvironmentVariablePair out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetEnvVarEnvironmentVariablePair.class);
                res.environmentVariablePair = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetEnvVarDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetEnvVarDefaultApplicationJSON.class);
                res.getEnvVarDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get a project
     * Retrieves a project by project slug.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.GetProjectBySlugResponse getProjectBySlug(DrevOps.CircleCi.models.operations.GetProjectBySlugRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.GetProjectBySlugRequest.class, baseUrl, "/project/{project-slug}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.GetProjectBySlugResponse res = new DrevOps.CircleCi.models.operations.GetProjectBySlugResponse(contentType, httpRes.statusCode()) {{
            project = null;
            getProjectBySlugDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetProjectBySlugProject out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetProjectBySlugProject.class);
                res.project = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetProjectBySlugDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetProjectBySlugDefaultApplicationJSON.class);
                res.getProjectBySlugDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get all checkout keys
     * Returns a sequence of checkout keys for `:project`.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.ListCheckoutKeysResponse listCheckoutKeys(DrevOps.CircleCi.models.operations.ListCheckoutKeysRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.ListCheckoutKeysRequest.class, baseUrl, "/project/{project-slug}/checkout-key", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.ListCheckoutKeysResponse res = new DrevOps.CircleCi.models.operations.ListCheckoutKeysResponse(contentType, httpRes.statusCode()) {{
            checkoutKeyListResponse = null;
            listCheckoutKeysDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.ListCheckoutKeysCheckoutKeyListResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.ListCheckoutKeysCheckoutKeyListResponse.class);
                res.checkoutKeyListResponse = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.ListCheckoutKeysDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.ListCheckoutKeysDefaultApplicationJSON.class);
                res.listCheckoutKeysDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * List all environment variables
     * Returns four 'x' characters, in addition to the last four ASCII characters of the value, consistent with the display of environment variable values on the CircleCI website.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.ListEnvVarsResponse listEnvVars(DrevOps.CircleCi.models.operations.ListEnvVarsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.ListEnvVarsRequest.class, baseUrl, "/project/{project-slug}/envvar", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.ListEnvVarsResponse res = new DrevOps.CircleCi.models.operations.ListEnvVarsResponse(contentType, httpRes.statusCode()) {{
            environmentVariableListResponse = null;
            listEnvVarsDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.ListEnvVarsEnvironmentVariableListResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.ListEnvVarsEnvironmentVariableListResponse.class);
                res.environmentVariableListResponse = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.ListEnvVarsDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.ListEnvVarsDefaultApplicationJSON.class);
                res.listEnvVarsDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }
}