Feature: Organisation setting functionality

Scenario: Verify organisation settings

Given I open the application

When I enter valid email

And I enter valid password

And I enable high contrast

And I click the login button

Then organisation should be displayed 

When  I open organisation settings

And I select the configured time zone

Then the selected time zone should be displayed

When I open organisation Advanced Options

And I enable authentication options

And I enable tooltip options

And I resource options

Then the organisation Submit button should be displayed

When I click the organisation submit button