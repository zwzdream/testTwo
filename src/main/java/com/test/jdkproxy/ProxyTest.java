package com.test.jdkproxy;

import org.junit.Test;

/**
 * @author WH1707008
 * @date 2018/6/5 12:07
 *JDK动态代理
 * 特点：只能对实现了接口的类生产代理，不能针对类
 */
public class ProxyTest {
    @Test
    public void testProxy(){
        //实例化目标对象
        UserService userService = new UserServiceImpl();
        System.out.println("接口调用");
        userService.add();
        userService.print("uuid001");

        //实例化Invocation
        MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);

        //根据目标生成代理对象
        UserService proxy = (UserService) invocationHandler.getProxy();

        System.out.println("代理方法调用");
        //调用代理对象方法
        proxy.add();
        String s=proxy.print("uuid002");
        System.out.println(s);
    }
}
