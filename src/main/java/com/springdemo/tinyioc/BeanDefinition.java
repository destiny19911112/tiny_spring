package com.springdemo.tinyioc;

/**
 * @author xiongxl
 * @version $Id: BeanDefinition.java, v 0.1 2020-06-03 Exp $$
 * @desc Bean 定义器
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
