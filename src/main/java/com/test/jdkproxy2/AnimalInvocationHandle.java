package com.test.jdkproxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author WH1707008
 * @date 2018/6/6 10:29
 */
public class AnimalInvocationHandle implements InvocationHandler {
    /**
     *    代理对象
     */
    private Object target;


    /**
     * 绑定委托类对象（目标对象）
     * @param target
     */

    public AnimalInvocationHandle(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName=method.getName();
        System.out.println("调用委托类对象的方法"+methodName+"之前");
       Object result=method.invoke(target,args);
        System.out.println("调用委托类对象的方法"+methodName+"之后");
        return result;
    }

    /**
     * 获得目标对象（委托类对象）的代理对象
     * @return代理对象
     */
    public Object getProxyObject(){
      return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader()
      ,this.target.getClass().getInterfaces(),this);
    }


}
