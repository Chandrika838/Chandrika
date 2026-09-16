Feature: Invalid User functionality

Scenario: Verify blank first name
    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button
    And I open the Admin menu
    And I open the Users menu
    And I click Invite Users
    And I enter blank first name
    And I enter last name
    And I click User Submit button
    Then invalid first name message should be displayed


Scenario: Verify blank last name
    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button
    And I open the Admin menu
    And I open the Users menu
    And I click Invite Users
    And I enter first name
    And I enter blank last name
    And I click User Submit button
    Then invalid last name message should be displayed


Scenario: Verify invalid characters in first name
    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button
    And I open the Admin menu
    And I open the Users menu
    And I click Invite Users
    And I enter invalid characters in first name
    And I enter last name
    And I click User Submit button
    Then invalid character message should be displayed