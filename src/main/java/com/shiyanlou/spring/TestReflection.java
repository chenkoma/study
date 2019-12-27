package com.shiyanlou.spring;

import com.shiyanlou.spring.bean.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射机制是很多java框架的基石，经典的就是在xml文件或者properties里面写好了配置，然后在java类里面
 * 解析xml或properties里面的内容，得到一个字符串，然后用反射机制，根据这个字符串获取某个类的Class实
 * 例，这样就可以动态配置一些东西，spring、hibernate底层都有类似的实现。
 */
public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        //直接通过类名获取class(一般不会这么用,因为实例都获取到了没必要多此一举)
        User user = new User();
        Class class1 = user.getClass();
        System.out.println("反射处理类=" + class1);
        System.out.println("反射处理类的父类" + class1.getSuperclass());
        System.out.println("----------------------------------------------------");

        //通过类名的方法获取class需要增加对应类的引用
        Class class2 = User.class;
        System.out.println("反射处理类=" + class2);
        System.out.println("反射处理类的父类" + class2.getSuperclass());
        System.out.println("----------------------------------------------------");

        //通过全类名获取，用的比较多，也推荐使用这种方式
        Class class3 = Class.forName("com.shiyanlou.spring.bean.User");
        System.out.println("反射处理类=" + class3);
        System.out.println("反射处理类父类=" + class3.getSuperclass());
        System.out.println("----------------------------------------------------");

        //反射获取User对象的公共构造器
        Constructor<User>[] cConstructors = class3.getConstructors();
        for(int i = 0; i < cConstructors.length; i++) {
            System.out.println("公共构造器" + (i+1) + "=" + cConstructors[i]);
        }
        System.out.println("----------------------------------------------------");

        //反射获取User对象所有的构造器
        Constructor<User>[] dConstructors = class3.getDeclaredConstructors();
        for(int i = 0; i < dConstructors.length; i++) {
            System.out.println("所有构造器" + (i+1) + "=" + dConstructors[i]);
        }
        System.out.println("----------------------------------------------------");

        //反射获取User对象的Method对象的数组，这些对象反映此Class对象所表示的类或接口(包括那些由该类
        //或接口声明的以及超接口继承的那些类或接口)的公共member方法
        Method[] methods = class3.getMethods();
        for(int i = 0; i < methods.length; i++) {
            System.out.println("公共方法" + (i+1) + "=" + methods[i]);
        }
        System.out.println("----------------------------------------------------");

        Field[] fields = class3.getFields();
        for(int i = 0; i < fields.length; i++) {
            System.out.println("公共field" + (i+1) + "=" + fields[i]);
        }
        System.out.println("----------------------------------------------------");

        String sName = class3.getSimpleName();
        System.out.println("类名不包含包路径=" + sName);

        String name = class3.getName();
        System.out.println("类名包含包路径=" + name);

        Package packA = class3.getPackage();
        System.out.println("类的包路径=" + packA);

        Class<?>[] interfaces = class3.getInterfaces();
        for(int i = 0; i < interfaces.length; i++) {
            System.out.println("实现的接口" + (i+1) + "=" + interfaces[i]);
        }

    }
}
