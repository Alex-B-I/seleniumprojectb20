package com.cybertek.tests.VyTrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class EditVehicleOdometer {

    public static void main(String[] args) throws InterruptedException {
//AC#3.Verify that truck driver should be able to edit Vehicle odometer.

//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//        2. Go to https://qa2.vytrack.com/user/login
        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();

//        3. Truck driver enter valid username
        //Thread.sleep(1000);
        driver.findElement(By.id("prependedInput")).sendKeys("user161");
//        4. Truck driver enter valid password
       // Thread.sleep(1000);
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123" + Keys.ENTER);

//        5. Truck driver navigate "Fleet" module and click "Vehicle Odometers" sub module
        Thread.sleep(2000);
        //driver.findElement()
        driver.findElement(By.className("unclickable")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Vehicle Odometer")).click();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[@title='Grid Settings']")).click();

//       6. Truck driver navigate "..." module and click "edit" sub module

       Actions action = new Actions(driver);
        WebElement dropdown = driver.findElement(By.xpath("(//*[@class='action-cell grid-cell grid-body-cell'])[1]"));
       action.moveToElement(dropdown).perform();
        Thread.sleep(3000);
        WebElement edit = driver.findElement(By.xpath("//a[@title=\"Edit\"]"));
        edit.click();

//       7. Truck driver enter the Odometer Value
        Thread.sleep(2000);
        WebElement fieldOdometerValue = driver.findElement(By.xpath("//*[@data-name='field__odometer-value']"));
        Thread.sleep(1000);
        fieldOdometerValue.clear();
        Thread.sleep(1000);
        fieldOdometerValue.sendKeys("7777");
        Thread.sleep(1000);

//       8. Truck driver Choose a date value and click today data
        WebElement fieldData = driver.findElement(By.xpath("//*[@placeholder='Choose a date']"));
        Thread.sleep(1000);
        fieldData.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        fieldData.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(1000);
        //fieldData.sendKeys("Oct 15, 2020");
        //fieldData.sendKeys(Keys.ENTER);
        // driver.findElement(By.id("ui-datepicker-div")).click();
        Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@data-handler='today']")).click();

//       9. Truck driver enter the Driver value
        Thread.sleep(1000);
        WebElement fieldDriver = driver.findElement(By.xpath("//*[@data-name='field__driver']"));
        Thread.sleep(1000);
        fieldDriver.sendKeys(Keys.BACK_SPACE);
        fieldDriver.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(1000);
        fieldDriver.sendKeys("77");
        Thread.sleep(1000);

//       10. Truck driver enter the Unit value
        WebElement fieldUnit = driver.findElement(By.xpath("//*[@onclick='return false;']"));
        fieldUnit.click();
        Thread.sleep(1000);
        WebElement fieldKm = driver.findElement(By.xpath("//*[@class='select2-results-dept-0 select2-result select2-result-selectable']"));
        fieldKm.click();
        Thread.sleep(1000);


//       11. Truck driver click on the “Save and Close” button.
        WebElement buttonSaveAndClose = driver.findElement(By.xpath("//*[@type='submit']"));
        buttonSaveAndClose.click();
        Thread.sleep(1000);

 //       12. Truck driver see the confirmation message that the vehicle odometer edited.

        String expectedMassage = "Entity saved";
        String actualMassage = driver.findElement(By.xpath("//*[@class='message']")).getText();
        Assert.assertEquals(expectedMassage,actualMassage,"Title are not matching!!");








       // driver.findElement(By.tagName())


       // driver.findElement(By.id("user-menu")).click();
       // Thread.sleep(1000);
        //driver.findElement(By.linkText("Logout")).click();
        //Thread.sleep(1000);
        //driver.close();
    }


}
