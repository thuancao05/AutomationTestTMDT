Feature: Cart

  Background: Search Product
    Then user redirect to index page "http://localhost:5173/index/products"
    When user enter search value: "điện trở"
    And click search button
    Then user should see list products with name include "điện trở"

  Scenario Outline: Add Product To Cart
    Given user click to view detail one product
    When user select "<quantity>" to add product to cart
    And click add to cart button
    Then the cart page displayed product added with "<quantity>"
    Examples:
      | quantity      |
      | 1             |
      | 5             |


