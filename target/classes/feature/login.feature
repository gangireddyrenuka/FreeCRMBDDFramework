
Feature: free crm login feature

#without Example Keyword
#Scenario: free crm ligin scenario

# Given user is already in login page
# When title of the login page is free crm
#And user is enters username and password
#Then user clicks on login page
   
#with example keyword is called data driven approach
Scenario Outline: free crm login scenario

 Given user is already in login page
 When title of the login page is free crm
 And User enters "<username>" and "<password>"
 Then user clicks on login page
 Then close the browser
 
   
 Examples:
 
 |username                     |password|
 |gangireddyrenuka253@gmail.com|devanshi143| 
 |test123                      |test143|