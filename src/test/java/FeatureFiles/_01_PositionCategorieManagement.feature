Feature: Position Categorie Management

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully


  @SmokeTest @HR @Regression
  Scenario: Position Operations

    Given Navigate to positions
    When Add a new position
    Then Edit the position
    And Delete the position