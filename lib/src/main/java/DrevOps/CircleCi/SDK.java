/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi;

import DrevOps.CircleCi.utils.HTTPClient;
import DrevOps.CircleCi.utils.SpeakeasyHTTPClient;

/**
 * This describes the resources that make up the CircleCI API v2.
 * 
 * # Authentication
 * 
 * &lt;!-- ReDoc-Inject: &lt;security-definitions&gt; --&gt;
 */
public class SDK {
	/**
	 * SERVERS contains the list of server urls available to the SDK.
	 */
	public static final String[] SERVERS = {
        "https://circleci.com/api/v2",
	};
  	
    public Context context;
    public Insights insights;
    public Job job;
    public Pipeline pipeline;
    public Project project;
    public Schedule schedule;
    public User user;
    public Webhook webhook;
    public Workflow workflow;	

	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private DrevOps.CircleCi.models.shared.Security _security;
	private String _serverUrl;
	private String _language = "java";
	private String _sdkVersion = "1.2.4";
	private String _genVersion = "2.26.4";
	/**
	 * The Builder class allows the configuration of a new instance of the SDK.
	 */
	public static class Builder {
		private HTTPClient client;
		private DrevOps.CircleCi.models.shared.Security security;
		private String serverUrl;
		private java.util.Map<String, String> params = new java.util.HashMap<String, String>();

		private Builder() {
		}

		/**
		 * Allows the default HTTP client to be overridden with a custom implementation.
		 * @param client The HTTP client to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setClient(HTTPClient client) {
			this.client = client;
			return this;
		}
		
		/**
		 * Configures the SDK to use the provided security details.
		 * @param security The security details to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setSecurity(DrevOps.CircleCi.models.shared.Security security) {
			this.security = security;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL.
		 * @param serverUrl The server URL to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl) {
			this.serverUrl = serverUrl;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL  with a templated URL populated with the provided parameters.
		 * @param serverUrl The server URL to use for all requests.
		 * @param params The parameters to use when templating the URL.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl, java.util.Map<String, String> params) {
			this.serverUrl = serverUrl;
			this.params = params;
			return this;
		}
		
		/**
		 * Builds a new instance of the SDK.
		 * @return The SDK instance.
		 * @throws Exception Thrown if the SDK could not be built.
		 */
		public SDK build() throws Exception {
			return new SDK(this.client, this.security, this.serverUrl, this.params);
		}
	}

	/**
	 * Get a new instance of the SDK builder to configure a new instance of the SDK.
	 * @return The SDK builder instance.
	 */
	public static Builder builder() {
		return new Builder();
	}

	private SDK(HTTPClient client, DrevOps.CircleCi.models.shared.Security security, String serverUrl, java.util.Map<String, String> params) throws Exception {
		this._defaultClient = client;
		
		if (this._defaultClient == null) {
			this._defaultClient = new SpeakeasyHTTPClient();
		}
		
		if (security != null) {
			this._security = security;
			this._securityClient = DrevOps.CircleCi.utils.Utils.configureSecurityClient(this._defaultClient, this._security);
		}
		
		if (this._securityClient == null) {
			this._securityClient = this._defaultClient;
		}

		if (serverUrl != null && !serverUrl.isBlank()) {
			this._serverUrl = DrevOps.CircleCi.utils.Utils.templateUrl(serverUrl, params);
		}
		
		if (this._serverUrl == null) {
			this._serverUrl = SERVERS[0];
		}

		if (this._serverUrl.endsWith("/")) {
            this._serverUrl = this._serverUrl.substring(0, this._serverUrl.length() - 1);
        }

		
		
		this.context = new Context(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.insights = new Insights(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.job = new Job(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.pipeline = new Pipeline(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.project = new Project(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.schedule = new Schedule(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.user = new User(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.webhook = new Webhook(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.workflow = new Workflow(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
	}
}