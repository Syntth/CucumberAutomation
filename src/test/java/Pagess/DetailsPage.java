package Pagess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailsPage {
    WebDriver driver;

    //Object Repository
    //By btnText = By.name("Adopt Me!");
    By btnClass = By.className("rounded_button");

    //Constructor
    public DetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Implementation Methods
     public void AdoptMe(){
        driver.findElement(btnClass).click();

     }
}
