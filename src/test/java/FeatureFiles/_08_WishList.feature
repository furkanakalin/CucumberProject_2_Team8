Feature: WishList functionality

  Background:
    Given Navigate to the Website
    When Enter username and password to login


  Scenario: Checking if wishlist working properly

    And Hover over the Element in DialogContent
      | gear |

    And Click on the Element in DialogContent
      | bags        |
      | product8    |
      | addWishList |

    And Successful message is displayed

    And Hover over the Element in DialogContent
      | productName |

    And Click on the Element in DialogContent
      | removeButton |

    And Successful message is displayed

    And Click on the Element in DialogContent
      | updateButton |

    And Wishlist successfully updated
