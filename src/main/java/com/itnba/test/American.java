package com.itnba.test;

/**
 * @author koma 17:38 2019-09-18
 * @desc
 */
public class American implements IHuman {
    @Override
    public void chifan() {
        System.out.println("美国人吃饭");
    }

    @Override
    public void shuijiao() {
        System.out.println("美国人睡觉");
    }
}
