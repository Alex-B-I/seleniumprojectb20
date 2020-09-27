package com.cybertek.tests.day8_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice {
    //TC #4 : Iframe practice
    //1. Create a new class called: IframePractice
    //2. Create new test and make set ups
    //3. Go to: http://practice.cybertekschool.com/iframe
    //4. Assert: “Your content goes here.” Text is displayed.
    //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor

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
        driver.get("http://practice.cybertekschool.com/iframe");

    }

    @Test
    public void p4_iframe_practice(){

    }




}
