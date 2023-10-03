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

  @EmptyPhone
  Scenario: Empty Phone
    Given user stay at payment page
    When user input phone is ""
    And click submit button
    Then user should see an error phone message bellow textbox phone "Bắt buộc điền số điện thoại đúng định dạng"


  @ErrorFormatPhone
  Scenario: Error Format Phone
    Given user stay at payment page
    When user input phone is "0abc4561478"
    And click submit button
    Then user should see an error phone message bellow textbox phone "Bắt buộc điền số điện thoại đúng định dạng"


  @EmptyEmail
  Scenario: Empty Email
    Given user stay at payment page
    When user input email is ""
    And click submit button
    Then user should see an error email message bellow textbox email "Bắt buộc điền email đúng định dạng"

  @ErrorFormatEmail
  Scenario: Error Format Email
    Given user stay at payment page
    When user input email is ""
    And click submit button
    Then user should see an error email message bellow textbox email "Bắt buộc điền email đúng định dạng"

  @EmptyAddress
  Scenario: Empty Address
    Given user stay at payment page
    When user input address is ""
    And click submit button
    Then user should see an error address message bellow textbox address "Bắt buộc chọn địa chỉ"

  @SuccessfulOrder
  Scenario Outline: Successful Order
    Given user stay at payment page
    When user input address is "<address>", "<city>", "<district>", "<ward>", "<note>"
    And click submit button
    Then user should see an order success message "Đặt hàng thành công"
    Examples:
      | address       | city              | district         | ward               | note               |
      | Số nhà 32     | Thành phố Cần Thơ | Quận Ninh Kiều   | Phường An Hòa      | Cho kiểm tra hàng  |