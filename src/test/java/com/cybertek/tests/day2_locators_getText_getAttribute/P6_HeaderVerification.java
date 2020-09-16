package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_HeaderVerification {
    public static void main(String[] args) throws InterruptedException {
        //TC #6: Zero Bankheader verification
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();

        //open browser
        WebDriver driver = new ChromeDriver();

        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        // 3.Verify header text
        // Expected: “Log in to ZeroBank”
        //locate the header
        //get the text of the header




        String expectedText = "Log in to ZeroBank";
        String actualText = driver.findElement(By.tagName("h3")).getText();

        if (actualText.equals(expectedText)){
            System.out.println("Header Verification PASSED!");
        }else {
            System.out.println("Header Verification FAILED!!!");
        }

        Thread.sleep(3000);
       //driver.close();







    }
}
