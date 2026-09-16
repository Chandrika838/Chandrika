Feature: Admin Policy functionality

Scenario: Verify Add Admin Policy

    Given I open the application
    When I enter valid email
    And I enter valid password
    And I enable high contrast
    And I click the login button

    And I open the Admin menu
    And I open Tools
    And I open User Tools
    And I open Admin Policy Rules
    And I click Admin Policy Add New

    And I select Admin Policy user tag
    And I select Admin Policy resource tag

    Then Admin Policy Submit button should be displayed
    When I click Admin Policy Submit button