Feature: Admin Add New Product

  Background: Login With Admin Account
    Given user navigate to Login page "http://localhost:5173/login"
    When user enter email "thuan@gmail.com" and password: "thuan123"
    And click login button
    Then user should see admin product page

  Scenario Outline: Add New Product
    Given user click add new product button
    When user input product information "<name>", "<describe>", "<price>", "<category>", "<quantity>" , "<date of manufacture>"
    And submit click add new product button
    Then the cart page displayed product added with "<quantity>"
    Examples:
      | name             | describe                       | price    | category | quantity | date of manufacture |
      | Tụ gốm 104       | sản phẩm mới nhất của cửa hàng | 150000   | Tụ điện  | 150      | 2023/10/10          |


