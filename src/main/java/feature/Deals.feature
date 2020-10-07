Feature: Free CRM Create Deal Details
  
Scenario: free crm login scenario

 Given user is already in login page
 When  title of the login page is free crm
 And   user enters username and password
      |batchautomation |Test@12345 |
 Then  user clicks on login page
 #Then  user is on home page
 Then  user moves to new deals page
 Then  user clicks on deal details
      |test deal |  1000| 50 | 10 |
 Then  close the browser
