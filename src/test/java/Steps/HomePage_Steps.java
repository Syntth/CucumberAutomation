//At this moment im not using POM as a design patter since im working on a framework just for newbies
package Steps;

import config.Base;
import io.cucumber.java.en.Given;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

//At this moment im not using POM as a design patter since im working on a framework just for newbies
@RunWith(Cucumber.class)
public class HomePage_Steps {
    public WebDriver driver;

	@Given("User is on Home page")
    public void userIsOnHomePage() throws IOException {
	    driver = Base.getDriver();


    }
}
