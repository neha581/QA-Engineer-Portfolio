# Test Cases for Payment Gateway  

## **1. Test Case: Payment with Valid Credit Card**  
| **Test Case ID**       | TC001                                |
|------------------------|--------------------------------------|
| **Description**         | Verify payment success with a valid credit card. |
| **Preconditions**       | User has a valid credit card with sufficient balance. |
| **Steps**               | 1. Select "Credit Card" as the payment method. <br> 2. Enter valid card details (card number, expiry date, CVV). <br> 3. Click on the "Pay Now" button. |
| **Expected Result**     | Payment is successful, and a confirmation message with the transaction ID is displayed. |
| **Actual Result**       | Payment successful. Confirmation message displayed: "Transaction ID: TXN12345. Thank you for your payment." |
| **Status**              | Pass |

---

## **2. Test Case: Payment Failure with Expired Credit Card**  
| **Test Case ID**       | TC002                                |
|------------------------|--------------------------------------|
| **Description**         | Verify payment fails when an expired credit card is used. |
| **Preconditions**       | User has an expired credit card. |
| **Steps**               | 1. Select "Credit Card" as the payment method. <br> 2. Enter expired card details. <br> 3. Click on the "Pay Now" button. |
| **Expected Result**     | Error message is displayed: "Card expired. Please use a valid card." |
| **Actual Result**       | Payment failed, but incorrect error message displayed: "Payment declined. Contact your bank." |
| **Status**              | Fail |
| **Defect ID**           | BUG-001: Incorrect error message displayed for expired cards. |

---

## **3. Test Case: Payment Failure with Invalid CVV**  
| **Test Case ID**       | TC003                                |
|------------------------|--------------------------------------|
| **Description**         | Verify payment fails when an invalid CVV is entered. |
| **Preconditions**       | User has a valid credit card but enters an invalid CVV. |
| **Steps**               | 1. Select "Credit Card" as the payment method. <br> 2. Enter card number and expiry date. <br> 3. Enter an invalid CVV. <br> 4. Click on the "Pay Now" button. |
| **Expected Result**     | Payment is declined with an error: "Invalid CVV. Please check your details." |
| **Actual Result**       | Payment failed. Error message displayed: "Incorrect CVV. Please try again." |
| **Status**              | Pass |

---

## **4. Test Case: Payment via UPI with Valid UPI ID**  
| **Test Case ID**       | TC004                                |
|------------------------|--------------------------------------|
| **Description**         | Verify successful payment using a valid UPI ID. |
| **Preconditions**       | User has a valid UPI ID linked to a bank account. |
| **Steps**               | 1. Select "UPI" as the payment method. <br> 2. Enter a valid UPI ID. <br> 3. Submit the payment request. <br> 4. Approve payment from the UPI app. |
| **Expected Result**     | Payment is successful, and a confirmation message with the transaction ID is displayed. |
| **Actual Result**       | Payment successful. Confirmation message displayed: "Transaction ID: TXN12345. Thank you for your payment." |
| **Status**              | Pass |

---

## **5. Test Case: Payment Failure with Invalid UPI ID**  
| **Test Case ID**       | TC005                                |
|------------------------|--------------------------------------|
| **Description**         | Verify payment fails when an invalid UPI ID is entered. |
| **Preconditions**       | User enters an invalid or unregistered UPI ID. |
| **Steps**               | 1. Select "UPI" as the payment method. <br> 2. Enter an invalid UPI ID. <br> 3. Submit the payment request. |
| **Expected Result**     | Payment fails with an error: "Invalid UPI ID. Please check and try again." |
| **Actual Result**       | A blank page is displayed after clicking "Pay Now." API response returns 400 Bad Request: {"status": "failure", "error": "Invalid UPI ID"}. |
| **Status**              | Fail |
| **Defect ID**           | BUG-002: Blank page displayed after invalid UPI ID input; API returns 400 Bad Request instead of appropriate error handling. |

---

## **6. Test Case: Network Failure During Payment Processing**  
| **Test Case ID**       | TC006                                |
|------------------------|--------------------------------------|
| **Description**         | Verify the behavior when there is a network failure during payment processing. |
| **Preconditions**       | User starts a payment process but the network connection drops. |
| **Steps**               | 1. Start a payment process using any method (Credit Card, UPI). <br> 2. Simulate network failure during the transaction. <br> 3. Observe system behavior. |
| **Expected Result**     | Payment fails gracefully with a message: "Network error. Please try again." |
| **Actual Result**       | The transaction hangs indefinitely with no error message displayed. Payment status remains unclear. |
| **Status**              | Fail |
| **Defect ID**           | BUG-003: Transaction hangs indefinitely during network failure; no error message displayed. |

---

## **7. Test Case: Refund Initiation after Successful Payment**  
| **Test Case ID**       | TC007                                |
|------------------------|--------------------------------------|
| **Description**         | Verify that a refund can be successfully initiated after a completed payment. |
| **Preconditions**       | A successful transaction has been completed. |
| **Steps**               | 1. Locate the successful payment transaction. <br> 2. Initiate a refund request from the payment gateway. <br> 3. Confirm the refund initiation status. |
| **Expected Result**     | Refund request is successfully initiated, and a refund confirmation message is displayed. |
| **Actual Result**       | The refund request was successfully initiated, and a confirmation message stating "Refund Initiated Successfully" was displayed. |
| **Status**              | Pass |

---

## **8. Test Case: Payment Cancellation by User**  
| **Test Case ID**       | TC008                                |
|------------------------|--------------------------------------|
| **Description**         | Verify that the user can cancel a payment before completing the transaction. |
| **Preconditions**       | Payment process has started but not yet submitted. |
| **Steps**               | 1. Start a payment process using any method. <br> 2. Click "Cancel" or "Back" before completing payment. |
| **Expected Result**     | Payment is canceled, and the user is redirected back to the payment options page. |
| **Actual Result**       | The payment was not canceled, and the system failed to redirect the user back to the payment options page. An error message was displayed: "Unable to cancel the payment." |
| **Status**              | Fail |
| **Defect ID**           | BUG-004: Payment Cancellation Failure during Transaction Process |

---

**Note:** These test cases include hypothetical results to simulate execution outcomes for demonstration purposes.
