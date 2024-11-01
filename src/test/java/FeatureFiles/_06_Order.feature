Feature: Order Functionality

  Background:
    Given Navigate to the Website
    When Enter username and password to login

  Scenario: Ordering
    And Click on the product
    And Click on Element in DialogContent
      | size      |
      | colour    |
      | addToCart |
    And Hover over the Element in DialogContent
      | cartImg |
    And Click on Element in DialogContent
      | cartCheck |
    And User Sending keys in DialogContent
      | changeNumber | 3 |
    And Click on Element in DialogContent
      | updateButton  |
      | proceedButton |
      | radioButton   |
      | nextButton    |
    Then User validates the payment message displayed
      | paymentTitle |
    And User validates the item is displayed
      | billingCheck |
    And Click on Element in DialogContent
      | placeOrder |
    Then User validates order {string}
      | thanksMessage |
      | orderID       |
