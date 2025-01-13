# Test Plan: Dotpe Merchant Panel

## Project Overview
The **Dotpe Merchant Panel** enables merchants to efficiently manage their business operations. Key features include:
- Managing stores and catalogs (menu items, timings, and delivery radius).
- Generating reports for transactions, sales, and customer performance.
- Managing user roles (e.g., store managers, kitchen staff, and waiters).
- Monitoring and updating operational data like settlements, transactions, and delivery performance.

## Objective
To ensure the functionality, performance, and security of the **Merchant Panel**, testing will focus on manual and automation testing with robust test coverage for critical workflows.

---

## Testing Scope

### Manual Testing
- Functional testing of workflows such as:
  - Login/Logout functionality.
  - Store creation, menu management, and catalog updates.
  - Reports generation (daily, weekly, monthly).
  - User role management and permissions.
  - Payments and settlements tracking.
  - Integration of delivery performance and customer feedback.
- Validation of UI elements for responsiveness and usability.
- API testing using **Postman** to verify backend communication.

### Automation Testing
- Automation of repetitive and critical workflows:
  - Login/Logout functionality.
  - Adding/updating menu items.
  - Generating reports.
  - User role assignment.
- Framework: Hybrid framework with **Page Object Model** (POM).
- Reports: Detailed **TestNG** reports with Jenkins integration.
- Logs Validation: Using **Kibana** to analyze logs and monitor errors.

---

## Key Tools & Technologies
- **Automation Framework**: Selenium WebDriver with **Java**.
- **Reporting**: TestNG Reports and Jenkins for CI/CD execution.
- **API Testing**: Postman.
- **Bug Tracking**: Jira for defect management.
- **Log Monitoring**: Kibana for checking logs during testing.
- **Database Validation**: SQL for backend validation of menu updates, user roles, and transactions.

---

## Test Environment
- **URL**: [Dotpe Merchant Panel](https://merchant.stage3.dotnu.co/login)  
- **Browser Compatibility**:  
  - Chrome (v131), Firefox (v134), Safari (v17.4.1).  
- **Devices**: Desktop, Mobile and Tablet.  
- **OS**: Windows 11, macOS (15 Sequoia).  

---

## Test Scenarios

### Functional Scenarios
1. **Login/Logout**  
   - Validate login functionality with valid/invalid credentials.  
   - Validate session timeout and auto-logout.

2. **Store Management**  
   - Add, update, and delete stores.  
   - Configure store timings, delivery radius, and service availability.  

3. **Menu Management**  
   - Add, update, and delete menu items.  
   - Validate support for customizations, offers, and special instructions.  

4. **Reports**  
   - Generate daily, weekly, and monthly reports for sales and transactions.  
   - Validate export functionality for reports.  

5. **User Role Management**  
   - Add and manage users (store manager, waiter, kitchen staff).  
   - Validate permission levels for different roles.  

6. **Payments and Settlements**  
   - Verify settlements based on transactions.  
   - Validate payment reconciliation reports.  

### Performance Scenarios
- Load testing for concurrent merchant access to the dashboard.
- Verify page load times for critical workflows like menu management and reports.

### Security Scenarios
- Validate password policies and account locking after multiple failed login attempts.
- Verify session security for cross-browser access.

---

## Automation Testing Workflow
1. **Framework**: Hybrid framework with:
   - **Page Object Model (POM)** for reusability.
   - TestNG for test execution and reporting.
   - Jenkins for scheduled test suite execution on stage and production environments.

2. **Scope**:  
   - Login/Logout.  
   - Store and menu management.  
   - Report generation.  

3. **Log Monitoring**: Analyze logs using **Kibana** for identifying backend or deployment issues.  

4. **Execution**:  
   - Pre-deployment on the staging environment.  
   - Post-deployment on the production environment.  

---

## Deliverables
- **Test Plan Document**: Comprehensive test strategy and scope.  
- **Test Cases**: Functional, regression, and edge cases.  
- **Automation Scripts**: Java-based Selenium scripts for critical workflows.  
- **Test Reports**: TestNG and Jenkins execution reports.  
- **Bug Reports**: Documented in Confluence with detailed steps and screenshots/logs.  

---

## Risks and Mitigation
| **Risk**                                | **Mitigation**                                          |
|-----------------------------------------|--------------------------------------------------------|
| High traffic causing dashboard slowness | Conduct load testing and optimize queries.            |
| Unhandled API responses                 | Validate all API endpoints using Postman.             |
| New feature rollouts causing regression | Perform extensive regression testing before deployment.|

---

## Additional Notes
- The panel supports merchants with diverse business requirements. Testing will ensure flexibility in workflows for different scenarios like dine-in, delivery, and takeaway.
- Logs monitoring using Kibana will help in quick resolution of backend issues.  

