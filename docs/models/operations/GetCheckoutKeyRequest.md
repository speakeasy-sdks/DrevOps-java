# GetCheckoutKeyRequest


## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `fingerprint`                                                                                  | *String*                                                                                       | :heavy_check_mark:                                                                             | An SSH key fingerprint.                                                                        |
| `projectSlug`                                                                                  | *String*                                                                                       | :heavy_check_mark:                                                                             | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped. |