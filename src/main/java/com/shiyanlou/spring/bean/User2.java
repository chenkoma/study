package com.shiyanlou.spring.bean;

public class User2 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayBye() {
        System.out.println("bye" + name);
    }
}
