Feature: ComputerLocationProperties functionality 

Scenario:Verify computerlocationproperties 

Given I open the application 
When I enter valid email 
And I enter valid password 
And I click login button 

And I open Admin menu 
And I open Tools
And I open Computer from Tools
And I click copy Properties 
Then the Computer Copy Properties should be displayed 
And I enter source computer

 And I select the configured location as the target

 And I enable the computer tag option
 And I enable the second computer tag option
 And I enable the computer location option
 And I enable the computer default duration option
 And I enable the allowed booking method option
 And I enable the computer preparation time option
 And I enable the computer check-in option

 And I enable computer level one warning time
 And I enable computer level two warning time
 And I enable computer level three warning time

 And I enable the computer logging level option
 And I enable the computer welcome message option
 And I enable the computer AUP message option
 And I enable the computer automatic reboot option
 And I enable the computer automatic shutdown option
 And I enable the computer inactivity timeout option
 And I enable the computer lock timeout option

 When I copy the computer properties

 Then the computer copy properties page should be displayed
