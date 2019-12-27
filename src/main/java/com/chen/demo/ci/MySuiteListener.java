package com.chen.demo.ci;

import org.testng.ISuite;
import org.testng.ISuiteListener;

/**
 * @author koma 11:26 2019-07-25
 * @desc
 */
public class MySuiteListener implements ISuiteListener {
    @Override
    public void onStart(ISuite iSuite) {
        System.out.println("suite start!");
    }

    @Override
    public void onFinish(ISuite iSuite) {
        System.out.println("suite finish");
    }
}
