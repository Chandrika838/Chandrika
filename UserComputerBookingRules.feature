@regression
Feature: User Computer Booking Rules

  Scenario: Verify user computer booking rules

    Given I am on the User Computer Booking Rules page

    When I enable computer access
    And I enable computer access toggle

    And I enable maximum computer bookings per month
    And I enter the maximum computer bookings per month

    And I enable maximum computer booking duration
    And I enter the maximum computer booking duration

    And I enable computer bookings per day
    And I enter the computer bookings per day

    And I enable maximum allowed computer booking time per day
    And I enter the maximum allowed computer booking time per day

    And I enable maximum computer booking advance period
    And I enter the maximum computer booking advance period

    And I enable computer booking extension
    And I enable computer extension toggle

    And I enable automatic computer extension
    And I enable automatic extension toggle

    And I enable maximum computer extension time
    And I enable maximum extension time toggle

    And I enable number of computer extensions
    And I enable number of extensions toggle

    And I submit the user computer booking rules