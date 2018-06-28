package com.test.jdkproxy2;

import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * @author WH1707008
 * @date 2018/6/6 11:35
 */
public  class AnimalInvocatonCglib implements InvocationHandler {
    /**
     * 目标对象
     */
    private Object target;

    /**
     * 绑定目标对象
     * @param target
     */
    public void bind(Object target){
        this.target=target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        String methodName=method.getName();
        System.out.println("调用目标对象的方法："+methodName);
        Object returnObject=method.invoke(target,objects);
        return returnObject;
    }

    /**
     * 得到代理对象
     * @return
     */
    public Object generateProxy(){
         return Proxy.newProxyInstance(Thread.class.getClassLoader(),
                 this.target.getClass().getInterfaces(),this);
    }

}
