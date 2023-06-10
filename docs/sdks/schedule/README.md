# schedule

### Available Operations

* [createSchedule](#createschedule) - Create a schedule
* [deleteScheduleById](#deleteschedulebyid) - Delete a schedule
* [getScheduleById](#getschedulebyid) - Get a schedule
* [listSchedulesForProject](#listschedulesforproject) - Get all schedules
* [updateSchedule](#updateschedule) - Update a schedule

## createSchedule

Creates a schedule and returns the created schedule.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.CreateScheduleCreateScheduleParameters;
import DrevOps.CircleCi.models.operations.CreateScheduleCreateScheduleParametersAttributionActor;
import DrevOps.CircleCi.models.operations.CreateScheduleCreateScheduleParametersTimetable1;
import DrevOps.CircleCi.models.operations.CreateScheduleCreateScheduleParametersTimetable1DaysOfWeek;
import DrevOps.CircleCi.models.operations.CreateScheduleCreateScheduleParametersTimetable1Months;
import DrevOps.CircleCi.models.operations.CreateScheduleCreateScheduleParametersTimetable2;
import DrevOps.CircleCi.models.operations.CreateScheduleCreateScheduleParametersTimetable2DaysOfWeek;
import DrevOps.CircleCi.models.operations.CreateScheduleCreateScheduleParametersTimetable2Months;
import DrevOps.CircleCi.models.operations.CreateScheduleRequest;
import DrevOps.CircleCi.models.operations.CreateScheduleResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            CreateScheduleRequest req = new CreateScheduleRequest("totam") {{
                requestBody = new CreateScheduleCreateScheduleParameters(CreateScheduleCreateScheduleParametersAttributionActor.CURRENT, "nihil",                 new java.util.HashMap<String, Object>() {{
                                    put("expedita", "neque");
                                }},                 new CreateScheduleCreateScheduleParametersTimetable1(                new DrevOps.CircleCi.models.operations.CreateScheduleCreateScheduleParametersTimetable1DaysOfWeek[]{{
                                                    add(CreateScheduleCreateScheduleParametersTimetable1DaysOfWeek.TUE),
                                                    add(CreateScheduleCreateScheduleParametersTimetable1DaysOfWeek.SAT),
                                                }},                 new Long[]{{
                                                    add(704474L),
                                                    add(396060L),
                                                    add(463150L),
                                                }}, 565421L) {{
                                    daysOfMonth = new Long[]{{
                                        add(730442L),
                                        add(374170L),
                                    }};
                                    daysOfWeek = new DrevOps.CircleCi.models.operations.CreateScheduleCreateScheduleParametersTimetable1DaysOfWeek[]{{
                                        add(CreateScheduleCreateScheduleParametersTimetable1DaysOfWeek.MON),
                                        add(CreateScheduleCreateScheduleParametersTimetable1DaysOfWeek.SAT),
                                        add(CreateScheduleCreateScheduleParametersTimetable1DaysOfWeek.SAT),
                                    }};
                                    hoursOfDay = new Long[]{{
                                        add(586784L),
                                    }};
                                    months = new DrevOps.CircleCi.models.operations.CreateScheduleCreateScheduleParametersTimetable1Months[]{{
                                        add(CreateScheduleCreateScheduleParametersTimetable1Months.JAN),
                                        add(CreateScheduleCreateScheduleParametersTimetable1Months.SEP),
                                        add(CreateScheduleCreateScheduleParametersTimetable1Months.NOV),
                                        add(CreateScheduleCreateScheduleParametersTimetable1Months.SEP),
                                    }};
                                    perHour = 517379L;
                                }}) {{
                    description = "temporibus";
                }};;
            }};            

            CreateScheduleResponse res = sdk.schedule.createSchedule(req);

            if (res.schedule != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [DrevOps.CircleCi.models.operations.CreateScheduleRequest](../../models/operations/CreateScheduleRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[DrevOps.CircleCi.models.operations.CreateScheduleResponse](../../models/operations/CreateScheduleResponse.md)**


## deleteScheduleById

Deletes the schedule by id.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.DeleteScheduleByIdRequest;
import DrevOps.CircleCi.models.operations.DeleteScheduleByIdResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            DeleteScheduleByIdRequest req = new DeleteScheduleByIdRequest("2322715b-f0cb-4b1e-b1b8-b90f3443a110");            

            DeleteScheduleByIdResponse res = sdk.schedule.deleteScheduleById(req);

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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [DrevOps.CircleCi.models.operations.DeleteScheduleByIdRequest](../../models/operations/DeleteScheduleByIdRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[DrevOps.CircleCi.models.operations.DeleteScheduleByIdResponse](../../models/operations/DeleteScheduleByIdResponse.md)**


## getScheduleById

Get a schedule by id.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.GetScheduleByIdRequest;
import DrevOps.CircleCi.models.operations.GetScheduleByIdResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            GetScheduleByIdRequest req = new GetScheduleByIdRequest("8e0adcf4-b921-4879-bce9-53f73ef7fbc7");            

            GetScheduleByIdResponse res = sdk.schedule.getScheduleById(req);

            if (res.schedule != null) {
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
| `request`                                                                                                      | [DrevOps.CircleCi.models.operations.GetScheduleByIdRequest](../../models/operations/GetScheduleByIdRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[DrevOps.CircleCi.models.operations.GetScheduleByIdResponse](../../models/operations/GetScheduleByIdResponse.md)**


## listSchedulesForProject

Returns all schedules for this project.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.ListSchedulesForProjectRequest;
import DrevOps.CircleCi.models.operations.ListSchedulesForProjectResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            ListSchedulesForProjectRequest req = new ListSchedulesForProjectRequest("similique") {{
                pageToken = "facilis";
            }};            

            ListSchedulesForProjectResponse res = sdk.schedule.listSchedulesForProject(req);

            if (res.listSchedulesForProject200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [DrevOps.CircleCi.models.operations.ListSchedulesForProjectRequest](../../models/operations/ListSchedulesForProjectRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[DrevOps.CircleCi.models.operations.ListSchedulesForProjectResponse](../../models/operations/ListSchedulesForProjectResponse.md)**


## updateSchedule

Updates a schedule and returns the updated schedule.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.UpdateScheduleRequest;
import DrevOps.CircleCi.models.operations.UpdateScheduleResponse;
import DrevOps.CircleCi.models.operations.UpdateScheduleUpdateScheduleParameters;
import DrevOps.CircleCi.models.operations.UpdateScheduleUpdateScheduleParametersAttributionActor;
import DrevOps.CircleCi.models.operations.UpdateScheduleUpdateScheduleParametersTimetable;
import DrevOps.CircleCi.models.operations.UpdateScheduleUpdateScheduleParametersTimetableDaysOfWeek;
import DrevOps.CircleCi.models.operations.UpdateScheduleUpdateScheduleParametersTimetableMonths;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "";
                }})
                .build();

            UpdateScheduleRequest req = new UpdateScheduleRequest("d74dd39c-0f5d-42cf-b7c7-0a45626d4368") {{
                requestBody = new UpdateScheduleUpdateScheduleParameters() {{
                    attributionActor = UpdateScheduleUpdateScheduleParametersAttributionActor.CURRENT;
                    description = "dicta";
                    name = "Elisa Boyle";
                    parameters = new java.util.HashMap<String, Object>() {{
                        put("voluptatibus", "nostrum");
                        put("sapiente", "quisquam");
                        put("saepe", "ea");
                    }};
                    timetable = new UpdateScheduleUpdateScheduleParametersTimetable() {{
                        daysOfMonth = new Long[]{{
                            add(359271L),
                            add(333145L),
                            add(399499L),
                            add(81101L),
                        }};
                        daysOfWeek = new DrevOps.CircleCi.models.operations.UpdateScheduleUpdateScheduleParametersTimetableDaysOfWeek[]{{
                            add(UpdateScheduleUpdateScheduleParametersTimetableDaysOfWeek.SUN),
                            add(UpdateScheduleUpdateScheduleParametersTimetableDaysOfWeek.WED),
                        }};
                        hoursOfDay = new Long[]{{
                            add(926213L),
                        }};
                        months = new DrevOps.CircleCi.models.operations.UpdateScheduleUpdateScheduleParametersTimetableMonths[]{{
                            add(UpdateScheduleUpdateScheduleParametersTimetableMonths.JUN),
                        }};
                        perHour = 53427L;
                    }};;
                }};;
            }};            

            UpdateScheduleResponse res = sdk.schedule.updateSchedule(req);

            if (res.schedule != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [DrevOps.CircleCi.models.operations.UpdateScheduleRequest](../../models/operations/UpdateScheduleRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[DrevOps.CircleCi.models.operations.UpdateScheduleResponse](../../models/operations/UpdateScheduleResponse.md)**

