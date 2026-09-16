Feature: Login Functionality

Scenario: Verify valid login

    Given I open the application
    When I enter valid email
    When I enter valid password
    When I enable high contrast
    Then high contrast should be enabled
    When I click the login button
    Then the logged in username should be displayed
    Then the logged in username should not be empty