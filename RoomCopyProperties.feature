Feature: Room Copy Properties

  Scenario: Verify copy room properties

    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button

    When I navigate to Room Copy Properties
    And I select the source room
    And I select the location
    And I enable the Room option
    And I enable the Test option
    And I enable the Setting option
    And I enable the Default option
    And I enable the Capacity option
    And I enable the Equipment option
    And I enable the Preparation Time option
    And I enable the Check-in Setting option
    And I enable the Check-in Tags option
    And I click the Copy button