Feature: Verify successfully logged in

  Scenario: Verify successfully logged in
    Given user navigate to Login page "https://sma.tecdiary.net/admin/login"
    When user enter email "admin@tecdiary.com" and password: "12345678"
    And click login button
    Then user should be redirected to the admin page
    And user should see the Message, Overview Chart, Quick Links, Latest Five, Best Sellers

