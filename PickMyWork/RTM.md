# Requirements Traceability Matrix (RTM) for "Pick My Work" Project

## RTM Overview
The table below outlines the mapping between the requirements and the corresponding test cases. This ensures that all requirements are covered by appropriate test cases and validates their implementation.

---

| **Requirement ID** | **Requirement Description**                                 | **Test Case ID(s)**  | **Test Case Description**                                   | **Test Status** |
|--------------------|--------------------------------------------------------------|----------------------|--------------------------------------------------------------|-----------------|
| REQ-001            | User should be able to log in with valid credentials.         | TC001, TC002          | Test login functionality with valid username and password.   | Passed          |
| REQ-002            | User should see an error message with invalid credentials.    | TC003                 | Test login functionality with invalid credentials.           | Passed          |
| REQ-003            | Users can update their profile information.                  | TC007                 | Test updating user profile details.                          | Failed          |
| REQ-004            | User should be able to upload images(PAN/AADHAR) to the platform.         | TC011, TC012          | Test file upload with various file formats.                  | Blocked         |
| REQ-005            | System should allow users to integrate payment methods.      | TC015                 | Test payment gateway integration.                            | Failed          |
| REQ-006            | In-App notifications should be sent on registration.          | TC06                 | Test email notification after registration.                  | Skipped         |
| REQ-007            | User should be able to apply for job. | TC08                | Test admin functionality for report generation.              | Passed          |
| REQ-008            | User should be able to check training videos on app.                 | TC05                 | Test password reset functionality.                           | Passed          |
| REQ-009            | The platform should support multiple languages.              | TC04                 | Test language change functionality.                          | Passed          |
| REQ-010            | User should be able to log out.                              | TC010                 | Test logout functionality.                                   | Passed          |

---

## Summary
- **Total Requirements**: 10
- **Test Cases Executed**: 15
- **Failed Test Cases**: 2 (TC003 and TC045)
- **Blocked Test Cases**: 1 (TC011)
- **Skipped Test Cases**: 1 (TC060)

---

**Note**: The test statuses in this RTM are based on the results from the recent test execution. Any failed or blocked test cases need to be investigated and addressed in future test cycles.

