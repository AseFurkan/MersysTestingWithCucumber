Feature: Parameters Document

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the element
      | setup         |
      | parameters    |
      | documentTypes |

  @SmokeTest
  Scenario: Create
    And Click on the element
      | addBtn |
    And User sending the keys
      | name | Burcu |
    And Click on the element
      | nameSelect |
      | studentTik |
    And Escape on the element
      | alreadyExist |
    And Click on the element
      | save |
    And success messages
      | successMessage | success |

  @SmokeTest
  Scenario: Edit
    And User sending the keys
      | searchInput | Burcu |
    And Click on the element
      | editBtn |
    And User sending the keys
      | name | Alper |
    And Click on the element
      | save |
    And success messages
      | successMessage | success |

  @SmokeTest
  Scenario: Delete
    And User sending the keys
      | searchInput | Alper |
    And Click on the element
      | searchBtn       |
    And Click on the element
      | deleteImageBtn  |
      | deleteDialogBtn |
    And success messages
      | successMessage | success |















