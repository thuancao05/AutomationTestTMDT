Feature: Verify List Products

  Scenario: Verify List Products
    Given user navigate to Login page "https://sma.tecdiary.net/admin/login"
    When user enter email "admin@tecdiary.com" and password: "12345678"
    And click login button
    And click Products
    And click List Products
    Then user should see Image, Code, Name, Brand, Category, Cost, Price, Quantity, Unit, Alert Quantity, Actions

