# Dotpe Capitals - Business Loan Aggregator

## Project Overview
Dotpe Capitals is a loan aggregator platform designed to help small merchants secure Business Loans (BL). The platform also provides a credit score checking feature, offering a seamless loan application experience for users while ensuring lenders' conditions are met.

---

## Features Tested

### User Journey
1. **Mobile Number Verification:**
   - Validate OTP-based authentication process.
   - Ensure proper error messages for invalid or expired OTPs.

2. **PAN Verification:**
   - Check if the mobile number has a linked PAN.
   - Fetch details from the linked PAN, or prompt the user to input their PAN manually.
   - Verify fetched details (name, address, DOB, etc.).

3. **Loan Application Details:**
   - Validate input fields for:
     - Annual turnover
     - Business vintage
     - Loan amount required
     - Business constitution

4. **Eligibility Matching:**
   - Ensure that the platform correctly matches the user profile against lender conditions.
   - Verify that only eligible lenders are displayed to the user.

5. **Lead Creation:**
   - Confirm that all user details are saved correctly as leads in the database.
   - Validate the flow for the sales team accessing leads.

---

## Manual Testing Highlights

### Functional Testing
- **Lender Eligibility Check:**
  - Verified that users only see lenders whose conditions they meet.
  - Tested edge cases, such as users barely meeting or exceeding eligibility criteria.

- **PAN Details Fetching:**
  - Ensured accurate data fetching for linked PANs.
  - Tested scenarios where PAN details are incomplete or invalid.

### API Testing
- Verified API response times to ensure they are within acceptable limits.
- Created JSON rules for testing scenarios where:
  - User is eligible for multiple lenders.
  - User is eligible for no lenders (edge cases).
  - Incorrect API responses trigger proper error handling.
- Logged and analyzed failed API responses to identify and resolve issues.

### Data Validation
- Tested the JSON creation process for GoRules logic:
  - Validated correctness of rules based on lenders' criteria.
  - Ensured proper storage and retrieval of JSON in the database.

### Performance Testing
- Checked system behavior under heavy load (multiple users applying simultaneously).
- Verified logs for API failures to ensure prompt debugging.

---

## Tools Used
- **Bug Tracking:** JIRA
- **API Testing:** Postman
- **Database Validation:** MySQL
- **Log Analysis:** Kibana

---

## Key Learnings
- Improved understanding of rule-based engines like GoRules for eligibility checks.
- Enhanced skills in analyzing API logs and troubleshooting failed responses.
- Developed comprehensive test cases to cover edge scenarios.

---

## Sample Test Cases

### Test Case: Lender Eligibility Check
| **Test Scenario**            | **Expected Result**                                                  |
|-------------------------------|----------------------------------------------------------------------|
| User meets all lender criteria | Display eligible lender(s)                                           |
| User does not meet any criteria| Show appropriate "no lenders available" message                   |
| User's age is just below limit | Exclude lender from eligible list                                   |
| Annual turnover is equal to limit | Include lender in eligible list                                  |

### Test Case: API Response Time
| **Test Scenario**      | **Expected Result**             |
|-------------------------|---------------------------------|
| API response time < 2s  | Pass                           |
| API response time > 2s  | Fail and log issue             |

---

## Logs and Error Handling
- Monitored logs to:
  - Track API failures and identify root causes.
  - Verify proper error messages for failed API calls.
  - Ensure accurate data is logged for debugging purposes.

---

## Conclusion
The Dotpe Capitals project enhanced my expertise in manual testing by focusing on:
- Functional verification of critical loan aggregation features.
- API response analysis and performance validation.
- Comprehensive testing of JSON-based rule creation and application.

This project reinforced the importance of rigorous testing to ensure seamless functionality and a positive user experience.

---

## Artifacts
- [Test Plan](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/DotPeCapitals/Test-Plan.md)  
- [Test Cases](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/DotPeCapitals/Test-Cases.md)  
- [Bug Reports](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/DotPeCapitals/Bug-Report.md)  
- [RTM (Requirement Traceability Matrix)](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/DotPeCapitals/RTM.md)  

