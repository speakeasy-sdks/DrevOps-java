# DeleteEnvVarRequest


## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `name`                                                                                         | *String*                                                                                       | :heavy_check_mark:                                                                             | The name of the environment variable.                                                          |
| `projectSlug`                                                                                  | *String*                                                                                       | :heavy_check_mark:                                                                             | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped. |