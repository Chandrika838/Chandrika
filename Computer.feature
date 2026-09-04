Feature: Computer functionality

  Scenario: Verify add new computer

    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button

    And I open Computers menu
    And I click computer Add New

    And I enter computer name
    And I enter computer ID
    And I select location

    And I open Computer Advanced Options

    And I enter No Show Wait Time
    And I enter Level 1 Warning
    And I enter Level 2 Warning
    And I enter Level 3 Warning

    And I select Logging Level
    And I enable Show Welcome Message
    And I enable Show AUP Message

    And I enter Inactivity Timeout
    And I enter Lock Timeout

    And I enable Auto Reboot
    And I enable Auto Shutdown

    And I open computer Tags and Booking Rules
    And I click Tags Add
    And I select computer tag

    And I click Computer Add button