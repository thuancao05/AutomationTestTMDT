Feature: Verify Purchases List

  Background: Login as Admin role
    Given user logged in as an admin

  Scenario: Verify Purchases List
    Given user on the dashboard page
    When click Purchases
    And click List Purchases
    Then the Purchases table displayed : format datetime by dd/mm/yyy hh:mm:ss,  Reference No order by DESC, Dispayed 9 Purchases

