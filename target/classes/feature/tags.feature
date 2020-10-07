Feature: Free CRM Create Deal Details
@SmokeTest @RegressionTest
  Scenario: free crm login scenario
    Given user is already in login page
    
@SmokeTest
  Scenario: create a contact page
    Given user is already in contact page
    
@SmokeTest
  Scenario: create a deal page
    Given user is already in deal page
    
@SmokeTest @RegressionTest
  Scenario: create a new  newdeal page
    Given create a newdeal page test
    
@RegressionTest
  Scenario: create a new task page
    Given create a new task page test case
    
@RegressionTest
  Scenario: create a new report page
    Given create a new report page test case
@End2End @SmokeTest
  Scenario: create a new docs page
    Given create a new docs page test case
@End2End @regressionTest
  Scenario: create a new forms page
    Given create a new forms page test case
@End2End
  Scenario: close the browser
    Given close the browser
