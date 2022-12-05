package StepDefinition;

import static org.testng.Assert.assertEquals;

import Browser.Browser;
import Pages.RentalCars;
import Pages.RoadTrip;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screenshot.CaptureScreenshot;

public class RentalCarsStepDefinition 
{
	@When("user clicks on the more option")
	public void user_clicks_on_the_more_option() 
	{
		RoadTrip.clickMoreOption();	    
	}

	@And("user selects {string} from the drop down list")
	public void user_selects_from_the_drop_down_list(String string) 
	{
	    RentalCars.selectItem(string);
	}

	@Then("user wants to verify whether the rental cars page is loaded or not")
	public void user_wants_to_verify_whether_the_rental_cars_page_is_loaded_or_not() {
		try {
			String title= RentalCars.verify();
			assertEquals(title, "Book Cheap Rental Cars & Search Car Rental Deals - Tripadvisor");
			CaptureScreenshot.screenShot(this.getClass().getSimpleName());
		}catch (Exception e) 
		{
			System.out.println(e.getLocalizedMessage());
		}
	}

	@And("user enters the location {string} and selects location of pick up from the displayed drop down")
	public void user_enters_the_location_and_selects_location_of_pick_up_from_the_displayed_drop_down(String string) {
		RentalCars.pickuplocation(string);
	}

	@And("selects the pickup date and drop date from list")
	public void selects_the_pickup_date_and_drop_date_from_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("selects the number of passengers from the list")
	public void selects_the_number_of_passengers_from_the_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("user clicks on find rental Cars button")
	public void user_clicks_on_find_rental_cars_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user wants to verify whether the user is navigated to next page or not")
	public void user_wants_to_verify_whether_the_user_is_navigated_to_next_page_or_not() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("user selects the car of user choice")
	public void user_selects_the_car_of_user_choice() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
