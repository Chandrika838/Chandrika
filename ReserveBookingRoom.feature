Feature: Reserve Room functionality 

Scenario:Verify reserve room booking 
Given I open the application

When I enter valid email

And I enter valid password

And I click the login button

And I select Room

And I select the Room location

And I select the Room booking date 

And I select the Room start time 

And I enable Room self booking 

Then Room self booking should be enabled 

When I click Room Book button 


