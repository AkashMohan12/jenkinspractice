package StepDefinitionInvalid;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class RentalCarsInvalidStepDefinition 
{
	@And("user enters the invalid location {string} on the pickup location text box")
	public void user_enters_the_invalid_location_on_the_pickup_location_text_box(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user wants to verify whether the error is shown.")
	public void user_wants_to_verify_whether_the_error_is_shown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
