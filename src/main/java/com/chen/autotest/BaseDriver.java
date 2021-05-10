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

//    public WebDriver GetDriver() {
//        return driver;
//    }

//    @Test
//    public void openExplorer() {}

    @BeforeClass
    public void testbeforeclass(){
        System.out.println("before class---- called");
        SelectDriver select = new SelectDriver();
        driver = select.driverSelect("Chrome");
        driver.manage().window().maximize();

        System.out.println("    选择chrome驱动");
        System.out.println("    窗口最大化");

    }

    @BeforeMethod
    public void testbeforemethod() {
        System.out.println("before method ------ called");

    }

    @AfterClass
    public void testafterclass() {
        System.out.println("after class ------ called");
        driver.close();
        System.out.println("    流览器关闭");
    }

    @AfterMethod
    public void testaftermethod() {
        System.out.println("after method ------- called");
        //driver.close();
    }

}
