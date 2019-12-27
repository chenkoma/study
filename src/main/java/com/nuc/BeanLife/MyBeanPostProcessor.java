package com.nuc.BeanLife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author koma 20:51 2019-07-29
 * @desc
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第九步，postProcessAfterInitialization方法被调用");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第六步，postProcessBeforeInitialization方法被调用");
        System.out.println("第六步，" + bean + "被创建的时间为：" + new java.util.Date());
        /**
         * 在这里，能做的事情可不止上面的这么简单的一句输出了，它还可以过滤每个对象的ip，还可以给所有对象添加对象或者函数，总之就是所有对象。
         * 其实这里体现了aop的编程思想，aop呢就是面向切面编程（针对所有对象编程）
         */

        return null;
    }
}
