<!-- Start SDK Example Usage -->
```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.AddEnvironmentVariableToContextRequest;
import DrevOps.CircleCi.models.operations.AddEnvironmentVariableToContextRequestBody;
import DrevOps.CircleCi.models.operations.AddEnvironmentVariableToContextResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            AddEnvironmentVariableToContextRequest req = new AddEnvironmentVariableToContextRequest("89bd9d8d-69a6-474e-8f46-7cc8796ed151", "deserunt") {{
                requestBody = new AddEnvironmentVariableToContextRequestBody("some-secret-value");;
            }};            

            AddEnvironmentVariableToContextResponse res = sdk.context.addEnvironmentVariableToContext(req);

            if (res.addEnvironmentVariableToContext200ApplicationJSONAnyOf != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->