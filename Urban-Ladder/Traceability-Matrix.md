# Traceability Matrix

| **Requirement ID** | **Requirement Description**                                                | **Test Case ID(s)**              | **Bug ID(s)**       | **Status**          |
|---------------------|----------------------------------------------------------------------------|-----------------------------------|---------------------|---------------------|
| **REQ-001**         | Users can add, edit, and delete single products via the inventory portal. | TC_FT_01, TC_FT_02, TC_FT_03     | BUG-001             | Partially Passed    |
| **REQ-002**         | Bulk upload functionality for adding multiple products at once.          | TC_FT_04, TC_DB_02               | BUG-004             | Open                |
| **REQ-003**         | Synchronization of product data between inventory portal and storefront. | TC_FT_01, TC_FT_02, TC_API_02    | BUG-001, BUG-002    | Under Investigation |
| **REQ-004**         | Error handling for invalid product data.                                 | TC_FT_05, TC_API_05              | BUG-002             | Open                |
| **REQ-005**         | API functionality for product management.                               | TC_API_01, TC_API_02, TC_API_03  | BUG-002             | Open                |
| **REQ-006**         | Cross-browser compatibility for inventory portal and storefront.         | TC_CB_01, TC_CB_02, TC_CB_03     | BUG-003             | Open                |
| **REQ-007**         | Database integrity for product information.                             | TC_DB_01, TC_DB_02               | BUG-004             | Open                |
| **REQ-008**         | Performance under high traffic.                                         | TC_PT_01, TC_PT_02               | N/A                 | Passed              |
| **REQ-009**         | Support for adding and managing discount coupons and promotional offers. | TC_COUP_01, TC_COUP_02           | N/A                 | Passed              |
| **REQ-010**         | Ability to manage user accounts (add, edit, delete, and assign roles).  | TC_USER_01, TC_USER_02, TC_USER_03 | N/A                | Passed              |
| **REQ-011**         | Generate and view reports for inventory, sales, and user activity.      | TC_RPT_01, TC_RPT_02, TC_RPT_03  | N/A                 | Passed              |

---

### **Legend:**
- **Requirement ID**: A unique identifier for each requirement.
- **Requirement Description**: A brief description of the requirement.
- **Test Case ID(s)**: The IDs of the test cases that validate the requirement.
- **Bug ID(s)**: The IDs of bugs identified during testing of the requirement.
- **Status**: Current status of the requirement (Passed, Failed, Partially Passed, Open, Under Investigation).
