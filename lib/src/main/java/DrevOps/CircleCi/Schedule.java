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
import org.apache.http.NameValuePair;

public class Schedule {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Schedule(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    /**
     * Create a schedule
     * Creates a schedule and returns the created schedule.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.CreateScheduleResponse createSchedule(DrevOps.CircleCi.models.operations.CreateScheduleRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.CreateScheduleRequest.class, baseUrl, "/project/{project-slug}/schedule", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = DrevOps.CircleCi.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.CreateScheduleResponse res = new DrevOps.CircleCi.models.operations.CreateScheduleResponse(contentType, httpRes.statusCode()) {{
            schedule = null;
            createScheduleDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.CreateScheduleSchedule out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.CreateScheduleSchedule.class);
                res.schedule = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.CreateScheduleDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.CreateScheduleDefaultApplicationJSON.class);
                res.createScheduleDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Delete a schedule
     * Deletes the schedule by id.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.DeleteScheduleByIdResponse deleteScheduleById(DrevOps.CircleCi.models.operations.DeleteScheduleByIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.DeleteScheduleByIdRequest.class, baseUrl, "/schedule/{schedule-id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.DeleteScheduleByIdResponse res = new DrevOps.CircleCi.models.operations.DeleteScheduleByIdResponse(contentType, httpRes.statusCode()) {{
            messageResponse = null;
            deleteScheduleByIdDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.DeleteScheduleByIdMessageResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.DeleteScheduleByIdMessageResponse.class);
                res.messageResponse = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.DeleteScheduleByIdDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.DeleteScheduleByIdDefaultApplicationJSON.class);
                res.deleteScheduleByIdDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get a schedule
     * Get a schedule by id.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.GetScheduleByIdResponse getScheduleById(DrevOps.CircleCi.models.operations.GetScheduleByIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.GetScheduleByIdRequest.class, baseUrl, "/schedule/{schedule-id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.GetScheduleByIdResponse res = new DrevOps.CircleCi.models.operations.GetScheduleByIdResponse(contentType, httpRes.statusCode()) {{
            schedule = null;
            getScheduleByIdDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetScheduleByIdSchedule out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetScheduleByIdSchedule.class);
                res.schedule = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.GetScheduleByIdDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.GetScheduleByIdDefaultApplicationJSON.class);
                res.getScheduleByIdDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get all schedules
     * Returns all schedules for this project.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.ListSchedulesForProjectResponse listSchedulesForProject(DrevOps.CircleCi.models.operations.ListSchedulesForProjectRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.ListSchedulesForProjectRequest.class, baseUrl, "/project/{project-slug}/schedule", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = DrevOps.CircleCi.utils.Utils.getQueryParams(DrevOps.CircleCi.models.operations.ListSchedulesForProjectRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.ListSchedulesForProjectResponse res = new DrevOps.CircleCi.models.operations.ListSchedulesForProjectResponse(contentType, httpRes.statusCode()) {{
            listSchedulesForProject200ApplicationJSONObject = null;
            listSchedulesForProjectDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.ListSchedulesForProject200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.ListSchedulesForProject200ApplicationJSON.class);
                res.listSchedulesForProject200ApplicationJSONObject = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.ListSchedulesForProjectDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.ListSchedulesForProjectDefaultApplicationJSON.class);
                res.listSchedulesForProjectDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Update a schedule
     * Updates a schedule and returns the updated schedule.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public DrevOps.CircleCi.models.operations.UpdateScheduleResponse updateSchedule(DrevOps.CircleCi.models.operations.UpdateScheduleRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = DrevOps.CircleCi.utils.Utils.generateURL(DrevOps.CircleCi.models.operations.UpdateScheduleRequest.class, baseUrl, "/schedule/{schedule-id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = DrevOps.CircleCi.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        DrevOps.CircleCi.models.operations.UpdateScheduleResponse res = new DrevOps.CircleCi.models.operations.UpdateScheduleResponse(contentType, httpRes.statusCode()) {{
            schedule = null;
            updateScheduleDefaultApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.UpdateScheduleSchedule out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.UpdateScheduleSchedule.class);
                res.schedule = out;
            }
        }
        else {
            if (DrevOps.CircleCi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                DrevOps.CircleCi.models.operations.UpdateScheduleDefaultApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), DrevOps.CircleCi.models.operations.UpdateScheduleDefaultApplicationJSON.class);
                res.updateScheduleDefaultApplicationJSONObject = out;
            }
        }

        return res;
    }
}