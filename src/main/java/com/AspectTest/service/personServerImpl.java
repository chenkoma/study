package com.AspectTest.service;

/**
 * @author koma 20:26 2019-09-19
 * @desc
 */
public class personServerImpl implements personServer {
    @Override
    public void save(String uname, int age) {
        int a = 0;
        age = age/a;
        System.out.println("come in personServerImpl save method...");
    }
}