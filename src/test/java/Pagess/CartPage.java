package Pagess;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class CartPage {
    WebDriver driver;

    //Object Repository
    By adoptionBtn = By.xpath("(//input[@class='rounded_button'])[1]");

    //Constructor for Init
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }



    //Implementation Methods
    public void pageValidation(String arg0) {
        String actualString = driver.getCurrentUrl();
        assertTrue(actualString.contains(arg0));
        System.out.println(arg0+" page validation: success");
    }

    public void CompleteAdoption(){
        driver.findElement(adoptionBtn).click();
        System.out.println("");
    }

}
