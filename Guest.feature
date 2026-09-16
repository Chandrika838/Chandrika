Feature: Guest User functionality

Scenario: Verify Add Guest User

    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button

    And I open the Admin menu
    And I open Tools
    And I open User Tools
    And I open Guest User Templates
    And I click Guest User Add New

    And I enter guest user name
    And I enter guest user prefix
    And I enter guest user number of figures
    And I select guest user character
    And I enter guest user length
    And I select guest user expiry period
    And I enable guest user expiry information

    Then guest user expiry information should be selected

    And I select guest user activation

    Then Guest User Submit button should be displayed

    When I click Guest User Submit button