package StepDefinition;

import static org.testng.Assert.assertEquals;

import Pages.RentalCars;
import Pages.Review;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screenshot.CaptureScreenshot;

public class ReviewPageStepDefinition 
{
	@When("user clicks on review option")
	public void user_clicks_on_review_option() {
	    Review.ReviewOption();
	}


	@Then("user enter the data {string} to be reviewed on the search box.")
	public void user_enter_the_data_to_be_reviewed_on_the_search_box(String string) {
	    Review.Searchelement(string);
	}

	@And("press Enter Key")
	public void press_enter_key() {
	    Review.pressEnter();
	}

	@Then("user verifies whether the searched data is displayed or not.")
	public void user_verifies_whether_the_searched_data_is_displayed_or_not() {
		try {
			String title= Review.verify();
			assertEquals(title, " Write a review - Tripadvisor ");
			CaptureScreenshot.screenShot(this.getClass().getSimpleName());
		}catch (Exception e) 
		{
			System.out.println(e.getLocalizedMessage());
		}
	}


}
