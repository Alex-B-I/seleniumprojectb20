package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Warmup_task {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        driver.navigate().to("http://practice.cybertekschool.com");

        String actualURL = driver.getCurrentUrl();
        System.out.println("Actual URL: "+actualURL);

        String Title = driver.getTitle();
        System.out.println("Title = " + Title);


    }
}
