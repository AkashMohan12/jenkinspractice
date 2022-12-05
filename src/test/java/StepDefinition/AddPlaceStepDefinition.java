package StepDefinition;

import static org.testng.Assert.assertEquals;

import Pages.AddPlace;
import Pages.RentalCars;
import io.cucumber.java.en.Then;
import screenshot.CaptureScreenshot;

public class AddPlaceStepDefinition 
{
	@Then("user wants to verify whether the add a place page is loaded or not")
	public void user_wants_to_verify_whether_the_add_a_place_page_is_loaded_or_not() {
		try {
			String title= AddPlace.verify();
			assertEquals(title, "Add a place to Tripadvisor");
			CaptureScreenshot.screenShot(this.getClass().getSimpleName());
		}catch (Exception e) 
		{
			System.out.println(e.getLocalizedMessage());
		}
	}
	
	@Then("User Clicks on list an accommodation")
	public void user_clicks_on_list_an_accommodation() {
	   AddPlace.clickListAccommodation();
	}

	@Then("user click on no option")
	public void user_click_on_no_option() {
	    AddPlace.clickNo();
	}

	@Then("user clicks on continue")
	public void user_clicks_on_continue() {
	   AddPlace.clickContinue();
	}

}
