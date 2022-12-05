package StepDefinition;

import static org.testng.Assert.assertEquals;

import Pages.RoadTrip;
import Pages.SearchRestaurants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screenshot.CaptureScreenshot;

public class SearchRestaurantsStepDefinition 
{
	@When("user clicks on Restaurants option")
	public void user_clicks_on_restaurants_option() 
	{
	   SearchRestaurants.clickRestaurants();
	}

	@And("user enters the location {string} in the search box")
	public void user_enters_the_location_in_the_search_box(String string) 
	{
	    SearchRestaurants.searchLocation(string);
	}

	@And("user press Enter Key.")
	public void user_press_enter_key() 
	{
	    SearchRestaurants.pressEnter();
	}

	@Then("user verifies the search result is displayed on the next page")
	public void user_verifies_the_search_result_is_displayed_on_the_next_page() 
	{
		try {
			String title = SearchRestaurants.checkPage();
			assertEquals(title, "THE 10 BEST Restaurants in Chennai (Madras) - Updated August 2022 - Tripadvisor");
			CaptureScreenshot.screenShot(this.getClass().getSimpleName());
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	@And("user select restaurants of user's choice")
	public void user_select_restaurants_of_user_s_choice() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
