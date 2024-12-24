# **Reculta-Solutions**

## **Introduction**
Reculta is a Software-as-a-Service (SaaS) application designed to streamline and automate campus placement processes for educational institutions like IIM Ahmedabad and IIM Indore. By integrating various user roles and functionalities, the platform empowers campuses to efficiently manage placement activities, recruiters to interact seamlessly, and students to access placement opportunities effectively.

---

## **Key Features and Functionalities**

### **User Roles**
1. **SPOC / Admin**
   - Full access to the platform.
   - **User Management:**
     - Add recruiters and students individually using email IDs and names.
     - Bulk upload user data for recruiters and students using CSV or Excel files.
   - **Job Application Management:**
     - Add, view, and edit job postings, including:
       - Deadlines
       - Job descriptions
       - Eligibility criteria
   - View reports related to placement activities.
   
2. **Recruiter**
   - **Job Management:**
     - Add new job postings with descriptions, deadlines, and eligibility criteria.
   - **Candidate Shortlisting:**
     - View and manage applications submitted by students.
     - Communicate with shortlisted candidates.
     
3. **Student**
   - **Job Portal:**
     - View job postings relevant to their profile.
     - Apply for jobs where they meet the eligibility criteria.
   - **Profile Management:**
     - Create multiple CVs tailored for different job applications.
   - **Other Activities:**
     - Receive notifications about job deadlines, interviews, and updates.

---

## **Core Functionalities**
1. **User Management:**
   - Seamlessly add users individually or through bulk uploads.
   - Assign roles to users (SPOC, Recruiter, Student).

2. **Job Posting and Management:**
   - Dynamic job management system where recruiters and admins can add or update job information, deadlines, and eligibility.

3. **Application Workflow:**
   - Students can apply for jobs based on eligibility.
   - Recruiters can shortlist and communicate with candidates directly on the platform and release the offer letters.

4. **Custom CVs:**
   - Students can create multiple CVs to align with different job opportunities.

5. **Reporting and Analytics:**
   - Generate placement activity reports for admin use.
   - Analyze student application trends, recruiter engagement, and placement outcomes.

---

## **Technical Architecture**
### **Frontend:**
- Built using modern web technologies (e.g., React.js or Angular for dynamic user interfaces).
- Responsive design for cross-device compatibility (desktop, mobile, tablet).

### **Backend:**
- SaaS-based multi-tenant architecture.
- Microservices architecture with APIs facilitating seamless communication.

### **Database:**
- Relational Database (MySQL) for user and job data.
- Secure storage for CVs and other sensitive information.

### **Integration:**
- Bulk upload via CSV/Excel parsing.
- Notifications through email and SMS integrations.

---

## **Challenges and Solutions**
1. **Bulk Data Management:**
   - **Challenge:** Handling bulk uploads of user data.
   - **Solution:** Developed a validation mechanism to ensure data consistency before processing.

2. **Role-based Access:**
   - **Challenge:** Implementing granular permissions for different roles.
   - **Solution:** Role-based Access Control (RBAC) ensuring data security and functionality segregation.

3. **Custom CVs:**
   - **Challenge:** Supporting multiple CVs for a single user profile.
   - **Solution:** Designed a modular CV system allowing students to create, edit, and store multiple CVs.

4. **Data Synchronization:**
   - **Challenge:** Real-time data updates between different roles and modules.
   - **Solution:** Optimized backend processes with event-driven architecture.

---

## **Tools and Technologies**
1. **Testing Tools:**
   - Manual Testing
   - Selenium for automated test case execution.
   - Jenkins for Continuous Integration (CI) and Continuous Deployment (CD).
   
2. **Development Tools:**
   - Frontend: React.js, HTML, CSS, JavaScript
   - Backend: Node.js, Django
   - Database: MySQL
   
3. **Bug Tracking:**
   - JIRA for issue tracking and defect management.

---

## **Key Achievements**
- Enabled complete automation of placement workflows for prestigious institutions.
- Enhanced student and recruiter satisfaction through user-friendly functionalities.
- Streamlined admin tasks with bulk upload and dynamic reporting.

---

## **Future Enhancements**
- Develop mobile applications for better accessibility.
- Introduce advanced analytics dashboards for enhanced placement insights.

### Artifacts
- [Test Plan](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/Reculta-Solutions(SaaS-Application)/Test-Plan.md)
- [Test Cases](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/Reculta-Solutions(SaaS-Application)/Test-Cases.md)
- [Bug Reports](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/Reculta-Solutions(SaaS-Application)/Bug-Report.md)
- [Traceability Matrix](https://github.com/neha581/QA-Engineer-Portfolio/blob/main/Reculta-Solutions(SaaS-Application)/RTM.md)
