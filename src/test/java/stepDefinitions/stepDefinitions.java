package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinitions {
	
	@Given("^User is on Net Banking landing page$")
    public void user_is_on_net_banking_landing_page() throws Throwable {
        System.out.println("Navigate");
    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_credential(String strArg1, String strArg2) throws Throwable {
        System.out.println("Login");
    }

    @Then("^Homepage is populated$")
    public void homepage_is_populated() throws Throwable {
        System.out.println("Populate");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        System.out.println("Display");
    }

}
