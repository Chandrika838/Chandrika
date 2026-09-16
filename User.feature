Feature: User functionality

Scenario: Verify User Settings
    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button

    When I open the Admin menu
    And I open the Users menu
    And I click Invite Users
    And I enter first name
    And I enter last name

    Then User Submit button should be displayed
    When I click User Submit button