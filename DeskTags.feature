Feature: Desk Tags functionality

  Scenario: Create a desk tag

    Given I open the application

    When I enter valid email
    And I enter valid password
    And I enable high contrast
    And I click the login button

    And I navigate to Desk Tags
    And I click Add New for Desk Tags
    And I enter desk tag
    And I click Add for Desk Tags

    Then the Desk Tags submit button should be displayed
