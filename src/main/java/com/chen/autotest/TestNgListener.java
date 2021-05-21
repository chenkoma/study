package com.chen.autotest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/**
 * @Date: 4:15 下午 2021/5/10
 * @Desc:
 */
public class TestNgListener extends TestListenerAdapter {
    @Override
    public void onTestFailure(ITestResult tr) {
        System.out.println("on test failure");
        BaseDriver base = (BaseDriver) tr.getInstance();
        WebDriver driver = base.getDriver();
        ScreenShot(driver);
        super.onTestFailure(tr);
    }

    private void ScreenShot(WebDriver driver) {
        long curdate = System.currentTimeMillis();
        String path = String.valueOf(curdate) + ".png";
        String curpath = System.getProperty("user.dir");
        System.out.println(curpath);
        path = curpath + "/" + path;
        File Screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(Screen, new File(path));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        System.out.println("on test success");
        BaseDriver base = (BaseDriver) tr.getInstance();
        WebDriver driver = base.getDriver();
        ScreenShot(driver);
        super.onTestSuccess(tr);

    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        System.out.println("on test skipped");
        super.onTestSkipped(tr);
    }
    
    

}
