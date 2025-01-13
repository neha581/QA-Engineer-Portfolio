# Test Plan for PickMyWork

## 1. Objective
The objective of this test plan is to ensure the seamless functionality, usability, and performance of the **PickMyWork platform**, which consists of:
- An **Android App** for gig workers.
- An **Admin Website** for businesses and administrators.

This plan aims to validate critical workflows, identify defects, and ensure the platform meets business and user requirements.

---

## 2. Scope

### **In Scope**
1. **Android App**:
   - New user onboarding, including language selection, OTP login, and profile creation.
   - Job application workflows (view jobs, apply, and progress through tasks).
   - KYC verification process (uploading and validating ID proofs).
   - Wallet functionality (checking payment balance, transaction history).
   - Logout and user session handling.
   - Leadership board functionality.

2. **Admin Website**:
   - Adding and managing jobs (titles, descriptions, requirements).
   - Uploading and managing training videos.
   - Payout management and generation of payment reports.
   - Monitoring worker performance and task completion.

3. **APIs**:
   - Secure communication between the app, website, and backend.
   - Validation of data consistency across all systems.

### **Out of Scope**
- Load testing for large-scale data (to be handled in separate performance testing).

---

## 3. Testing Strategy

### **Test Types**
1. **Functional Testing**:
   - Verify end-to-end workflows for both the app and the admin website.
   - Test integrations between app, website, and backend.

2. **Regression Testing**:
   - Ensure existing features work seamlessly after new feature releases.

3. **Automation Testing**:
   - Automate Android app workflows like job application, KYC, and wallet balance validation using **Appium**.

4. **API Testing**:
   - Validate REST API responses, including data formats, status codes, and performance.

5. **Usability Testing**:
   - Ensure the app and website are intuitive and user-friendly.

6. **Compatibility Testing**:
   - Test the Android app on various devices, screen sizes, and OS versions.

7. **Database Testing**:
   - Validate backend data consistency for user profiles, payments, and jobs.

---

## 4. Testing Environment

### **Android App**:
- Devices: Samsung Galaxy S20, OnePlus 7, Pixel 4, Redmi Note 8.
- OS Versions: Android 10, 11.
- App Version: v1.1.3.

### **Admin Website**:
- Browsers: Chrome, Firefox, Safari.
- Resolutions: Desktop and mobile views.
- Website Version: v1.0.8.

### **Backend**:
- Database: MySQL for data validation.
- APIs: REST API endpoints for communication between app and backend.

---

## 5. Test Tools
- **Automation**: Appium with Java and TestNG.
- **Bug Tracking**: Jira for issue logging and tracking.
- **Database Validation**: SQL queries to verify data consistency.
- **API Testing**: Postman for validating endpoints.
- **Test Case Management**: Excel or Google Sheets for manual test cases.

---

## 6. Test Deliverables
1. **Test Artifacts**:
   - [Test Plan](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/PickMyWork/Test-Plan.md)
   - [Test Cases](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/PickMyWork/Test-Cases.md)
   - [Bug Reports](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/PickMyWork/Bug-Report.md)
   - [RTM (Requirement Traceability Matrix)](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/PickMyWork/RTM.md)
   - [Test Execution Report](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/PickMyWork/Test-Execution-Report.md)

2. **Defects**: Defect log updated in Jira.

---

## 7. Test Schedule

| **Phase**                 | **Timeline**      | **Deliverable**                       |
|---------------------------|-------------------|---------------------------------------|
| Test Planning             | Jan 10 - Jan 12  | Finalized Test Plan                  |
| Test Case Creation        | Jan 13 - Jan 16  | Test Case Document                   |
| Environment Setup         | Jan 17           | Configured Test Environments         |
| Test Execution (Manual)   | Jan 18 - Jan 22  | Test Results & Bug Reports           |
| Automation Testing        | Jan 23 - Jan 27  | Automated Test Scripts & Results     |
| Regression Testing        | Jan 28 - Jan 30  | Updated Regression Test Results      |

---

## 8. Risks and Mitigation

| **Risk**                                 | **Mitigation**                        |
|------------------------------------------|---------------------------------------|
| Limited test devices for Android app     | Use cloud-based device testing tools. |
| High defect count in new features        | Conduct regular smoke tests.          |
| Delays in backend API availability       | Use mock API responses for testing.   |

---

## 9. Entry and Exit Criteria

### **Entry Criteria**:
- Test environments are set up and stable.
- Test cases are reviewed and approved.
- App build and website are ready for testing.

### **Exit Criteria**:
- All planned test cases are executed.
- All critical and high-severity defects are resolved.
- Test execution report is shared with stakeholders.

---

## 10. Responsibilities

| **Role**          | **Responsibility**                                     |
|--------------------|-------------------------------------------------------|
| QA Engineer        | Test planning, execution, and reporting.              |
| Automation Engineer| Develop and execute automated scripts.                |
| Developer          | Fix reported defects and share updated builds.        |
| Project Manager    | Ensure timely delivery of testing milestones.         |

