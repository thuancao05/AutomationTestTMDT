Feature: Register

  @ErrorName
  Scenario Outline: Error Name
    Given user navigate to register page "http://localhost:5173/register"
    When user enter name: "<name>", phone: "<phone>" email "<email>" and password: "<password>"
    And click register button
    Then user should see an error name message "Bắt buộc điền họ và tên tối đa 255 ký tự"

    Examples:
      | name             | phone      | email             | password |
      |                  | 0562147852 | vanba@gmail.com   | 123      |

  @ErrorPhone
  Scenario Outline: Error Phone
    Given user navigate to register page "http://localhost:5173/register"
    When user enter name: "<name>", phone: "<phone>" email "<email>" and password: "<password>"
    And click register button
    Then user should see an error phone message "Bắt buộc điền số điện thoại đúng định dạng"

    Examples:
      | name             | phone      | email             | password |
      | Huỳnh Văn Bá     |            | vanba@gmail.com   | 123      |
  @ErrorEmail
  Scenario Outline: Error Email
    Given user navigate to register page "http://localhost:5173/register"
    When user enter name: "<name>", phone: "<phone>" email "<email>" and password: "<password>"
    And click register button
    Then user should see an error email message "Bắt buộc điền email đúng định dạng"

    Examples:
      | name             | phone      | email             | password |
      | Huỳnh Văn Bá     | 0562147852 |                   | 123      |

  @ErrorPassword
  Scenario Outline: Error Password
    Given user navigate to register page "http://localhost:5173/register"
    When user enter name: "<name>", phone: "<phone>" email "<email>" and password: "<password>"
    And click register button
    Then user should see an error password message "Bắt buộc điền mật khẩu tối đa 255 ký tự"

    Examples:
      | name             | phone      | email             | password |
      | Huỳnh Văn Bá     | 0562147852 | vanba@gmail.com   |          |

  @UserExist
  Scenario Outline: User Exist
    Given user navigate to register page "http://localhost:5173/register"
    When user enter name: "<name>", phone: "<phone>" email "<email>" and password: "<password>"
    And click register button
    Then user should see an error register message "Email đã được đăng ký trước đó !"

    Examples:
      | name             | phone      | email             | password |
      | Le Minh Thang    | 0562147852 | thang@gmail.com   | 123      |


  @SuccessfulRegister
  Scenario Outline: Successful Register
    Given user navigate to register page "http://localhost:5173/register"
    When user enter name: "<name>", phone: "<phone>" email "<email>" and password: "<password>"
    And click register button
    Then user should see an success message "Đăng ký thành công !"
    Examples:
      | name             | phone      | email             | password |
      | Huỳnh Văn Bá     | 0562147852 | vanba@gmail.com   | 123      |
