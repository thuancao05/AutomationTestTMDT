Feature: Order

  Background: Login And Order
    Given user navigate to Login page "http://localhost:5173/login"
    When user login with email "thang@gmail.com" and password: "thang123"
    And select product "điện trở" to order
    Then user redirect to payment page "http://localhost:5173/cart/payment"

  @EmptyName
  Scenario: Empty Name
    Given user stay at payment page
    When user input name is ""
    And click submit button
    Then user should see an error name message bellow textbox name "Bắt buộc điền họ và tên tối đa 255 ký tự"


  @NameOver255Chars
  Scenario: Error Name Over 255 Chars
    Given user stay at payment page
    When user input name is "THIS STRING IS 256 CHARACTERS xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
    And click submit button
    Then user should see an error name message bellow textbox name "Bắt buộc điền họ và tên tối đa 255 ký tự"
#
#  @EmptyPhone
#  Scenario Outline: Error Phone
#    Given user navigate to register page "http://localhost:5173/register"
#    When user enter name: "<name>", phone: "<phone>" email "<email>" and password: "<password>"
#    And click register button
#    Then user should see an error phone message "Bắt buộc điền số điện thoại đúng định dạng"
#
#    Examples:
#      | name             | phone      | email             | password |
#      | Huỳnh Văn Bá     |            | vanba@gmail.com   | 123      |
#
#  @ErrorFormatPhone
#  Scenario Outline: Error Phone
#    Given user navigate to register page "http://localhost:5173/register"
#    When user enter name: "<name>", phone: "<phone>" email "<email>" and password: "<password>"
#    And click register button
#    Then user should see an error phone message "Bắt buộc điền số điện thoại đúng định dạng"
#
#    Examples:
#      | name             | phone      | email             | password |
#      | Huỳnh Văn Bá     |            | vanba@gmail.com   | 123      |
#
#  @EmptyEmail
#  Scenario Outline: Error Email
#    Given user navigate to register page "http://localhost:5173/register"
#    When user enter name: "<name>", phone: "<phone>" email "<email>" and password: "<password>"
#    And click register button
#    Then user should see an error email message "Bắt buộc điền email đúng định dạng"
#
#    Examples:
#      | name             | phone      | email             | password |
#      | Huỳnh Văn Bá     | 0562147852 |                   | 123      |
#
#  @ErrorFormatEmail
#  Scenario Outline: Error Email
#    Given user navigate to register page "http://localhost:5173/register"
#    When user enter name: "<name>", phone: "<phone>" email "<email>" and password: "<password>"
#    And click register button
#    Then user should see an error email message "Bắt buộc điền email đúng định dạng"
#
#    Examples:
#      | name             | phone      | email             | password |
#      | Huỳnh Văn Bá     | 0562147852 |                   | 123      |
#
#  @EmptyAddress
#  Scenario Outline: Error Password
#    Given user navigate to register page "http://localhost:5173/register"
#    When user enter name: "<name>", phone: "<phone>" email "<email>" and password: "<password>"
#    And click register button
#    Then user should see an error password message "Bắt buộc điền mật khẩu tối đa 255 ký tự"
#
#    Examples:
#      | name             | phone      | email             | password |
#      | Huỳnh Văn Bá     | 0562147852 | vanba@gmail.com   |          |
#
#
#  @SuccessfulRegister
#  Scenario Outline: Successful Register
#    Given user navigate to register page "http://localhost:5173/register"
#    When user enter name: "<name>", phone: "<phone>" email "<email>" and password: "<password>"
#    And click register button
#    Then user should see an success message "Đăng ký thành công !"
#    Examples:
#      | name             | phone      | email             | password |
#      | Huỳnh Văn Bá     | 0562147852 | vanba@gmail.com   | 123      |