Feature: Admin Add New Product

  Background: Login With Admin Account
    Given user navigate to Login page "http://localhost:5173/login"
    When user enter email "thuan@gmail.com" and password: "thuan123"
    And click login button
    Then user should see admin product page

#  @EmptyProductName
#  Scenario: Empty Product Name
#    Given user click add new product button
#    When user input product name is ""
#    And submit click add new product button
#    Then user should see an error name message bellow textbox product name "Bắt buộc điền tên sản phẩm có độ dài tối đa 255 ký tự"
#
#
#  @ProductNameOver255Characters
#  Scenario: Add New Product
#    Given user click add new product button
#    When user input product name is "THIS STRING IS 256 CHARACTERS xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
#    And submit click add new product button
#    Then user should see an error name message bellow textbox product name "Bắt buộc điền tên sản phẩm có độ dài tối đa 255 ký tự"

  @EmptyProductPrice
  Scenario: Empty Product Price
    Given user click add new product button
    When user input product price is ""
    And submit click add new product button
    Then user should see an error name message bellow textbox product price "Bắt buộc nhập giá"

#  @SuccessfulAddNewProduct
#  Scenario Outline: Add New Product
#    Given user click add new product button
#    When user input product information "<name>", "<describe>", "<price>", "<category>", "<quantity>" , "<date of manufacture>"
#    And submit click add new product button
#    Then the list product page display new product on top list products with name is "<name>"
#    Examples:
#      | name             | describe                       | price    | category | quantity | date of manufacture |
#      | Tụ gốm 104       | sản phẩm mới nhất của cửa hàng | 150000   | Tụ điện  | 150      | 2023/10/10          |


