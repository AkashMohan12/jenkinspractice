package StepDefinition;

import static org.testng.Assert.assertEquals;
import Pages.RoadTrip;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import screenshot.CaptureScreenshot;

public class RoadTripsStepDefinition 
{
	@Then("user wants to verify whether user is navigated to next page or not")
	public void user_wants_to_verify_whether_user_is_navigated_to_next_page_or_not() 
	{
		try {
			String title = RoadTrip.verify();
			assertEquals(title, "The Best Road Trips in America - Tripadvisor");
			CaptureScreenshot.screenShot(this.getClass().getSimpleName());
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	@And("user selects the road trip of user's choice")
	public void user_selects_the_road_trip_of_user_s_choice() {
	    RoadTrip.selectRoute();
	}
}
