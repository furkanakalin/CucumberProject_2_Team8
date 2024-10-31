Feature: Add Address Functionality

  Background:
    Given Navigate to the Website
    When Enter username and password to login

  Scenario: Add Address for Registered User

    And Click the Element in DialogContent
      | actionbutton |
      | myaccount    |
      | addressbook  |
      | region       |
      | georgia      |
      | country      |
      | getGeorgia   |
      | save         |

    And User Send keys in DialogContent
      | street   | Fenerbahce |
      | city     | Istanbul   |
      | postcode | 1907       |
