@roadtripsfunctionalscenario
Feature: to verify the functionality of the application.
Scenario: the user wants to verify the functionality of the URL.
Given user open the browser 
When user enters the URL "https://www.tripadvisor.com/"
Then user wants to verify whether the page is loaded or not
When user clicks on the more option
And user selects '<value>' from the drop down list
Then user wants to verify whether user is navigated to next page or not
And user selects the road trip of user's choice
And user closes the browser
Examples:
|value|
|Road Trips|