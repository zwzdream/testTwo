package com.test.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**自定义简单的Invocation，对接口提供的方法进行增强
 * @author WH1707008
 * @date 2018/6/5 10:38
 */
public class MyInvocationHandler implements InvocationHandler {
    /**
     *目标对象
     */
    private Object target;

    /**
     * 构造函数
     * @param target 目标对象
     */
    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 执行目标对象的方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //在目标方法执行前简单打印一下
        System.out.println("------before--------");
        //执行目标方法对象
        //System.out.println(method.getName());
        Object result=method.invoke(target,args);

        //在目标方法执行之后简单打印一下
        System.out.println("----------after----------");

        return result;
    }

    /**
     * 获得目标对象的代理对象
     * @return 代理对象
     */
    public Object getProxy(){
        return Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(),
                this.target.getClass().getInterfaces(), this);
    }

}
