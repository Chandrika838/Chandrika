@regression
Feature: User Desk Booking Rules

  Scenario: Verify user desk booking rules

    Given I am on the User Desk Booking Rules page

    When I enable user desk access
    Then user desk access should be selected

    When I enable user maximum bookings per month
    Then user maximum bookings per month should be selected

    When I enable user maximum booking duration
    Then user maximum booking duration should be selected

    When I enable user bookings per day
    Then user bookings per day should be selected

    When I enable user maximum allowed time per day
    Then user maximum allowed time per day should be selected

    When I enable user maximum advance booking period
    Then user maximum advance booking period should be selected

    Then the user desk booking submit button should be displayed

    When I submit the user desk booking rules