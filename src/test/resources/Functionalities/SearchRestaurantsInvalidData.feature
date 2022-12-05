@restaurentfunctionalscenario
Feature: to check the functionality of the restaurant option.
Scenario: the user wants to functionality of the restaurant option.
Given user open the browser 
When user enters the URL "https://www.tripadvisor.com/"
Then user wants to verify whether the page is loaded or not
When user clicks on Restaurants option
And user enters the location '<Search>' in the search box
And user press Enter Key.
Then user verifies whether the error message is displayed or not
And user closes the browser
Examples: 
|Search|
|gtyrr|