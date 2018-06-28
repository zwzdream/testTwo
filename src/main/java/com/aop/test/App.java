package com.aop.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author WH1707008
 * @date 2018/6/22 17:31
 */
public class App {
    public static void main( String[] args )
    {
        System.out.println( "Hello Spring AOP!" );
        BeanFactory factory=new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerManager customerManager=(CustomerManager) factory.getBean("customerManager");
        customerManager.getCustomerById(2015);




    }
}
