package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\t\tThis is coming from BEFORE");
    }

    @After
    public void ternDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        Driver.closeDriver();
    }

    @Before("@DB")
    public void setUpDB(){
        System.out.println("\t\tconnecting to database...");
    }

    @After("@DB")
    public void closeDB(){
        System.out.println("\t\tdisconnecting to database...");
    }
}
