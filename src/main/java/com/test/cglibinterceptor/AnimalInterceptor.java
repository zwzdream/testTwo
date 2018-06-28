package com.test.cglibinterceptor;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.sql.SQLOutput;

/**
 * @author WH1707008
 * @date 2018/6/6 16:16
 */
public class AnimalInterceptor implements MethodInterceptor {
    private Object target;
    /**
     * 创建代理对象
     *
     * @param target
     * @return
     */
    public Object getProxyInstance(Object target) {
        this.target = target;
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        //回调方法
        enhancer.setCallback(this);
        //创建代理对象
       return enhancer.create();

    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("------start-------");

        //下面都可以
        Object result=method.invoke(target,objects);
       // Object result=methodProxy.invoke(target,objects);
       // Object result=methodProxy.invokeSuper(o,objects);
        System.out.println("result:"+result);
        System.out.println("-------end--------");
        return result;
    }
}

