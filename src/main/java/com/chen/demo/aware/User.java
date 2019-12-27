package com.chen.demo.aware;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author koma 10:48 2019-12-27
 * @desc
 */
public class User implements BeanNameAware {
    private String id;
    private String name;
    private String address;

    @Override
    public void setBeanName(String beanName) {
        id = beanName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + "\'" +
                ", name='" + name + "\'" +
                ", address='" + address + "\'" +
                "}";
    }
}
