Feature: Login functionality

  Scenario: Verify valid login

    Given I open the application

    When I enter valid email
    And I enter valid password
    And I enable high contrast

    Then high contrast should be enabled

    When I click the login button

    Then the logged in username should be displayed
    And the logged in username should not be empty