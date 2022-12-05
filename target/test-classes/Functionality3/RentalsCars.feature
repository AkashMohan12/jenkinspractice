@rentalcarfunctionalscenario
Feature: to verify the functionality of the application.
Scenario: the user wants to verify the functionality of the URL.
Given user open the browser 
When user enters the URL "https://www.tripadvisor.com/"
Then user wants to verify whether the page is loaded or not
When user clicks on the more option
And user selects '<value>' from the drop down list
Then user wants to verify whether the rental cars page is loaded or not
And user enters the location '<location>' and selects location of pick up from the displayed drop down
And selects the pickup date and drop date from list
And selects the number of passengers from the list
And user clicks on find rental Cars button
Then user wants to verify whether the user is navigated to next page or not
And user selects the car of user choice
And user closes the browser
Examples:
|value|location|
|Rental Cars|chennai|



