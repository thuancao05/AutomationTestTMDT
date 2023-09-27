Feature: Verify view product detail

  Background: Login as Admin role
    Given user logged in as an admin

  Scenario: Verify view product detail
    Given user on the dashboard page
    When click Products
    And click List Products
    And click to the Lemon product
    Then the product detail page displayed

