Feature: Invalid User Tags

  Scenario: Verify invalid user tag validation

    Given I open the application
    When I enter valid email
    And I enter valid password
    And I enable high contrast
    And I click the login button

    When I navigate to User Tags
    And I click Add New
    And I enter a blank user tag
    And I click the Add button

    Then the invalid message should be displayed
    And the invalid message should be "Invalid entry!"