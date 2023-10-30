Feature: Adding new fields

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully


  @SmokeTest @Parameters @Fields
  Scenario: Field Operations

    Given Navigate to fields
    When Add a new field
    Then Edit the field
    And Delete the field
    And The field should be deleted successfully
