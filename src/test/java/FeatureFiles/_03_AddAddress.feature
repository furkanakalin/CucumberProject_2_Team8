Feature: Add Address Functionality

  Background:
    Given Navigate to the Website
    When Enter username and password to login

  Scenario: Add Address for Registered User

    And Click the Element in DialogContent
      | actionbutton  |
      | myaccount     |
      | manageaddress |
      | addnewaddress |
      | region        |
      | georgia       |
      | country       |
      | getGeorgia    |


    And User Send keys in DialogContent
      | phone    | 1907       |
      | street   | Fenerbahce |
      | city     | Istanbul   |
      | postcode | 34197      |

    And Click the Element in DialogContent
      | save |

    Then Success message should displayed