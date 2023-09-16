package com.atguigu02.singleton;

/**
 * className: BankTeest
 * Package : com.atguigu02.singleton
 * Description:
 *单例模式：饿汉式
 * @Author gzzz
 * @Create 2023/8/18 23:40
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
    }
}

class Bank{
    //1.类的构造器私有化
    private Bank(){

    }
    //在类的内部创建当前类的实例
    private static Bank instance = new Bank();
    //声明static的get方法
    public static Bank getInstance(){
        return instance;
    }
}