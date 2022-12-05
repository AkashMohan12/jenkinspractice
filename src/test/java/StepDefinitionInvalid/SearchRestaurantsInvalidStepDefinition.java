package StepDefinitionInvalid;

import static org.testng.Assert.assertEquals;

import Pages.SearchRestaurants;
import io.cucumber.java.en.Then;
import screenshot.CaptureScreenshot;

public class SearchRestaurantsInvalidStepDefinition 
{
	@Then("user verifies whether the error message is displayed or not")
	public void user_verifies_whether_the_error_message_is_displayed_or_not() 
	{
		try {
			String title = SearchRestaurants.Error();
			assertEquals(title, "Sorry, we couldn't find \"");
			CaptureScreenshot.screenShot(this.getClass().getSimpleName());
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
