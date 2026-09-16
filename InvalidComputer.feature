Feature: Invalid Computer functionality

Scenario: Verify blank computer name

    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button
    And I open the Admin menu
    And I open the Computers menu
    And I click Computer Add New

    And I enter blank computer name
    And I enter computer ID
    And I select computer location
    And I open Computer Advanced Options
    And I enter No Show Wait Time
    And I enter blank Level 1 Warning
    And I enter Level 2 Warning as invalid character
    And I enter Level 3 Warning
    And I select Computer Logging Level
    And I enable Computer Welcome Message
    And I enable Computer AUP Message
    And I enter Computer Inactivity Timeout
    And I enter Computer Lock Timeout
    And I enable Computer Auto Reboot
    And I enable Computer Auto Shutdown
    And I click Computer Add button

    Then Invalid Computer entry message should be displayed


Scenario: Verify invalid computer credentials

    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button
    And I open the Admin menu
    And I open the Computers menu
    And I click Computer Add New

    And I enter blank computer name
    And I enter blank computer ID
    And I select computer location
    And I open Computer Advanced Options
    And I enter No Show Wait Time
    And I enter blank Level 1 Warning
    And I enter blank Level 2 Warning
    And I enter Level 3 Warning
    And I select Computer Logging Level
    And I enable Computer Welcome Message
    And I enable Computer AUP Message
    And I enter Computer Inactivity Timeout
    And I enter Computer Lock Timeout
    And I enable Computer Auto Reboot
    And I enable Computer Auto Shutdown
    And I click Computer Add button

    Then Invalid Computer entry message should be displayed


Scenario: Verify invalid computer character

    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button
    And I open the Admin menu
    And I open the Computers menu
    And I click Computer Add New

    And I enter blank computer name
    And I enter blank computer ID
    And I select computer location
    And I open Computer Advanced Options
    And I enter No Show Wait Time
    And I enter blank Level 1 Warning
    And I enter blank Level 2 Warning
    And I enter blank Level 3 Warning
    And I select Computer Logging Level
    And I enable Computer Welcome Message
    And I enable Computer AUP Message
    And I enter blank Computer Inactivity Timeout
    And I enter blank Computer Lock Timeout
    And I enable Computer Auto Reboot
    And I enable Computer Auto Shutdown
    And I click Computer Add button

    Then Invalid Computer entry message should be displayed