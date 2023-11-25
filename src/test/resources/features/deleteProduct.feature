Feature: Admin DeleteProduct

  Background: Login With Admin Account
    Given user navigate to Login page "http://localhost:5173/login"
    When user enter email "thuan@gmail.com" and password: "thuan123"
    And click login button
    Then user should see admin product page

  @DeleteProduct
  Scenario: Delete Product
    Given user stay at products page
    When user click delete product button with product name is "Tụ dán SMD"
    And user press Accept Alert to confirm deletion
    Then user should see an success delete message "Xóa thành công !"
