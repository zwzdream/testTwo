package com.test.cglibinterceptor;

/**
 * @author WH1707008
 * @date 2018/6/6 17:00
 */
public class TestMouse {
    public static void main(String[] args) {
        Mouse proxy=(Mouse)new AnimalInterceptor().getProxyInstance(new Mouse());
        proxy.say();
    }
}
