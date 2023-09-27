Feature: Verify add Purchases successfully

  Background: Login as Admin role
    Given user logged in as an admin

  Scenario: Verify add Purchases successfully
    Given user on the add purchases page
    When user input some purchases informations required
    And click Submit
    Then dispayled message : Purchase successfully added

