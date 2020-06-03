package com.springdemo;

import com.springdemo.tinyioc.BeanDefinition;
import com.springdemo.tinyioc.BeanFactory;
import org.junit.Test;

/**
 * @author xiongxl
 * @version $Id: BeanFactoryTest.java, v 0.1 2020-06-03 Exp $$
 * @desc Bean工厂 测试类
 */
public class BeanFactoryTest {

    @Test
    public void test() {
        // 初始化 beanfactory
        BeanFactory beanFactory = new BeanFactory();

        // 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new HelloSpringIoc());
        beanFactory.registerBeanDefinition("helloSpringIoc", beanDefinition);

        // 获取bean
        HelloSpringIoc helloSpringIoc = (HelloSpringIoc) beanFactory.getBean("helloSpringIoc");
        helloSpringIoc.helloSpringIoc();
    }
}
