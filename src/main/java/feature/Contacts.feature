
Feature: Free CRM Create Contacts
  
Scenario Outline: free crm login scenario

 Given user is already in login page
 When  title of the login page is free crm
 And   user enters "<username>" and "<password>"
 Then  user clicks on login page
 #Then  user is on home page
 Then  user moves to contacts page
 Then  user clicks on contact details "<firstname>" and "<lastname>" and "<position>"
 Then  close the browser
 
  Examples: 
      |username        | password   | firstname | lastname | position   |
      |batchautomation |Test@12345 | meganath   | reddy    | manager    |
      |batchautomation |Test@12345 | kishore    | reddy    |asst manager|
      |batchautomation |Test@12345 | renuka     | reddy    | manager    |
      |batchautomation |Test@12345 | devanshi   | reddy    |asst manager|