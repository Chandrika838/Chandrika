Feature: Desk Booking Rules

  Scenario: Verify desk booking rules
    Given I am on the Desk Booking Rules page

    When I enable desk access
    Then desk access should be selected

    When I enable maximum bookings per month
    Then maximum bookings per month should be selected

    When I enable maximum booking duration
    Then maximum booking duration should be selected

    When I enable bookings per day
    Then bookings per day should be selected

    When I enable maximum allowed time per day
    Then maximum allowed time per day should be selected

    When I enable maximum advance booking period
    Then maximum advance booking period should be selected

    When I submit the desk booking rules
    Then the submit button should be displayed