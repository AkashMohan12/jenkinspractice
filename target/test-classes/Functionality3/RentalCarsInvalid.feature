@rentalcarfunctionalscenario
Feature: to verify the functionality of the application.
Scenario: the user wants to verify the functionality of the URL.
Given user open the browser 
When user enters the URL "https://www.tripadvisor.com/"
Then user wants to verify whether the page is loaded or not
When user clicks on the more option
And user selects '<Rental Cars>' from the drop down list
Then user wants to verify whether the rental cars page is loaded or not
And user enters the invalid location '<location>' on the pickup location text box 
And selects the pickup date and drop date from list
And selects the number of passengers from the list
And user clicks on find rental Cars button
Then user wants to verify whether the error is shown.
Examples:
|location|
|asdfg|