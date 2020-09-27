package com.cybertek.tests.day8_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertsPractices {
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
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

    }


    //TC #1: Information alert practice
    //1. Open browser
    //2. Go to website: http://practice.cybertekschool.com/javascript_alerts
    //3. Click to “Click for JS Alert” button
    //4. Click to OK button from the alert
    //5. Verify “You successfuly clicked an alert” text is displayed

    @Test
    public void p1_information_alert_practice(){

        //Locating the warning/information alert button to click it
        WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']")); ////*[@id="content"]/div/button[1]

        //click to the button
        warningAlertButton.click();

        //1-Create Alert instance and switch to alert
        Alert alert = driver.switchTo().alert();

        //2- Use "alert" instance to accept the javascript alert(popup)
        alert.accept();

        //Locating the result text web element
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //assert "resultText" is displayed
        Assert.assertTrue(resultText.isDisplayed(), "Result text is not displayed. Verification failed!!!");

    }

    //TC #2: Confirmation alert practice
    //1. Open browser
    //2. Go to website: http://practice.cybertekschool.com/javascript_alerts
    //3. Click to “Click for JS Confirm” button
    //4. Click to OK button from the alert
    //5. Verify “You clicked: Ok” text is displayed.

    @Test
    public void p2_confirmation_alert_practice(){
        //Locating the warning/information alert button to click it
        WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));

        //click to the button
        warningAlertButton.click();

        //1-Create Alert instance and switch to alert
        Alert alert = driver.switchTo().alert();

        //We can either accept(), or dismiss() the confirmation alert
        alert.accept();
       // alert.dismiss();

        //Locating the result text web element
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //assert "resultText" is displayed
        Assert.assertTrue(resultText.isDisplayed(), "Result text is not displayed. Verification failed!!!");

    }

    //TC #3: Information alert practice
    //1. Open browser
    //2. Go to website: http://practice.cybertekschool.com/javascript_alerts
    //3. Click to “Click for JS Prompt” button
    //4. Send “hello” text to alert
    //5. Click to OK button from the alert
    //6. Verify “You entered: hello” text is displayed.
    @Test
    public void p3_information_alert_practice(){
        //Locating the warning/information alert button to click it
        WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));

        //click to the button
        warningAlertButton.click();

        //1-Create Alert instance and switch to alert
        Alert alert = driver.switchTo().alert();

        //We can either .accept(), or .dismiss() or .sendKeys("Hi") the confirmation alert
        alert.sendKeys("Hi");
        alert.accept();
        // alert.dismiss();

        //Locating the result text web element
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //assert "resultText" is displayed
        Assert.assertTrue(resultText.isDisplayed(), "Result text is not displayed. Verification failed!!!");



    }


}
