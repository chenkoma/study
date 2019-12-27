package com.linjie.cycle;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author koma 10:29 2019-08-27
 * @desc 一个学生类(bean),能体现其生命周期的bean
 */
public class Student implements BeanNameAware {
    private String name;

    public Student() {
        super();
        System.out.println("初始化");
    }

    /**
     * 设置对象属性
     * @param name
     */
    public void setName(String name) {
        System.out.println("设置对象属性setName()..");
        this.name = name;
    }

    // bean初始化方法
    public void initStudent() {
        System.out.println("Student的这个Bean：初始化");
    }

    // bean销毁方法
    public void destroyStudent() {
        System.out.println("Student的这个Bean：销毁");
    }

    // bean的使用
    public void play() {
        System.out.println("Student的这个Bean：使用");
    }

    /**
     * 重写toString方法
     * @return
     */
    @Override
    public String toString() {
        return "Student [name =" + name + "]";
    }

    /**
     * 调用BeanNameAware的setBeanName(),传递bean的id
     * @param name
     */
    @Override
    public void setBeanName(String name) {
        System.out.println("调用BeanAware的setBeanName()..");
    }
}
