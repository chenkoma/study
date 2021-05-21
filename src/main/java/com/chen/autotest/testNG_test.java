package com.chen.autotest;

import org.bouncycastle.jce.provider.symmetric.ARC4;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * @Date: 2:18 下午 2021/5/10
 * @Desc:
 */
@Listeners({TestNgListener.class})
public class testNG_test extends BaseDriver {
    @Test
    public void test1() {
        System.out.println("test --------> test1 called");
        driver.get("http://www.imooc.com");
    }

    @Test
    public void test2() {
        System.out.println("test --------> test2 called");
        driver.get("http://www.imooc.com");
    }
}
