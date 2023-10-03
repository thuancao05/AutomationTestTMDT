Feature: Login

  @ErrorEmail
  Scenario Outline: Error Email
    Given user navigate to Login page "http://localhost:5173/login"
    When user enter email "<email>" and password: "<password>"
    And click login button
    Then user should see an error email message "Bắt buộc nhập email đúng định dạng !"

    Examples:
      | email        | password |
      | abcgmail.com | 123    |

  @ErrorPassword
  Scenario Outline: Error Password
    Given user navigate to Login page "http://localhost:5173/login"
    When user enter email "<email>" and password: "<password>"
    And click login button
    Then user should see an error password message "Bắt buộc nhập mật khẩu !"

    Examples:
      | email        | password |
      | abcgmail.com |          |

  @UserDoesNotExist
  Scenario Outline: User Does Not Exist
    Given user navigate to Login page "http://localhost:5173/login"
    When user enter email "<email>" and password: "<password>"
    And click login button
    Then user should see an error login message "Sai tên đăng nhập hoặc mật khẩu !"

    Examples:
      | email                   | password |
      |  helloword@gmail.com    |    123   |

  @SuccessfulLogin
  Scenario Outline: Successful Login
    Given user navigate to Login page "http://localhost:5173/login"
    When user enter email "<email>" and password: "<password>"
    And click login button
    Then user redirect to index page "http://localhost:5173/index/products"
    And user click logout button
    Examples:
      | email             | password |
      | thang@gmail.com   | thang123 |