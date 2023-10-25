Feature: Create a position

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  @SmokeTest @HR @Regression
  Scenario: Add, edit and delete positions under Human Resources

    Given Go to positions page HR->Setup->Positions
    When Add a new position by using name and short name
    When Edit position
    Then Delete position
    Then Active and non active positions

