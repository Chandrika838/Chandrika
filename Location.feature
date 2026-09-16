Feature: Location functionality

Scenario: Verify Add Location
    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button

    And I open the Admin menu
    And I open the Location menu
    And I click Location Add New
    And I enter location name
    And I open Location Advanced Options
    And I select parent location
    And I enable Location time zone
    And I select inheritance from organisation
    And I open Location working hours
    And I set Location working hours
    And I enable Location non working day
    And I click Location Custom Add
    And I enter custom name
    And I click Location date from
    And I click Location date to
    And I click Location Add button