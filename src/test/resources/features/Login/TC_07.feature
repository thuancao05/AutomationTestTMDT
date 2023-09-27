Feature: Verify create Print Barcode/Label successfully

  Background: Login as Admin role
    Given user logged in as an admin

  Scenario: Verify create Print Barcode/Label successfully
    Given user on the Print Barcode/Label page
    When user add some informations to print barcode
    And click update
    Then the page display bar code

