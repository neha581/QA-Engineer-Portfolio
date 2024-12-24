# Test Cases for Urban Ladder Storefront Testing

## 1. Functional Test Cases

| Test Case ID | Test Scenario                                | Test Steps                                                                 | Expected Result                                         |
|--------------|----------------------------------------------|----------------------------------------------------------------------------|---------------------------------------------------------|
| TC_FT_01     | Add a single product                        | 1. Log in to the inventory portal. <br> 2. Navigate to "Add Product". <br> 3. Enter valid product details and save. | Product is successfully added and visible on the storefront. |
| TC_FT_02     | Edit product details                        | 1. Log in to the inventory portal. <br> 2. Select an existing product. <br> 3. Update product details and save. | Updated details are visible on the storefront.         |
| TC_FT_03     | Delete a product                            | 1. Log in to the inventory portal. <br> 2. Select a product to delete. <br> 3. Confirm deletion. | Product is no longer displayed on the storefront.      |
| TC_FT_04     | Bulk upload products                        | 1. Log in to the inventory portal. <br> 2. Upload a valid bulk product file. <br> 3. Verify upload status. | All products are added successfully and visible.        |
| TC_FT_05     | Invalid SKU error handling                  | 1. Log in to the inventory portal. <br> 2. Enter a product with an invalid SKU. <br> 3. Save product. | Error message displayed: "Invalid SKU format."         |

---

## 2. API Test Cases

| Test Case ID | Test Scenario                                | API Endpoint                           | Request Type | Test Steps                                                                 | Expected Result                                         |
|--------------|----------------------------------------------|----------------------------------------|-------------|----------------------------------------------------------------------------|---------------------------------------------------------|
| TC_API_01    | Add a single product                        | `/api/products`                        | POST        | 1. Send a POST request with valid product data.                           | Response 201 Created. Product is visible on the frontend. |
| TC_API_02    | Update product details                      | `/api/products/{id}`                   | PUT         | 1. Send a PUT request with updated data for an existing product ID.       | Response 200 OK. Updates reflected on the storefront.   |
| TC_API_03    | Delete a product                            | `/api/products/{id}`                   | DELETE      | 1. Send a DELETE request for an existing product ID.                      | Response 200 OK. Product is no longer available.        |
| TC_API_04    | Bulk product upload                        | `/api/products/bulk-upload`            | POST        | 1. Send a POST request with a bulk upload file.                           | Response 200 OK. All products added successfully.       |
| TC_API_05    | Handle invalid product data                | `/api/products`                        | POST        | 1. Send a POST request with invalid product data.                         | Response 400 Bad Request. Error message returned.       |

---

## 3. Cross-Browser Test Cases

| Test Case ID | Test Scenario                                | Test Steps                                                                 | Expected Result                                         |
|--------------|----------------------------------------------|----------------------------------------------------------------------------|---------------------------------------------------------|
| TC_CB_01     | Add a product on Chrome                     | 1. Log in to the portal on Chrome. <br> 2. Add a new product and save.     | Product is successfully added and visible on storefront.|
| TC_CB_02     | Add a product on Firefox                    | 1. Log in to the portal on Firefox. <br> 2. Add a new product and save.    | Product is successfully added and visible on storefront.|
| TC_CB_03     | Add a product on Safari                     | 1. Log in to the portal on Safari. <br> 2. Add a new product and save.     | Product is successfully added and visible on storefront.|

---

## 4. Database Validation Test Cases

| Test Case ID | Test Scenario                                | Test Steps                                                                 | Expected Result                                         |
|--------------|----------------------------------------------|----------------------------------------------------------------------------|---------------------------------------------------------|
| TC_DB_01     | Verify product details in the database       | 1. Add a product through the portal. <br> 2. Query the database table for the product ID. | Product details match between database and portal.      |
| TC_DB_02     | Verify bulk upload records in the database   | 1. Perform a bulk upload. <br> 2. Query the database for all uploaded product records. | All records are consistent with the uploaded file.      |

---

## 5. Performance Test Cases

| Test Case ID | Test Scenario                                | Test Steps                                                                 | Expected Result                                         |
|--------------|----------------------------------------------|----------------------------------------------------------------------------|---------------------------------------------------------|
| TC_PT_01     | Bulk upload under heavy load                | 1. Simulate concurrent users uploading bulk files. <br> 2. Monitor upload completion time. | Bulk upload completes within acceptable time limits.    |
| TC_PT_02     | High traffic synchronization                | 1. Simulate high traffic accessing the storefront. <br> 2. Update product details during load. | Updates are synchronized without delays or errors.      |

---

## 6. Edge Case Test Cases

| Test Case ID | Test Scenario                                | Test Steps                                                                 | Expected Result                                         |
|--------------|----------------------------------------------|----------------------------------------------------------------------------|---------------------------------------------------------|
| TC_EC_01     | Add product with missing required fields     | 1. Attempt to add a product without entering all required fields.          | Error message displayed: "All fields are mandatory."   |
| TC_EC_02     | Session timeout during a product operation   | 1. Start adding a product. <br> 2. Let the session timeout.                | User is logged out. Unsaved changes are not stored.     |



