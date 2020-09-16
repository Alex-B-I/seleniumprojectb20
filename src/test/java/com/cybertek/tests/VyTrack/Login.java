package com.cybertek.tests.VyTrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
        public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://qa2.vytrack.com/user/login");

            Thread.sleep(1000);
            driver.findElement(By.id("prependedInput")).sendKeys("user161");
            Thread.sleep(1000);
            driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123" + Keys.ENTER);
            Thread.sleep(2000);
            driver.findElement(By.id("user-menu")).click();
            Thread.sleep(1000);


            //driver.findElement(By.linkText("Logout")).click();
            //Thread.sleep(1000);
            //driver.close();
        }
    }


