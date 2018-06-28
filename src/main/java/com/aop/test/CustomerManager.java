package com.aop.test;

/**
 * @author WH1707008
 * @date 2018/6/22 17:07
 */
public interface CustomerManager {
    void addCustomer(String name, String password);

    void deleteCustomer(String name);

    String getCustomerById(int id);

    void updateCustomer(int id, String name, String password);

}
