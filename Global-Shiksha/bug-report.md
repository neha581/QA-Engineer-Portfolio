# Bug Report for Payment Gateway 

| **Bug ID**   | **Test Case ID** | **Bug Description**                                                   | **Steps to Reproduce**                                                                                                                                       | **Expected Result**                                                         | **Actual Result**                                                      | **Severity** | **Priority** | **Status** | **Assigned To** | **Date Reported** | **Resolution**                |
|--------------|------------------|-----------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------|-------------------------------------------------------------------------|--------------|--------------|------------|-----------------|-------------------|--------------------------------|
| **BUG-001**  | TC002            | Incorrect error message for expired credit card.                      | 1. Select "Credit Card".<br> 2. Enter expired card details.<br> 3. Click "Pay Now".                                                                         | Error message: "Card expired. Please use a valid card."                   | Error message: "Payment declined. Contact your bank."                  | Major        | High         | Open       | Dev        | 2017-12-18        | Awaiting Fix                  |
| **BUG-002**  | TC005            | Blank page displayed for invalid UPI ID.                              | 1. Select "UPI".<br> 2. Enter invalid UPI ID.<br> 3. Click "Pay Now".                                                                                     | Error message: "Invalid UPI ID. Please check and try again."            | Blank page displayed. API returns 400 Bad Request with invalid UPI ID. | Major        | Medium       | Open       | Dev      | 2017-12-18        | Under Investigation           |
| **BUG-003**  | TC006            | Transaction hangs during network failure.                             | 1. Start payment process.<br> 2. Simulate network failure during the transaction.                                                                           | Error message: "Network error. Please try again."                        | Transaction hangs with no error message.                              | Critical     | High         | Resolved    | Dev    | 2017-12-18        | Fixed and verified            |
| **BUG-004**  | TC008            | Payment cancellation failure during transaction process.              | 1. Start payment.<br> 2. Click "Cancel" before submitting.<br> 3. Observe failure in redirection.                                                           | Payment should be canceled, user redirected to options page.              | Payment not canceled, error message: "Unable to cancel the payment."    | Major        | High         | Open       | Dev     | 2017-12-18        | Pending Fix                   |

---

### **Note:**
- **Severity**: Represents the impact of the bug on the application (Critical, Major, Minor).
- **Priority**: Indicates how soon the bug needs to be fixed (High, Medium, Low).
- **Status**: Represents the current state of the bug (Open, Resolved, Pending, Closed).
- **Assigned To**: The team member responsible for resolving the bug.
- **Resolution**: Brief description of the bug resolution (Fixed, Pending Fix, Deferred, etc.).