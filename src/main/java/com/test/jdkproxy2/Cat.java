package com.test.jdkproxy2;

/**
 * @author WH1707008
 * @date 2018/6/6 11:12
 */
public class Cat implements Animal {
    @Override
    public String eat(String str) {
        System.out.println(str);
        return "eat";
    }

    @Override
    public String sleep(String str) {
        System.out.println(str);
        return null;
    }

    @Override
    public String exercise(String doSomething, String time) {
        System.out.println(doSomething+time);
        return null;
    }
}
