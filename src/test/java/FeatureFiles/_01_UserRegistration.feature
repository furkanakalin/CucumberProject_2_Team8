Feature: Registraion Functionalty

  Background:
    Given Navigate to the Website

  Scenario: Register to the Website

    And Click on the Element in DialogContent
      | createanaccount |

    And User Sending the keys in DialogContent
      | firstname | team                 |
      | lastname  | eight                |
      | email     | teameight87@gmail.com |
      | password  | Project2.            |
      | confirm   | Project2.           |

    And Click on the Element in DialogContent
      | create |

    Then Success message should be displayed

