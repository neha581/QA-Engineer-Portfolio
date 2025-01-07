## Workforce Aggregation Platform - PickMyWork

### Overview
PickMyWork is a workforce aggregation platform that connects gig workers with businesses needing sales, onboarding, and operational support. The platform empowers businesses to scale efficiently by leveraging a skilled and distributed gig workforce.  

The platform includes:  
- **Android App**: Where users can apply for jobs, complete assigned tasks, perform KYC, and check their payment status via the wallet.  
- **Website**: Designed for administrators to add jobs, upload training videos, manage worker payouts, and monitor platform operations.

### Technical Contribution
- **Testing Scope**:
  - Functional testing of both the Android app and the admin website workflows.
  - Regression testing for new feature rollouts on mobile and web platforms.
  - Automation testing for the Android app using **Appium**, focusing on critical workflows like job application, KYC verification, and payment validation.
  - API testing to validate communication between the app, website, and backend services.

- **Key Tools & Technologies**:
  - **Automation Framework**: Appium with **Java** as the programming language and **TestNG** for test management.
  - **Bug Tracking**: Jira
  - **Database Validation**: SQL for verifying user data, payment transactions, and admin configurations.
  - **Testing Approach**: A mix of manual and automated testing with a focus on end-to-end workflows, usability, and performance.

- **Challenges Addressed**:
  - Ensuring the seamless functionality of the Android app across multiple devices and OS versions.
  - Automating repetitive tasks, such as KYC verification and wallet balance updates, to reduce manual testing efforts.
  - Validating admin operations like job postings and payout processing for accuracy and efficiency.
  - Conducting API tests to ensure secure and reliable communication between the Android app and website.

### Artifacts
- [Test Plan](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/PickMyWork/Test-Plan.md)
- [Test Cases](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/PickMyWork/Test-Cases.md)
- [Bug Reports](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/PickMyWork/Bug-Report.md)
- [RTM (Requirement Traceability Matrix)](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/PickMyWork/RTM.md)
- [Test Execution Report](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/PickMyWork/Test-Execution-Report.md)
