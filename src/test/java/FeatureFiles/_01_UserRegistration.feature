Feature: Registraion Functionalty

  Background:
    Given Navigate to the Website

  Scenario: Register to the Website

    And Click on Element in DialogContent
      | createanaccount |

    And User Sending keys in DialogContent
      | firstname | team                 |
      | lastname  | eight                |
      | email     | teameight7@gmail.com |
      | password  | Project2.            |
      | confirm   | Project2.            |

    And Click on Element in DialogContent
      | create |

    Then Success message should be displayed

