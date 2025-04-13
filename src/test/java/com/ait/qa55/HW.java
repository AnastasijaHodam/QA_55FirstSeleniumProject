package com.ait.qa55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW {
    WebDriver driver;
    @BeforeMethod
    public void SetUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");

    }
    @Test
    public void findElementById(){
        WebElement element1 = driver.findElement(By.id("dialog-notifications-success"));
        System.out.println(element1.getText());
        WebElement element2 = driver.findElement(By.id("dialog-notifications-error"));
        System.out.println(element2.getText());
        driver.findElement(By.id("bar-notification"));
        driver.findElement(By.id("flyout-cart"));
        driver.findElement(By.id("mob-menu-button"));
    }

    @Test
    public void findElementByClassName(){
        driver.findElement(By.className("ico-login"));
        driver.findElement(By.className("bar-notification"));
        driver.findElement(By.className("search-box"));
        driver.findElement(By.className("header-selectors-wrapper"));
        WebElement element3 = driver.findElement(By.className("currency-selector"));
        System.out.println(element3.getText());
    }

    @Test
    public void findElementBycssSelector(){
        driver.findElement(By.cssSelector("#dialog-notifications-success"));
        driver.findElement(By.cssSelector("#dialog-notifications-error"));
        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElement(By.cssSelector("#flyout-cart"));
        driver.findElement(By.cssSelector("#mob-menu-button"));

        driver.findElement(By.cssSelector(".ico-login"));
        driver.findElement(By.cssSelector(".bar-notification"));
        driver.findElement(By.cssSelector(".search-box"));
        driver.findElement(By.cssSelector(".header-selectors-wrapper"));
        driver.findElement(By.cssSelector(".currency-selector"));
    }

    @Test
    public void findElementByXpath(){
        //driver.findElement(By.xpath("//input[@id='dialog-notifications-success']"));
        driver.findElement(By.xpath("//div[@class='ico-login'"));


    }

}
