package config;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base {
    static WebDriver driver;
    static String chromePath = System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\chromedriver.exe";

    public static WebDriver getDriver() throws IOException {
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", chromePath);
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\ADMIN\\IdeaProjects\\CucumberAutomation\\src\\main\\java\\config\\global.properties");
        prop.load(fis);
        driver.get(prop.getProperty("BaseURL"));

        return driver;
    }

    //Evidence Method incomplete
    public static void takeScreenShot(WebDriver driver, String filePath) throws IOException {
        TakesScreenshot scrShot = (TakesScreenshot)driver;
        File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(filePath);
        FileUtils.copyFile(scrFile,destFile);
    }

    //Set new WebDriver
    /*public static WebDriver driver;
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
    }*/
}
