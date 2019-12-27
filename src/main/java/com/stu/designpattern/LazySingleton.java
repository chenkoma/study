package com.stu.designpattern;
import java.lang.ClassLoader;

/**
 * 该模式特点就是类加载时没有生成单例，只有第一次调用getInstance方法时才会去创建这个单例。
 * 如果编写多线程，则不要删除volatile和synchronized，否则将存线程不安全的问题。如果不删
 * 除这两个关键字就能保证线程安全，但每次访问时都要同步，会影响性能，且消耗更多的资源，这就
 * 懒汉式单例的缺点。
 */

public class LazySingleton {
    private static volatile LazySingleton instance = null;
    private LazySingleton() {}
    public static synchronized LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }


}
