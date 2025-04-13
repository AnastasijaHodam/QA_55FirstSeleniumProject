package com.ait.qa55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstHomeworkTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void openDemowebshopTest() {
        System.out.println("Hi! The test is successful!");
    }

    @Test
    public void findElementById() {
        driver.findElement(By.id("bar-notification"));

    }

    /*
    @Test
    public void findElementBySimpleLocators(){
        //by id
        driver.findElement(By.id("city"));

        //by className
        driver.findElement(By.className("header"));
        System.out.println(driver.findElement(By.className("header")).getText());

     */

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
