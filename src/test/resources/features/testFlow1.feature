Feature: Test Flow 1

  Background: Login And Order
    Given user navigate to Login page "http://localhost:5173/login"
    When user login with email "thang@gmail.com" and password: "thang123"
    And select product "điện trở" to order
    Then user redirect to payment page "http://localhost:5173/cart/payment"


  @SuccessfulTestFlow1
  Scenario Outline: Successful Test Flow 1
    Given user stay at payment page
    When user input address is "<address>", "<city>", "<district>", "<ward>", "<note>"
    And click submit button
    Then user should see an order success message "Đặt hàng thành công"
    Examples:
      | address       | city              | district         | ward               | note               |
      | Số nhà 32     | Thành phố Cần Thơ | Quận Ninh Kiều   | Phường An Hòa      | Cho kiểm tra hàng  |