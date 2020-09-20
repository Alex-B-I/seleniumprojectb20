package com.cybertek.tests.day6_dropdown_review_javafaker;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class DropdownTasks {

    WebDriver driver;

   @BeforeMethod
    public void setupMethod(){

       // open a new browser
       driver = WebDriverFactory.getDriver("chrome");
       //maximize the page
       driver.manage().window().maximize();
       //implicit wait
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       //get the page
       driver.get("http://practice.cybertekschool.com/dropdown");

   }


}
