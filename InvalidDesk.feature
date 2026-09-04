Feature: Invalid Desk functionality

  Scenario: Verify invalid desk tag
    Given I open the application
    
    When I enter valid email
    
    And I enter valid password
    
    And I click the login button
    
    And I click Add New
    
    And I enter valid desk name
    
    And I select valid location
    
    And I open Desk Advanced Options
    
    And I enter valid default duration
    
    And I select valid preparation time
    
    And I enable Check In Required
    
    And I open Tags and Booking Rules
    
    And I click Tags Add button
    
    And I select invalid desk tag
    
    And I click Desk Add button
    
    Then invalid desk error message should be displayed