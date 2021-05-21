package com.chen.autotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

/**
 * @Date: 11:45 上午 2021/5/10
 * @Desc:
 */
public class BaseDriver {
    public WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

//    @Test
//    public void openExplorer() {}

    @BeforeClass
    public void testBeforeClass() {
        System.out.println("before class---- called");
        SelectDriver select = new SelectDriver();
        driver = select.driverSelect("Chrome");
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void testBeforeMethod() {
        System.out.println("before method ------ called");
    }

    @AfterClass
    public void testAfterClass() {
        System.out.println("after class ------ called");
        driver.close();
    }

    @AfterMethod
    public void testAfterMethod() {
        System.out.println("after method ------- called");
        //driver.close();
    }

}
