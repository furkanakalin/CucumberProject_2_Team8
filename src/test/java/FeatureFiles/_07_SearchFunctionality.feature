Feature: Search Functionality Positive and Negative

  Scenario Outline: Positive
    Given User navigates to the WebPage
    Then User searches for an item "<itemName>"
    Then User validates the item is displayed and clicks on it
    Then User validates the SKU number is same as "<itemName>"
    And User clicks on add to cart button
    Examples:
      | itemName |
      | MJ08     |
      | MJ09     |
      | MJ04     |


  Scenario Outline: Negative
    Given User navigates to the WebPage
    Then User searches for an item "<itemName>"
    Then User validates search result is "<text>"
    Examples:
      | itemName | text                             |
      | MJK667   | Your search returned no results. |



