Feature: Location functionality

Scenario: Verify add new location

Given I open the application

When I enter valid email

And I enter valid password

And I click the login button

When I open the Location menu

Then Location should be displayed

When I click Location Add New 

And I enter the Location name

And  I open Location Advanced Options

And I select the Location parent location

And I select the Location time zone 

And I selecct the Location time zone inhertiance 

And I open Location Working Hours 

And I set Location working hours 

And I enable Location non working day 

And I click Location Custom Add 

And I enter the Location custom name 

And I select the Location date from 

And I select the Location date to 

And I click the Location  Add button 









