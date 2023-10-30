@Parameters @Education @Smoke @Regression
Feature: School Departments
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    When  Click on the element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

  Scenario: Create Nationality
    And Click on the element in Dialog
      | addButton |
    And User sending the keys in Dialog
      | nameInput | teamYedi |
    And Click on the element in Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario: Search Nationality
    And User sending the keys in Dialog
      | searchInput | teamYedi |
    And Click on the element in Dialog
      | searchButton |
    Then Name should display successfully
      | nameList | teamYedi |

  Scenario: Edit Nationality

    And User sending the keys in Dialog
      | searchInput | teamYedi |
    And Click on the element in Dialog
      | searchButton |
    And Click on the element in Dialog
      | editBtn |
    And User sending the keys in Dialog
      | nameInput | team7 |
    And Click on the element in Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario: Delete Nationality

    And User delete the element from Dialog
      | team7 |















