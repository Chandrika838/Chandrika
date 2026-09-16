Feature: Users Booking Rules functionality

Scenario: Verify Users Booking Rules

    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button
    And I open the Admin menu
    And I open Tools
    And I open User Tools
    And I open Booking Rules
    And I open Rooms
    And I select All Users
    And I select Access
    Then Access should be selected
    When I enter Maximum Booking Per Month
    Then Maximum Booking Per Month should be displayed
    When I enter Maximum Booking By Duration
    Then Maximum Booking By Duration should be displayed
    When I enter Number Of Booking
    Then Number Of Booking should be displayed
    When I enter Maximum Allowed Per Day
    Then Maximum Allowed Per Day should be displayed
    And I enter Maximum Period To Book In Advance
    And I click Cancel
    And I click Submit