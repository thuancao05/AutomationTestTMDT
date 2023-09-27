Feature: Verify Print Barcode/Label page

  Background: Login as Admin role
    Given user logged in as an admin

  Scenario: Verify Print Barcode/Label page
    Given user on the dashboard page
    When click Products
    And click Print Barcode/Label
    Then the Print Barcode/Label page displayed

