Feature: Create a position

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  @SmokeTest @HR @Regression
  Scenario: Add, edit and delete categories under Educations

    Given Go to positions page Education->Setup->Subject Categories
    When Add a new category by using name and short name
    Then Success message should be displayed
    When Edit category
    Then Success message should be displayed
    Then Delete category
