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
import DrevOps.CircleCi.models.operations.CreateScheduleCreateScheduleParametersAttributionActorEnum;
import DrevOps.CircleCi.models.operations.CreateScheduleCreateScheduleParametersTimetable1;
import DrevOps.CircleCi.models.operations.CreateScheduleCreateScheduleParametersTimetable1DaysOfWeekEnum;
import DrevOps.CircleCi.models.operations.CreateScheduleCreateScheduleParametersTimetable1MonthsEnum;
import DrevOps.CircleCi.models.operations.CreateScheduleCreateScheduleParametersTimetable2;
import DrevOps.CircleCi.models.operations.CreateScheduleCreateScheduleParametersTimetable2DaysOfWeekEnum;
import DrevOps.CircleCi.models.operations.CreateScheduleCreateScheduleParametersTimetable2MonthsEnum;
import DrevOps.CircleCi.models.operations.CreateScheduleRequest;
import DrevOps.CircleCi.models.operations.CreateScheduleResponse;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            CreateScheduleRequest req = new CreateScheduleRequest("cupiditate") {{
                requestBody = new CreateScheduleCreateScheduleParameters(CreateScheduleCreateScheduleParametersAttributionActorEnum.CURRENT, "maxime",                 new java.util.HashMap<String, Object>() {{
                                    put("soluta", "dicta");
                                    put("laborum", "totam");
                                    put("incidunt", "aspernatur");
                                    put("dolores", "distinctio");
                                }},                 new CreateScheduleCreateScheduleParametersTimetable2(                new Long[]{{
                                                    add(92596L),
                                                    add(903720L),
                                                    add(217450L),
                                                }},                 new Long[]{{
                                                    add(749255L),
                                                }}, 552193L) {{
                                    daysOfMonth = new Long[]{{
                                        add(463150L),
                                        add(565421L),
                                    }};
                                    daysOfWeek = new DrevOps.CircleCi.models.operations.CreateScheduleCreateScheduleParametersTimetable2DaysOfWeekEnum[]{{
                                        add(CreateScheduleCreateScheduleParametersTimetable2DaysOfWeekEnum.SAT),
                                        add(CreateScheduleCreateScheduleParametersTimetable2DaysOfWeekEnum.SAT),
                                        add(CreateScheduleCreateScheduleParametersTimetable2DaysOfWeekEnum.SAT),
                                        add(CreateScheduleCreateScheduleParametersTimetable2DaysOfWeekEnum.SAT),
                                    }};
                                    hoursOfDay = new Long[]{{
                                        add(124833L),
                                        add(355613L),
                                    }};
                                    months = new DrevOps.CircleCi.models.operations.CreateScheduleCreateScheduleParametersTimetable2MonthsEnum[]{{
                                        add(CreateScheduleCreateScheduleParametersTimetable2MonthsEnum.JUL),
                                        add(CreateScheduleCreateScheduleParametersTimetable2MonthsEnum.MAR),
                                        add(CreateScheduleCreateScheduleParametersTimetable2MonthsEnum.AUG),
                                    }};
                                    perHour = 746994L;
                                }}) {{
                    description = "tempore";
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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            DeleteScheduleByIdRequest req = new DeleteScheduleByIdRequest("90f3443a-1108-4e0a-9cf4-b921879fce95");            

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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetScheduleByIdRequest req = new GetScheduleByIdRequest("3f73ef7f-bc7a-4bd7-8dd3-9c0f5d2cff7c");            

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
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            ListSchedulesForProjectRequest req = new ListSchedulesForProjectRequest("ducimus") {{
                pageToken = "alias";
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

## updateSchedule

Updates a schedule and returns the updated schedule.

### Example Usage

```java
package hello.world;

import DrevOps.CircleCi.SDK;
import DrevOps.CircleCi.models.operations.UpdateScheduleRequest;
import DrevOps.CircleCi.models.operations.UpdateScheduleResponse;
import DrevOps.CircleCi.models.operations.UpdateScheduleUpdateScheduleParameters;
import DrevOps.CircleCi.models.operations.UpdateScheduleUpdateScheduleParametersAttributionActorEnum;
import DrevOps.CircleCi.models.operations.UpdateScheduleUpdateScheduleParametersTimetable;
import DrevOps.CircleCi.models.operations.UpdateScheduleUpdateScheduleParametersTimetableDaysOfWeekEnum;
import DrevOps.CircleCi.models.operations.UpdateScheduleUpdateScheduleParametersTimetableMonthsEnum;
import DrevOps.CircleCi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyHeader = "YOUR_API_KEY_HERE";
                }})
                .build();

            UpdateScheduleRequest req = new UpdateScheduleRequest("a45626d4-3681-43f1-ad9f-5fce6c556146") {{
                requestBody = new UpdateScheduleUpdateScheduleParameters() {{
                    attributionActor = UpdateScheduleUpdateScheduleParametersAttributionActorEnum.CURRENT;
                    description = "quo";
                    name = "Kate Cole DVM";
                    parameters = new java.util.HashMap<String, Object>() {{
                        put("aut", "aut");
                        put("deleniti", "impedit");
                        put("aliquam", "fugit");
                    }};
                    timetable = new UpdateScheduleUpdateScheduleParametersTimetable() {{
                        daysOfMonth = new Long[]{{
                            add(79522L),
                            add(250622L),
                            add(89603L),
                            add(677412L),
                        }};
                        daysOfWeek = new DrevOps.CircleCi.models.operations.UpdateScheduleUpdateScheduleParametersTimetableDaysOfWeekEnum[]{{
                            add(UpdateScheduleUpdateScheduleParametersTimetableDaysOfWeekEnum.WED),
                            add(UpdateScheduleUpdateScheduleParametersTimetableDaysOfWeekEnum.SAT),
                            add(UpdateScheduleUpdateScheduleParametersTimetableDaysOfWeekEnum.MON),
                        }};
                        hoursOfDay = new Long[]{{
                            add(752135L),
                            add(557369L),
                        }};
                        months = new DrevOps.CircleCi.models.operations.UpdateScheduleUpdateScheduleParametersTimetableMonthsEnum[]{{
                            add(UpdateScheduleUpdateScheduleParametersTimetableMonthsEnum.JAN),
                            add(UpdateScheduleUpdateScheduleParametersTimetableMonthsEnum.MAY),
                            add(UpdateScheduleUpdateScheduleParametersTimetableMonthsEnum.SEP),
                            add(UpdateScheduleUpdateScheduleParametersTimetableMonthsEnum.NOV),
                        }};
                        perHour = 270328L;
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
