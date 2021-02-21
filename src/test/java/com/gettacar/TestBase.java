package com.gettacar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.gettacar.com/");
    }

    public void chooseYourCarButton() {
        driver.findElement(By.cssSelector("a[href='/used']")).click();
    }

    public void chooseBodyTypeButton() {
        driver.findElement(By.xpath("//*[contains(text(),'Body type')]")).click();
    }

    public void chooseBodyTypePickUp() {
        driver.findElement(By.xpath("//*[contains(text(),'Pickup')]")).click();
    }

    public void chooseFirstElementFromResult() {
        driver.findElement(By.cssSelector(".car-card_car-card__19FY8:first-child")).click();
    }

    public String checkPrice(int highPrice) {
        String result = "";
        String price = driver.findElement(By.cssSelector("[class^='price-box-details_carPrice']")).getText();
        int priceInNumbers = Integer.parseInt(price.replaceAll("[^\\d.]+", ""));
        if (priceInNumbers > highPrice) {
            result = "High";
        } else {
            result = "Low";
        }
        System.out.println(result);
        return result;
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }
}
