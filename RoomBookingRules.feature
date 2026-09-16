Feature: Room Booking Rules

  Scenario: Create a room booking rule using user and room tags

    Given I open the application

    When I enter valid email
    And I enter valid password
    And I click the login button

    And I navigate to Room Booking Rules
    And I click Add New for Room Booking
    And I select booking user tag "Automation Tags"
    And I select booking room tag "Automation"
    And I continue with the room booking rule