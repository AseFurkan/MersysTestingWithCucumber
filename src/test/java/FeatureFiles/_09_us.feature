Feature: Mersys Testing


  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  @Smoke, @Regression @Parameters, @Finance, @Banking
  Scenario Outline: User adds, edits and deletes bank accounts data

    And Click on the element in the LeftNav
      | setup        |
      | parameters   |
      | bankAccounts |

    And Click on the element in the DialogContent
      | addButton |

    And The admin click on the edit element Dialog sends the keys into the DialogBox
      | nameInput       | <name>     |
      | ibanBox         | <IBAN>     |
      | integrationCode | <int code> |

    And Click on the element in DialogBox
      | currency  |
      | currency1 |

    And Click on the element in the DialogContent
      | saveButton |

    Then Success message should be displayed

    And User sends the keys into the DialogBox
      | searchNameInput | <name> |

    And Click on the search button

    And Click on the edit button in the DialogContent

    Then The admin user sending new locations information in Dialog
      | nameInput       | <e_nameInput>    |
      | integrationCode | <e_IntCodeInput> |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User sends the keys into the DialogBox
      | searchNameInput | <e_nameInput> |

    And Click on the search button

    And Click on the element in Dialog for deleting
      | deleteBtn       |
      | actionDeleteBtn |

    Then Success message should be displayed

    Examples:
      | name       | IBAN           | int code | e_nameInput | e_IntCodeInput |
      | trying1321 | 32112312312317 | 7177     | trying1231  | 98765          |
