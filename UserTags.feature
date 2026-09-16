Feature: User Tags

  Scenario: Add a new user tag

    Given I open the application

    When I enter valid email

    And I enter valid password

    And I enable high contrast

    And I click the login button

    When I navigate to User Tags

    And I click Add New

    And I enter the user tag

    When I click the Add button

    Then the Submit button should be displayed
    