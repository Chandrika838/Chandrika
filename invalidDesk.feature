Feature: Invalid Desk functionality

Scenario: Verify blank desk name
    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button

    And I open the Admin menu
    And I open the Desk menu
    And I click Desk Add New
    And I enter blank desk name
    And I select desk location
    And I open Desk Advanced Options
    And I enter default duration
    And I select Desk preparation time
    And I enable Desk check in required
    And I click Desk Add button

    Then Invalid Desk message should be displayed


Scenario: Verify blank desk name and duration
    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button

    And I open the Admin menu
    And I open the Desk menu
    And I click Desk Add New
    And I enter blank desk name
    And I select desk location
    And I open Desk Advanced Options
    And I enter blank default duration
    And I select Desk preparation time
    And I enable Desk check in required
    And I click Desk Add button

    Then Invalid Desk message should be displayed


Scenario: Verify invalid desk preparation
    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button

    And I open the Admin menu
    And I open the Desk menu
    And I click Desk Add New
    And I enter blank desk name
    And I select desk location
    And I open Desk Advanced Options
    And I enter default duration
    And I select Desk preparation time
    And I enable Desk check in required
    And I click Desk Add button

    Then Invalid Desk message should be displayed