Feature: Verify Edit product

  Background: Login as Admin role
    Given user logged in as an admin

  Scenario: Verify Edit product
    Given user on detail Mouse product page
    When click to the button edit product
    And change some infomations product
    Then the page displayed message: Product price does not match with combo items' price

