
# Test Plan for Dotpe Capitals

## Project Name: Dotpe Capitals
**Version:** 1.0  
**Prepared By:** Neha Sharma  
**Date:** 13 Dec,24

---

## 1. Introduction
The purpose of this test plan is to validate the functionality, performance, and reliability of the Dotpe Capitals platform, focusing on its Business Loan (BL) offering for small merchants. The platform should ensure accurate lender matching, seamless API integration, and a smooth user experience.

---

## 2. Scope
This test plan covers the following modules and functionalities:
- User Registration and OTP Verification
- PAN Verification and Data Fetching
- Loan Details Collection
- Eligibility Check via GoRules JSON
- Display of Eligible Lenders
- Lead Creation for Sales Team
- API Performance and Error Handling

Testing will be conducted manually, focusing on functionality, edge cases, and API response validation.

---

## 3. Objectives
- Ensure only eligible lenders are displayed based on the GoRules JSON.
- Verify data fetching from PAN and validate its accuracy.
- Test API response times and handle errors gracefully.
- Validate edge cases for various inputs like invalid PAN, missing fields, etc.
- Verify logs for failed API responses and ensure proper error messages are displayed to users.

---

## 4. Test Items
### Modules to Test:
1. **User Registration and OTP Verification**
2. **PAN Verification and Data Fetching**
3. **Loan Details Submission**
4. **Eligibility Rules Matching via GoRules**
5. **Lender Matching and Display**
6. **Lead Management**
7. **API Performance and Logs Monitoring**

---

## 5. Test Approach
- **Testing Type:** Manual Testing
- **Focus Areas:**
  - Functionality Testing
  - API Testing (Response Validation, Performance, and Error Handling)
  - Edge Case Testing
  - Logs Analysis for Failed API Responses
- **Tools Used:** Postman, Swagger, Kibana (for log monitoring)

---

## 6. Test Deliverables
- Test Scenarios
- Test Cases
- Bug Reports
- Test Summary Report

---

## 7. Test Scenarios
### 7.1 User Registration and OTP Verification
- Verify OTP is sent to the entered mobile number.
- Validate OTP expiry time and error messages for invalid OTP.

### 7.2 PAN Verification
- Verify if PAN linked to the mobile number is fetched successfully.
- Validate user details fetched from the PAN.
- Test edge cases: Invalid PAN, PAN not linked, missing fields.

### 7.3 Loan Details Submission
- Validate form inputs: Annual turnover, loan amount, business constitution, etc.
- Test for empty, invalid, and edge case inputs.

### 7.4 GoRules Eligibility Check
- Ensure the JSON rules are correctly matched with the user's details.
- Validate lender filtering based on JSON rules.
- Test edge cases: No eligible lenders, partially matching data.

### 7.5 Lender Display
- Verify that only eligible lenders are displayed.
- Ensure the correct lender details (loan amount, conditions) are shown.

### 7.6 API Performance and Logs
- Validate API response times are within acceptable limits.
- Check logs for failed responses and proper error handling.
- Test for retries and fallback mechanisms in case of API failures.

---

## 8. Entry and Exit Criteria
### Entry Criteria:
- Development of all modules is completed.
- APIs are integrated and stable.
- Test environment is set up and accessible.

### Exit Criteria:
- All high-priority test cases are executed.
- Critical bugs are fixed and verified.
- Test summary report is shared with stakeholders.

---

## 9. Risks and Assumptions
### Risks:
- Delays in API integration or GoRules updates.
- Dependencies on third-party services for PAN verification.

### Assumptions:
- Test environment simulates production-like conditions.
- APIs will have proper error messages and status codes.


