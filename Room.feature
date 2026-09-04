Feature: Room functionality

  Scenario: Verify add new room

    Given I open the application

    When I enter valid email
    And I enter valid password
    And I click the login button

    Then Room menu should be displayed

    When I open Room menu

    Then Add New button should be displayed

    When I click Room Add New

    Then Room Name field should be displayed

    When I enter the room name

    Then Location dropdown should be displayed

    When I select the location

    When I open Room Advanced Options

    Then Preparation dropdown should be displayed

    When I select the preparation time 
    
    And I select the check in required checkbox 
    
    And I open Room Tags and Booking Rules
    
    And I click Tags Add button
    
    And I select room  tag
    
    Then Room Submit button should be displayed

    When I click Room Submit button