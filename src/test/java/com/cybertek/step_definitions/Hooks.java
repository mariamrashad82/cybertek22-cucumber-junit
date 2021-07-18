package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    //Import from io.cucumber.java not from junit
   @Before (value = "login",order = 1)
    public void setUpLoginScenario(){
        System.out.println("______set up browser with further________ ");

    }
    @Before
    public void setUpScenario(){
        System.out.println("______set up browser with further________ ");
        }




    @After
    public void tearDownScenario(Scenario scenario){
       //scenario class come from selenium
    // scenario.isFailed();

        if(scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());

        }

        System.out.println("__________tear down steps are being applied__________");
        //  Driver.closeDriver();
    }



    @BeforeStep
    public void setupStep(){
        System.out.println("_________setUp applying for each step_________");
    }

    @AfterStep
    public void afterSetUp(){
        System.out.println("________tear down applying for each step__________");
    }
}
