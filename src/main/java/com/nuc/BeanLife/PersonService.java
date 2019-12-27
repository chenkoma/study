package com.nuc.BeanLife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author koma 17:51 2019-08-09
 * @desc
 */
public class PersonService implements BeanNameAware,BeanFactoryAware, ApplicationContextAware,InitializingBean,DisposableBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步调用set方法");
    }

    public void sayHi() {
        System.out.println("第十步，hi" + name);
    }

    public PersonService() {
        System.out.println("第一步，实例化bean");
    }

    @Override
    public void setBeanName(String arg0) {
        System.out.println("第三步，setBeanName被调用，调用id名为：" + arg0);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) {
        // 该方法可以传递beanFactory
        System.out.println("第四步，setBeanFactory被调用，beanFactory为：" + beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //该方法传递一个ApplicationContext
        System.out.println("第五步，调用setApplicationContext方法："+applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第七步，调用afterPropertiesSet");
    }

    public void init() {
        System.out.println("第八步，调用自已的init方法");

    }

    public void destroy() throws Exception {
        // 关闭数据连接，socket，文件流，释放资源
        System.out.println("第十步，销毁方法（但不建议这种方法释放资源）");
    }

    public void destory() {
        // 看不到
        System.out.println("销毁");
    }
}
