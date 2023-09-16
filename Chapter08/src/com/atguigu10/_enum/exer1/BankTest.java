package com.atguigu10._enum.exer1;

/**
 * className: BankTest
 * Package : com.atguigu10._enum.exer1
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/25 2:20
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {

    }
}
class Bank{
    private Bank(){};
    private static final Bank bank = new Bank();

}

enum Bank1{
    CPB;
}