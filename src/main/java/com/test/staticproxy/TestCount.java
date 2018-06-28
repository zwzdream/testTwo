package com.test.staticproxy;

/**静态代理类：
 * 由程序员创建或特定工具自动生成源代码，再对其编译。
 * 在程序运行前，代理类的.class文件就已经存在了
 * @author WH1707008
 * @date 2018/6/5 10:13
 */
public class TestCount {
    public static void main(String[] args) {
        CountImpl countImpl=new CountImpl();
        CountProxy countProxy=new CountProxy(countImpl);
        countProxy.updateCount();
        countProxy.queryCount();
    }
}
