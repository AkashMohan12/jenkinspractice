@functionalscenario
Feature: to verify the functionality of the application.
Scenario: the user wants to verify the functionality of the URL.
Given user open the browser 
When user enters the URL "https://www.tripadvisor.com/"
Then user wants to verify whether the page is loaded or not
When user clicks on review option
And user enter the data '<Search>' to be reviewed on the search box.
And press Enter Key
Then user verifies whether the searched data is displayed or not.
And user closes the browser
Examples:
|Search|
|Chennai hotels|