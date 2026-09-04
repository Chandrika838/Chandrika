Feature: User functionality

Scenario: Verify user setting

Given I open the application

When I enter valid email

And I enter valid password

And I click the login button

And I open the Users menu

And I open the Invite Users

When I enter the first name

And I enter the last name

Then the user submit button should be displayed

When I click the user submit button