package com.chen.autotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @Date: 3:31 下午 2021/5/10
 * @Desc:
 */
public class SelectDriver {

    public WebDriver driverSelect(String type) {
        WebDriver driver = null;

        if (type.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
            driver = new ChromeDriver();
        }
        return driver;
    }

}
