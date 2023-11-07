# new feature
# Tags: optional
Feature: Grade Levels Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  @Parameters, @GradeLevel, @Education, @Smoke, @Regression
  Scenario Outline: Grade Levels Management
    And Click on the element in the LeftNav
      | setup       |
      | parameters  |
      | gradeLevels |

    And Click on the element in the DialogContent
      | addButton |

    And User sends the keys into the DialogBox
      | nameInput | <name> |

    And Enter shortname "<shortname>" and "<order>"

    And Click on the element in the DialogContent
      | saveButton |

    Then Success message should be displayed

    And Click on the last edit button

    And User sends the keys into the DialogBox
      | nameInput | <editName> |

    And Enter shortname "<editShortName>" for update

    And Click on the element in the DialogContent
      | saveButton |

    Then Success message should be displayed

    And Click on the element in Dialog for deleting
      | deleteBtn       |
      | actionDeleteBtn |

    Then Success message should be displayed

    Examples:
      | name | shortname | order | editName | editShortName |
      | team | yedi      | 7     | editteam | edityedi      |