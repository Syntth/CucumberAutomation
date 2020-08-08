package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base {
    //Set new WebDriver
    public static WebDriver driver;
    public static Properties prop;


    public static WebDriver getDriver() throws IOException {
        //Driver Init
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\IdeaProjects\\CucumberAutomation\\src\\test\\resources\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        //Read Global Properties file
        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\ADMIN\\IdeaProjects\\CucumberAutomation\\src\\main\\java\\config\\global.properties");
        prop.load(fis);
        driver.get(prop.getProperty("BaseURL"));

        return driver;
    }
}
