# CreateScheduleScheduleTimetable1

Timetable that specifies when a schedule triggers.


## Fields

| Field                                                                                                                     | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `daysOfMonth`                                                                                                             | List<*Long*>                                                                                                              | :heavy_minus_sign:                                                                                                        | Days in a month in which the schedule triggers. This is mutually exclusive with days in a week.                           |
| `daysOfWeek`                                                                                                              | List<[CreateScheduleScheduleTimetable1DaysOfWeek](../../models/operations/CreateScheduleScheduleTimetable1DaysOfWeek.md)> | :heavy_check_mark:                                                                                                        | Days in a week in which the schedule triggers.                                                                            |
| `hoursOfDay`                                                                                                              | List<*Long*>                                                                                                              | :heavy_check_mark:                                                                                                        | Hours in a day in which the schedule triggers.                                                                            |
| `months`                                                                                                                  | List<[CreateScheduleScheduleTimetable1Months](../../models/operations/CreateScheduleScheduleTimetable1Months.md)>         | :heavy_minus_sign:                                                                                                        | Months in which the schedule triggers.                                                                                    |
| `perHour`                                                                                                                 | *Long*                                                                                                                    | :heavy_check_mark:                                                                                                        | Number of times a schedule triggers per hour, value must be between 1 and 60                                              |