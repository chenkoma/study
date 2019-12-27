package com.linjie.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author koma 20:26 2019-08-28
 * @desc bean的后置处理器，分别在bean初始化前后对bean对象提供自已实例化逻辑
 * postProcessAfterInitialization:初始化之后对bean进行增强处理
 * postProcessBeforeInitialization:初始化之前对bean进行增强处理
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    /**
     * 对初始化之后的bean进行处理
     * @param bean 即将初始化的bean
     * @param beanName bean的名称
     * @return 返回给用户的那个bean,可以修改bean也可以返回一个新的bean
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization (Object bean, String beanName) throws BeansException {
        Student stu = null;
        System.out.println("对初始化之后的bean进行处理,将bean的成员变量的值修改了");
        if( "name".equals(beanName) || bean instanceof Student) {
            stu = (Student) bean;
            stu.setName("Jack");
        }
        return stu;
    }

    /**
     * 对初始化之前的bean进行处理
     * @param bean
     * @param beanName
     * @return 返回用户的那个bean,可以修改bean也可以返回一个新bean
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("对初始化之前的bean进行处理,此时我的名字" + bean);
        return bean;
    }
}
