# Requirements Traceability Matrix (RTM)

| **Requirement ID** | **Requirement Description**                                                                                          | **Test Case ID(s)**                                                                 | **Bug ID(s)**               |
|---------------------|----------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------|-----------------------------|
| RQ-001             | OTP should be sent to the user’s mobile number after entering a valid number.                                        | TC-001, TC-002                                                                      | BR-001                     |
| RQ-002             | PAN details should be fetched automatically if linked to the mobile number.                                         | TC-003, TC-004                                                                      | BR-002                     |
| RQ-003             | Loan details form should validate all fields for valid inputs.                                                      | TC-005, TC-006, EC-005                                                              | BR-003                     |
| RQ-004             | Eligible lenders should be displayed based on JSON rules created in GoRules.                                        | TC-007, TC-008, EC-010                                                              | BR-006                     |
| RQ-005             | API response time should not exceed 1 second for critical functionalities like PAN verification and loan eligibility.| TC-009, EC-014                                                                       | BR-004                     |
| RQ-006             | Invalid GoRules JSON files should be rejected with appropriate error messages.                                      | EC-011                                                                              | BR-005                     |
| RQ-007             | Failed API responses should be logged with details in Kibana for analysis.                                          | TC-010, EC-015                                                                      | BR-008                     |
| RQ-008             | Leads with incomplete loan details should be flagged for sales follow-up.                                           | EC-012                                                                              | BR-007                     |

---
