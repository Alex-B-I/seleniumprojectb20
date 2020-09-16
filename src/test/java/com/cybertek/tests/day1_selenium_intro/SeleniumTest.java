package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException{ //for "Thread" need add in main method "throws InterruptedException"

        //1- Setup the driver
        WebDriverManager.chromedriver().setup();

        //==================================================
        // System.setProperty("driver.type","path to the driver");
        // System.setProperty("webdriver.chrome.driver","path to the driver");
        //==================================================

        //2- Create instance of the driver
        WebDriver driver = new ChromeDriver();//This line is opening me browser
        //3- Use the driver instance to test selenium

        //manage().window().maximize()_____
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        // getTitle()______________

        System.out.println("The title of the page is: "+driver.getTitle());
        String actualTitle = driver.getTitle();
        System.out.println("ACTUAL TITLE STRING: "+actualTitle);

        //getCurrentUrl()___________

        String actualURL = driver.getCurrentUrl();
        System.out.println("Actual URL: "+actualURL);

       // actualURL.soutv
       // System.out.println("actualURL = " + actualURL);

        Thread.sleep(1000);
        //weight two seconds

        //navigate().back()_____________
        driver.navigate().back();

        Thread.sleep(1000);

        //navigate().forward()__________
        driver.navigate().forward();

        Thread.sleep(1000);

        //navigate().refresh()__________
        driver.navigate().refresh();

        Thread.sleep(1000);

        //navigate().to()______________
        driver.navigate().to("https://facebook.com");
       // driver.navigate().to("https://youtube.com");
       // driver.navigate().to("https://yahoo.com");
       // driver.navigate().to("https://bing.com");

        // getPageSource()______________
        String pageSource = driver.getPageSource();
        System.out.println("Page Source = " + pageSource);

        driver.close();




    }
}
