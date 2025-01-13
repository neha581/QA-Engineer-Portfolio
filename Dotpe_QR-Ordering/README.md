# Digital Ordering Platform - Dotpe

### Overview
Dotpe QR-Ordering empowers small merchants, particularly in the Food & Beverage (FnB) sector, to digitize their operations. The platform offers two primary modules:  
1. **QR Code Ordering**: Allows customers to scan a QR code at restaurants, browse the menu, place orders with customizations, and make payments.  
2. **Merchant Panel**: Enables merchants to manage their business operations, including menu setup, store management, delivery settings, user roles, and sales reports.

---

### Technical Contribution

#### **QR Code Ordering Module (Manual Testing)**  
- Performed **end-to-end functional testing** of QR code workflows:  
  - Scanning QR codes to access restaurant menus.  
  - Browsing menus, adding items to the cart, and applying customizations/instructions.  
  - Testing payment workflows for multiple methods such as UPI, Paytm, LazyPay, and PhonePe.  
  - Validating service subtypes like **delivery**, **fine dine**, **takeaway**, and **preordering** (e.g., placing cake orders for midnight delivery).  
- Executed **load testing** for QR code ordering using **JMeter** to evaluate performance under peak usage.  
- Verified **edge cases** such as invalid QR codes, unsupported payment methods, and customizations exceeding character limits.  
- Performed **API testing** using **Postman** to validate backend communication for QR code functionalities (e.g., menu retrieval, payment status updates).

#### **Merchant Panel Module (Manual & Automation Testing)**  
- Performed **automation testing** for critical workflows in the merchant panel using **Selenium WebDriver** and **Java**, focusing on:  
  - Store and menu management: Adding, updating, and deleting menu items.  
  - Configuring service subtypes like dine-in timings (e.g., Tuesday to Sunday, 11 AM–11 PM) and preordering settings.  
  - Generating sales reports for daily, weekly, monthly, and yearly periods.  
  - Managing user roles (e.g., waiter and kitchen users).  
- Conducted **manual testing** to verify UI/UX elements, form validations, and responsiveness of the merchant panel across devices.  
- Validated **API endpoints** using **Postman** for menu updates, user role assignments, and report generation.  
- Performed **regression testing** for each feature rollout to ensure platform stability.  

---

### Key Tools & Technologies
- **Automation Framework**: Selenium WebDriver with **Java**.  
- **Load Testing**: Apache JMeter for QR Code workflows.  
- **API Testing**: Postman.  
- **Bug Tracking**: Jira for defect management.  
- **Database Validation**: SQL to verify backend consistency for menu updates, payments, and user roles.  

---

### Challenges Addressed
- Ensured seamless functionality of the QR Code ordering system across various service subtypes and payment methods.  
- Automated repetitive tasks, such as store and menu updates in the merchant panel, reducing manual testing efforts.  
- Validated performance under high traffic loads for QR code workflows using JMeter.  
- Ensured compatibility of the merchant panel with multiple browsers and devices.  
- Identified and resolved API-related bugs impacting payment workflows and menu updates.  

---

### Artifacts
- [Test Plan](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/Dotpe_QR-Ordering/Test-Plan.md)  
- [Test Cases](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/Dotpe_QR-Ordering/Test-Cases.md)  
- [Bug Reports](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/Dotpe_QR-Ordering/Bug-Reports.md)  
- [RTM (Requirement Traceability Matrix)](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/Dotpe_QR-Ordering/RTM.md)  
- [Test Execution Report](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/Dotpe_QR-Ordering/Test-Execution-Report.md)  

---

### Additional Highlights
- Collaborated closely with the development team to resolve payment-related and menu customization issues.  
- Gained expertise in combining manual and automation testing to ensure comprehensive test coverage.  
- Successfully implemented performance and API testing strategies to maintain high-quality standards.

---

