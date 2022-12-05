@rentalcarfunctionalscenario
Feature: to verify the functionality of the application.
Scenario: the user wants to verify the functionality of the URL.
Given user open the browser 
When user enters the URL "https://www.tripadvisor.com/"
Then user wants to verify whether the page is loaded or not
When user clicks on the more option
And user selects '<value>' from the drop down list
Then user wants to verify whether the add a place page is loaded or not
And User Clicks on list an accommodation
And user click on no option
Then user clicks on continue
And user closes the browser
Examples:
|value|
|Add a Place|