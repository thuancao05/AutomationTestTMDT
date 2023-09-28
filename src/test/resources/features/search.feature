Feature: Search

  Scenario Outline: Search Products
    Given user redirect to index page "http://localhost:5173/index/products"
    When user enter search value: "<searchValue>"
    And click search button
    Then user should see list products with name include "<searchValue>"
    Examples:
      | searchValue      |
      | Điện trở         |

