package com.ait.qa55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HWTableTest {
    WebDriver driver;
    @BeforeMethod
    public void SetUp(){
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/css/css_table_align.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void findElementTableWithxpathTests(){
        WebElement row1 = driver.findElement(By.xpath("//tr[1]"));
        System.out.println(row1.getText());

        WebElement row2 = driver.findElement(By.xpath("//tr[2]"));
        System.out.println(row2.getText());

        WebElement cell1 = driver.findElement(By.xpath("//td[1]"));
        System.out.println(cell1.getText());

        WebElement cell2 = driver.findElement(By.xpath("//td[2]"));
        System.out.println(cell2.getText());

        WebElement item1 = driver.findElement(By.xpath("//tr[4]/td[2]"));
        System.out.println(item1.getText());

        WebElement title3 = driver.findElement(By.xpath("//th[3]"));
        System.out.println(title3.getText());

    }
}
