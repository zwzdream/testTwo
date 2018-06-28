package com.test.staticproxy;

/**
 * 委托类(包含业务逻辑)
 * @author WH1707008
 * @date 2018/6/5 9:57
 */
public class CountImpl implements Count {
    @Override
    public void queryCount() {
        System.out.println("查看账户的方法...");
    }

    @Override
    public void updateCount() {
        System.out.println("修改账户的方法...");
    }
}
