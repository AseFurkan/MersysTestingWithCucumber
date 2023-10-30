Feature: Setup Attestations

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the element
      | humanBtn        |
      | setupBtn        |
      | attestationsBtn |

  @SmokeTest
  Scenario: Create
    And Click on the element
      | addBtn |
    And User sending the keys
      | name | Alper |
    And Click on the element
      | errorMsg |
      | save     |
    And success messages
      | successMessage | success |

  @SmokeTest
  Scenario: Edit
    And User sending the keys
      | searchInput | Alper |
    And Click on the element
      | searchBtn |
      | errorMsg  |
      | editBtn   |
    And User sending the keys
      | name | Ricardi |
    And Click on the element
      | save     |
    And success messages
      | successMessage | success |

  @SmokeTest
  Scenario: Delete
    And User sending the keys
      | searchInput | Ricardi |
    And Click on the element
      | searchBtn       |
      | errorMsg        |
      | deleteImageBtn  |
      | deleteDialogBtn |
    And success messages
      | successMessage | success |













