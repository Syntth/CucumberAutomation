package Pagess;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HomePage {
    WebDriver driver;


    //Object Repository
    By btnXpath = By.xpath("(//input[@class='rounded_button'])[1]");
    By nextPage = By.className("next_page");
    By puppies = By.xpath("//*[@class='puppy_list']");


    //Constructor for Init
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Implementation Methods
    public void selectPuppy(){
        driver.findElement(btnXpath).click();
        String actualString = driver.getCurrentUrl();
        assertTrue(actualString.contains("puppies"));
        System.out.println("page validation: success");
    }

    public void validateMenu(String txtMenu){
        WebElement optMenu = driver.findElement(By.xpath("//a[contains(text(), '"+txtMenu+"')]"));
        assertTrue(optMenu.isDisplayed());
        System.out.println(optMenu);
    }

    public void puppyListValidation() throws InterruptedException {

        List<WebElement> cont =driver.findElements(nextPage);
        int size = cont.size();
        for (int i = 0; i <= size; i++){
            List<WebElement> elements =driver.findElements(puppies);

            for (WebElement webElement : elements){
                String name = webElement.getText();
                System.out.println("Puppy Details: " + name + "\n");
                Thread.sleep(1000);
            }

            driver.findElement(nextPage).click();
        }



    }


}
