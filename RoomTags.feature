Feature: Room Tags Functionaality 

Scenario: Verify Room  Tags

Given I open the application 
When I enter the valid email id 
And I enter the valid Password 
And I click the Login button 

And I Open Admin Menu 
When  I click on Tools
And I click Room Tools
And I click Room Tags
And I click RoomTags Add New 

And I enter the room tag name 

And I click Add

Then the room tag should be created 




