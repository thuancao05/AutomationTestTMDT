Feature: Login to CRM
  As a user, I want to be able to log into the CRM system
  So that I can manage customer information

  Scenario: Successful login
    Given I am on the login page
    When I enter my username and password
    And I click the Login button
    Then I should be taken to the Dashboard page
    And I shoud see the "Customers" menu

#  Scenario Outline: eating
#    Given there are "<start>" cucumber
#    When I eat "<eat>" cucumber
#    Then I should have "<left>" cucumber
#
#    Examples:
#        | start | eat | left |
#        | 12    | 5   | 7    |
#        | 20    | 5   | 15   |