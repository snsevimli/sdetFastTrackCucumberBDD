package com.sdetFast.step_definitions;

import com.sdetFast.util.ConfigurationReader;
import com.sdetFast.util.Driver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    WebDriver driver= Driver.getDriver();

    @Before
    public void setup(){

       // driver.get(ConfigurationReader.get("url"));
    }


    @After
    public void quit(){

        driver.close();
    }


}
