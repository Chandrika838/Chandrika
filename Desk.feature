Feature: Desk functionality

Scenario: Verify Desk creation
    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button

    And I open the Admin menu
    And I open the Desk menu
    And I click Desk Add New

    And I enter desk name
    And I select desk location
    And I enter default duration

    Then Desk location should be displayed

    When I open Desk Advanced Options
    And I select Desk preparation time
    Then Desk preparation time should be displayed

    When I enable Desk check in required
    Then Desk check in required should be selected

    When I open Tags and Booking Rules
    And I click Tags Add
    And I select Desk tag

    And I click Desk Add button
    Then Desk Add button should be displayed