package com.test.jdkproxy;

/**
 * 创建业务接口实现类
 * @author WH1707008
 * @date 2018/6/5 10:35
 */
public class UserServiceImpl implements UserService {
    /**
     * 目标方法
     */
    @Override
    public void add() {
        System.out.println("--------add------------");
    }
    @Override

    public String print(String str) {
        System.out.println("--------print------------"+str);
        return str;
    }
}
