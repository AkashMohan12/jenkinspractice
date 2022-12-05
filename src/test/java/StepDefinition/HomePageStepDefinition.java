package StepDefinition;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import Browser.Browser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screenshot.CaptureScreenshot;
//import screenshot.CaptureScreenshot;

public class HomePageStepDefinition {
	@Given("user open the browser")
	public void user_open_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();

		 try 
		 { Browser.openBrowser(); assertTrue(Browser.driver!=null); 
		 }catch
		 (Exception e) { System.out.println(e.getLocalizedMessage()); }
		 
	}

	@When("user enters the URL {string}")
	public void user_enters_the_url(String string) {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		Browser.getURL(string);
	}

	@Then("user wants to verify whether the page is loaded or not")
	public void user_wants_to_verify_whether_the_page_is_loaded_or_not() throws Exception {

		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		try {
			String title= Browser.getTitle();
			assertEquals(title, "Tripadvisor: Over a billion reviews & contributions for Hotels, Attractions, Restaurants, and more");
			CaptureScreenshot.screenShot(this.getClass().getSimpleName());
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		 
	}

	@And("user closes the browser")
	public void user_closes_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();

		Browser.closeBrowser();
	}

}
