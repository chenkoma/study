package com.chen.demo.thread;

/**
 * @author koma 11:32 2020-01-20
 * @desc 测试threadInitNumber初始值
 */
public class TestThreadInitNumber {
//    private static int threadInitNumber;
    private int threadInitNumber;


    public static void  main(String[] args) {
        TestThreadInitNumber t = new TestThreadInitNumber();
        for (int i = 0; i < 10; i++)
            System.out.println(t.threadInitNumber++);

    }
}
