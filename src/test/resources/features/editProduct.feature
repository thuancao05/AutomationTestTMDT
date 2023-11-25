Feature: Admin Edit Product

  Background: Login With Admin Account
    Given user navigate to Login page "http://localhost:5173/login"
    When user enter email "thuan@gmail.com" and password: "thuan123"
    And click login button
    Then user should see admin product page

  @ChangeProductName
  Scenario: Change Product Name
    Given user click edit product button with product name is "Tụ gốm 104"
    When user input product name is "Tụ dán SMD"
    And submit click add new product button
    Then user should see an success update message "Cập nhật thành công !"

  @ChangeProductDescribe
  Scenario: Change Product Describe
    Given user click edit product button with product name is "Tụ dán SMD"
    When user input product describe is "Cập nhật mô tả sản phẩm"
    And submit click add new product button
    Then user should see an success update message "Cập nhật thành công !"

  @ChangeProductPrice
  Scenario: Change Product Price
    Given user click edit product button with product name is "Tụ dán SMD"
    When user input product price is "99999"
    And submit click add new product button
    Then user should see an success update message "Cập nhật thành công !"

  @ChangeProductCategory
  Scenario: Change Product Category
    Given user click edit product button with product name is "Tụ dán SMD"
    When user input product category is "Điện trở"
    And submit click add new product button
    Then user should see an success update message "Cập nhật thành công !"

  @ChangeProductQuantity
  Scenario: Change Product Quantity
    Given user click edit product button with product name is "Tụ dán SMD"
    When user input product quantity is "230"
    And submit click add new product button
    Then user should see an success update message "Cập nhật thành công !"

  @ChangeProductDateOfManufacture
  Scenario: Change Product Date Of Manufacture
    Given user click edit product button with product name is "Tụ dán SMD"
    When user input product date of manufacture is "2023/10/04"
    And submit click add new product button
    Then user should see an success update message "Cập nhật thành công !"

  @ChangeProductImage
  Scenario: Change Product Image
    Given user click edit product button with product name is "Tụ dán SMD"
    When user change product image with path "F:\LuanVan\tusmd.jpg"
    And submit click add new product button
    Then user should see an success update message "Cập nhật thành công !"