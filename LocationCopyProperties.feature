Feature:Location Copy Properties

Scenario:Verify Location Copy Properties functionality 

Given I open the application 
When I enter the vaild Email 
And I enter the valid Password 
And I click login button 

And I open the Admin menu 
And I open Tools 
And I click Location Copy Properties
And I click Source location
And I enable Target option
And I enable Parent location
And I enable timezone
And I enable Working Hours 

When I click the Location Copy Button 

Then the location properties should be copied