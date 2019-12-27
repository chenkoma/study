package com.stu.designpattern;


/**
 * 该模式的特点就是一旦加载就新建一个单例，保证在调用getInstance方法之前单例已经存在了。
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();
    private HungrySingleton() {}
    public static HungrySingleton getInstance() {
        return instance;
    }

}
