Feature: Order Functionality

  Background:
    Given Navigate to the Website
    When Enter username and password to login

  Scenario: Ordering
    And Click on the product
    And Click on the element in DialogContent
      | size      |
      | colour    |
      | addToCart |
      | cartImg   |
      | cartCheck |
    And User sending keys in DialogContent
      | changeNumber | 3 |
    And Click on the element in DialogContent
      | updateButton  |
      | proceedButton |
      | radioButton   |
      | nextButton    |
    And User validates the saved address
    Then User validates the payment message displayed
    And User validates the item is displayed
    And Click on the element in DialogContent
      | placeOrder |
    Then User validates order {string}
      | thanksMessage |
      | orderID       |
