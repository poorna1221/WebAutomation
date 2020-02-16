Feature: FreeCRM Contacts #StepDefinition

@smoketest 

Scenario: I want to be able book hotels, flights or tours

Given user logged into phptravels application
When  user clicks on flights link and provide booking information
And  user clicks on search button and book now button
And  user completes the booking
Then verify if the user is navigated to booking confirmation page 






