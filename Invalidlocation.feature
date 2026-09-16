Feature: Invalid Location functionality

Scenario: Verify blank location

    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button
    And I open the Admin menu
    And I open the Location menu
    And I click Location Add New
    And I enter blank location name
    And I open Location Advanced Options
    And I select parent location
    And I enable Location time zone
    And I click Location Add button
    Then invalid blank location message should be displayed