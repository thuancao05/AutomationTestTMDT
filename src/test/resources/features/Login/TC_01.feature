Feature: Verify Login page

  Scenario: Verify Login page
    Given user navigate to Login page "https://sma.tecdiary.net/admin/login"
    Then user should see the username text, password text, login button, remember me
