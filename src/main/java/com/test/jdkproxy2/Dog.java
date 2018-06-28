package com.test.jdkproxy2;

/**
 * @author WH1707008
 * @date 2018/6/6 10:17
 */
public class Dog implements  Animal{
    @Override
    public String eat(String str) {
        System.out.println("我在吃"+str);
        return "我吃了"+str;
    }

    @Override
    public String sleep(String str) {
        System.out.println(str+",我在睡觉");
        return str+",我起床了";
    }

    @Override
    public String exercise(String doSomething, String time) {
        System.out.println("我想去游泳");
        String s="我要"+doSomething+time;
        return s;
    }
}
