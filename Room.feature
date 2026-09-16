Feature: Admin Room functionality

Scenario: Verify Add Room

    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button

    And I open the Admin menu
    And I open the Room menu
    And I click Room Add New

    And I enter room name
    And I select room location

    And I open Room Advanced Options
    And I enable Room camera
    And I enable Room monitor
    And I enable Room projector

    Then Room preparation dropdown should be displayed
    And I select Room preparation

    And I select Room check box

    And I open Room Tags and Booking Rules
    And I click Room Add
    And I select Room tag

    Then Room Submit button should be displayed
    When I click Room Submit button