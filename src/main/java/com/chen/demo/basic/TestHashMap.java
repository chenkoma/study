package com.chen.demo.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author koma 16:21 2019-12-30
 * @desc
 */
public class TestHashMap {
    private String code;
    private String name;

    @Override
    public int hashCode() {
        return code.hashCode() + name.hashCode();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return code.toString() + name.toString();
    }

    public static void main(String[] args) {
        Map<TestHashMap, String> map = new HashMap<>();
        TestHashMap a = new TestHashMap();
        a.setCode("123");
        a.setName("456");
        map.put(a, "test1");
        System.out.println(map);

        a.setCode("789");
        map.put(a, "test2");
        System.out.println(map);

        ArrayList list = new ArrayList();
        for( int i=0;i <10;i++ ) //给数组增加10个Int元素
            list.add(i);
        list.remove(0);





    }
}
