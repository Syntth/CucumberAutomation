//At this moment im not using POM as a design patter since im working on a framework just for newbies
package Steps;

import Pagess.CartPage;
import Pagess.DetailsPage;
import Pagess.HomePage;
import config.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

//At this moment im not using POM as a design patter since im working on a framework just for newbies
@RunWith(Cucumber.class)
public class HomePage_Steps {
    public WebDriver driver;
    HomePage homePage;
    DetailsPage detailsPage;
    CartPage cartPage;


	@Given("User is on Home page")
    public void userIsOnHomePage() throws IOException {
	    driver = Base.getDriver();
    }

    @When("User select a puppy")
    public void userSelectAPuppy() {
        homePage = new HomePage(driver);
        homePage.selectPuppy();
    }

    @When("User click on Adopt Me! button")
    public void UserClickOnAdoptMeButton() {
	    detailsPage = new DetailsPage(driver);
	    detailsPage.AdoptMe();
    }

    @Then("{string} page should be displayed")
    public void cartPageShouldBeDisplayed(String arg0) {
	    cartPage = new CartPage(driver);
	    cartPage.pageValidation(arg0);

    }

    @When("User click on Complete the Adoption button")
    public void userClickOnCompleteTheAdoptionButton() {
	    cartPage.CompleteAdoption();

    }

    @Then("User should see {string} option displayed")
    public void userShouldSeeOptionDisplayed(String txtMenu) {
        homePage = new HomePage(driver);
	    homePage.validateMenu(txtMenu);
    }

    @When("Puppy list should be displayed")
    public void puppyListShouldBeDisplayed() throws InterruptedException {
        homePage = new HomePage(driver);
	    homePage.puppyListValidation();

        }
    }

