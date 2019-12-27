package com.shiyanlou.spring.bean;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    public User2 user2;

    private User(String name) {}
    public User() {}
    public User(String name, User2 user2) {
        super();
        this.name = name;
        this.user2 = user2;
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public User2 getUser2() {
         return user2;
     }

     public void setUser2(User2 user2) {
         this.user2 = user2;
     }

     public void sayHello() {
         System.out.println("hello" + name);
         user2.sayBye();
     }
}
