Feature: User Copy Properties functionality

Scenario: Verify Copy User Properties

    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button
    And I open the Admin menu
    And I open Tools
    And I open Users from Tools
    And I click Copy Properties
    And I enter source user
    And I enable user copy property checkboxes
    And I click Copy button