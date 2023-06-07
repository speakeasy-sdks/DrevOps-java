/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package DrevOps.CircleCi;

import DrevOps.CircleCi.utils.HTTPClient;
import DrevOps.CircleCi.utils.SpeakeasyHTTPClient;

/**
 * CircleCI API: This describes the resources that make up the CircleCI API v2.
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

	private SDKConfiguration sdkConfiguration;

	/**
	 * The Builder class allows the configuration of a new instance of the SDK.
	 */
	public static class Builder {
		private SDKConfiguration sdkConfiguration = new SDKConfiguration();

		private Builder() {
		}

		/**
		 * Allows the default HTTP client to be overridden with a custom implementation.
		 * @param client The HTTP client to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setClient(HTTPClient client) {
			this.sdkConfiguration.defaultClient = client;
			return this;
		}
		
		/**
		 * Configures the SDK to use the provided security details.
		 * @param security The security details to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setSecurity(DrevOps.CircleCi.models.shared.Security security) {
			this.sdkConfiguration.security = security;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL.
		 * @param serverUrl The server URL to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl) {
			this.sdkConfiguration.serverUrl = serverUrl;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL  with a templated URL populated with the provided parameters.
		 * @param serverUrl The server URL to use for all requests.
		 * @param params The parameters to use when templating the URL.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl, java.util.Map<String, String> params) {
			this.sdkConfiguration.serverUrl = DrevOps.CircleCi.utils.Utils.templateUrl(serverUrl, params);
			return this;
		}
		
		/**
		 * Allows the overriding of the default server by index
		 * @param serverIdx The server to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setServerIndex(int serverIdx) {
			this.sdkConfiguration.serverIdx = serverIdx;
			this.sdkConfiguration.serverUrl = SERVERS[serverIdx];
			return this;
		}
		
		/**
		 * Builds a new instance of the SDK.
		 * @return The SDK instance.
		 * @throws Exception Thrown if the SDK could not be built.
		 */
		public SDK build() throws Exception {
			if (this.sdkConfiguration.defaultClient == null) {
				this.sdkConfiguration.defaultClient = new SpeakeasyHTTPClient();
			}
			
			if (this.sdkConfiguration.security != null) {
				this.sdkConfiguration.securityClient = DrevOps.CircleCi.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, this.sdkConfiguration.security);
			}
			
			if (this.sdkConfiguration.securityClient == null) {
				this.sdkConfiguration.securityClient = this.sdkConfiguration.defaultClient;
			}
			
			if (this.sdkConfiguration.serverUrl == null || this.sdkConfiguration.serverUrl.isBlank()) {
				this.sdkConfiguration.serverUrl = SERVERS[0];
				this.sdkConfiguration.serverIdx = 0;
			}

			if (this.sdkConfiguration.serverUrl.endsWith("/")) {
				this.sdkConfiguration.serverUrl = this.sdkConfiguration.serverUrl.substring(0, this.sdkConfiguration.serverUrl.length() - 1);
			}
			
			return new SDK(this.sdkConfiguration);
		}
	}

	/**
	 * Get a new instance of the SDK builder to configure a new instance of the SDK.
	 * @return The SDK builder instance.
	 */
	public static Builder builder() {
		return new Builder();
	}

	private SDK(SDKConfiguration sdkConfiguration) throws Exception {
		this.sdkConfiguration = sdkConfiguration;
		
		this.context = new Context(this.sdkConfiguration);
		
		this.insights = new Insights(this.sdkConfiguration);
		
		this.job = new Job(this.sdkConfiguration);
		
		this.pipeline = new Pipeline(this.sdkConfiguration);
		
		this.project = new Project(this.sdkConfiguration);
		
		this.schedule = new Schedule(this.sdkConfiguration);
		
		this.user = new User(this.sdkConfiguration);
		
		this.webhook = new Webhook(this.sdkConfiguration);
		
		this.workflow = new Workflow(this.sdkConfiguration);
	}
}