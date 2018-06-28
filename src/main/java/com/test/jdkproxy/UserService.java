package com.test.jdkproxy;

/**
 * 创建业务接口，包含业务可以提供对外的接口
 * @author WH1707008
 * @date 2018/6/5 10:25
 */
public interface UserService {
    /**
     * 目标方法
     */
    void add();

    String print(String str);
}
