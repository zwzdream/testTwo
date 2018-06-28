package com.test.jdkproxy2;

/**
 * @author WH1707008
 * @date 2018/6/6 10:15
 */
public interface Animal {
    /**
     * 吃
     * @param str
     * @return
     */
    String eat(String str);

    /**
     * 睡觉
     * @param str
     * @return
     */
    String sleep(String str);

    /**
     * 运动
     * @param doSomething
     * @param time
     * @return
     */
    String exercise(String doSomething,String time);

}
