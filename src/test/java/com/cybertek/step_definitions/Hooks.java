package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Before;

import org.junit.After;


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
    public void tearDownScenario(){
        System.out.println("__________tear down steps are being applied__________");
        Driver.closeDriver();
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
