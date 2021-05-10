package com.chen.autotest;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @Date: 2:49 下午 2021/5/10
 * @Desc:
 */
public class TestChromeDriver {
    public WebDriver driver;
    String baseUrl = "http://www.baidu.com/";

    @Test
    public void testBaiduSearch() {
        driver.get(baseUrl);
        WebElement inputBox = driver.findElement(By.id("kw"));
        Assert.assertTrue(inputBox.isDisplayed());
        inputBox.sendKeys("csdn");
        driver.findElement(By.id("su")).click();
    }

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void afterMethod() {
//        driver.quit();
    }
}
