package com.aop.test;

/**
 * @author WH1707008
 * @date 2018/6/22 17:14
 */
public class CustomerManagerImpl implements CustomerManager{
    @Override
    public void addCustomer(String name, String password) {
        System.out.print("加入了客户： "+name+"密码是： "+password);
    }

    @Override
    public void deleteCustomer(String name) {
        System.out.println("删除了客户： "+name);
    }

    @Override
    public String getCustomerById(int id) {
        System.out.println("找到了用户");
        return "dfy";
    }

    @Override
    public void updateCustomer(int id, String name, String password) {
        System.out.println("更改了用户基本信息");
    }
}
