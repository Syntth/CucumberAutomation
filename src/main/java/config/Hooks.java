package config;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{
    @Before()
    public void beforeTest(){
        System.out.println("Code Before Test");
    }

    @After
    public void afterTest(){
        System.out.println("Code After Test");
        //driver.close();
    }

}
