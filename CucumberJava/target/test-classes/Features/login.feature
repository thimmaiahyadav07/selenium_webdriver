#Author
#Date
#Description
@SmokeScenario
Feature:feature to test login functionality
@SmokeTest

Scenario:Check login successful with valid credentials

Given user is on login page
When user enters username and password
And clicks on login button
Then user is navigated for the home page 






