package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekURLVerification {
    public static void main(String[] args) throws InterruptedException {

        //TC	#2:	Cybertek	verifications
        //1.Open	Chrome	browser
        //I need to setup mu browser driver
        WebDriverManager.chromedriver().setup();

        //To create instance of chrome browser from WebDriver
        WebDriver driver = new ChromeDriver();

        //this line will maximize the newly opened browser page
        driver.manage().window().maximize();

        //2.Go	to	https://practice.cybertekschool.com // If you have error security massage need delete https -->http!!!
        driver.get("http://practice.cybertekschool.com");

        //3. Verify URL	contains
        // Expected:	cybertekschool
        String expectedInUrl = "cybertekschool";
        String actualURL= driver.getCurrentUrl();

        if(actualURL.contains(expectedInUrl)){
            System.out.println("URL verification PASSED!");
        }else {
            System.out.println("URL verification FAILED!");
        }

        //4.Verify	title:
        //Expected:	Practice
     /*
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!");
        }

     */

        /*
        System.out.println(actualTitle.equals("practice")? "Title verification PASSED!" : "Title verification FAILED!");
         */

   //    -->actual title<--    -->expected title<--
        if(driver.getTitle().equals("Practice")){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!");
        }


        Thread.sleep(2000);
        driver.close();
    }
}
