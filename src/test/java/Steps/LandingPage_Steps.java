//At this moment im not using POM as a design patter since im working on a framework just for newbies
package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

//At this moment im not using POM as a design patter since im working on a framework just for newbies
@RunWith(Cucumber.class)
public class LandingPage_Steps {
	
	@Given("User is on Net Banking landing page")
    public void user_is_on_net_banking_landing_page() {
        System.out.println("Navigate");
    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_credential(String strArg1, String strArg2) throws Throwable {
        System.out.println("username: "+strArg1);
        System.out.println("password: "+strArg1);
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
