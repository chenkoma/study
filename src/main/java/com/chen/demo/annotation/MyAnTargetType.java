package com.chen.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnTargetType {
    /**
     * 定义注解的一个元素 并给定默认值
     * @return
     */
//    String value()
}
