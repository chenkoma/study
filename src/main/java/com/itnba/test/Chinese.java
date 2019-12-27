package com.itnba.test;

/**
 * @author koma 17:36 2019-09-18
 * @desc
 */
public class Chinese implements IHuman {
    @Override
    public void chifan() {
        System.out.println("中国人吃饭");
    }

    @Override
    public void shuijiao() {
        System.out.println("中国人睡觉");
    }
}
