Feature: Organisation Settings functionality

Scenario: Verify Organisation Settings

    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button

    When I open the Admin menu
    And I open the Organisation page
    And I select the Organisation time zone
    Then Organisation time zone should be displayed

    When I open Organisation Advanced Options
    And I enable Organisation authentication options
    And I enable Organisation tooltip Options
    And I enable Organisation resource options

    Then Organisation Submit button should be displayed

    When I click the Organisation Submit button