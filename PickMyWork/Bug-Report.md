# Bug Report

| **Bug ID**        | BUG_PMW_001                                  |
|--------------------|----------------------------------------------|
| **Module**         | Login                                       |
| **Test Case ID**   | TC_PMW_08                                   |
| **Reported By**    | Neha Sharma                                 |
| **Date**           | 2020-01-07                                  |
| **Environment**    |                                             |
| - Device           | Android Phone (Samsung Galaxy S21)          |
| - OS Version       | Android 10                                  |
| - App Version      | v2.1.3                                      |
| - Network          | WiFi                                        |

---

## **Bug Description**
**Issue**: User is unable to login when entering an expired OTP. Instead of showing a proper error message, the app crashes after submission.

---

## **Steps to Reproduce**
1. Launch the app.
2. Enter a valid mobile number and request OTP.
3. Wait for the OTP to expire (simulate with an expired OTP).
4. Enter the expired OTP and tap the "Login" button.

---

## **Actual Result**
- The app crashes after submitting the expired OTP.

---

## **Expected Result**
- The app should display an appropriate error message: **"OTP has expired. Please request a new OTP."**

---

## **Attachments**
1. Logs from the app crash (see attached `crash_logs.txt`).
2. [Video recording of issue](#).

---

## **Severity**
- **High**: The issue prevents the user from logging into the app, affecting core functionality.

---

## **Priority**
- **Critical**: Must be fixed before the next release.

---

## **Additional Notes**
- The issue may be caused by missing validation for expired OTPs.
- Logs indicate a `NullPointerException` in the login controller.
- Recommended to include a check for expired OTPs before submission.

---

# Additional Bug Report Examples for Other Failed Test Cases

---

| **Bug ID**        | BUG_PMW_002                                  |
|--------------------|----------------------------------------------|
| **Module**         | Job Application                             |
| **Test Case ID**   | TC_PMW_14                                   |
| **Reported By**    | [Your Name]                                 |
| **Date**           | 2025-01-07                                  |
| **Environment**    |                                             |
| - Device           | Android Phone (Pixel 6)                     |
| - OS Version       | Android 13                                  |
| - App Version      | v2.1.3                                      |
| - Network          | Mobile Data (4G)                            |

---

## **Bug Description**
**Issue**: The user is able to apply for the same job multiple times. No validation is preventing duplicate job applications.

---

## **Steps to Reproduce**
1. Login to the app.
2. Navigate to the "Available Jobs" section.
3. Apply for a job.
4. Reopen the same job and click "Apply" again.

---

## **Actual Result**
- The app allows duplicate job applications, causing inconsistencies in the backend.

---

## **Expected Result**
- The app should display a proper message: **"You have already applied for this job."** and prevent the duplicate application.

---

## **Attachments**
1. Screenshot of duplicate application.
2. [API response logs](#).

---

## **Severity**
- **Medium**: Impacts data integrity but does not block core functionality.

---

## **Priority**
- **High**: Should be resolved in the upcoming sprint.


