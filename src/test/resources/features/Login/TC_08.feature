Feature: Verify add Sale successfully

  Background: Login as Admin role
    Given user logged in as an admin

  Scenario: Verify add Sale successfully
    Given user on the add sale page
    When user input some information required
    And click submit
    Then the page dispayled message : Sale successfully added

