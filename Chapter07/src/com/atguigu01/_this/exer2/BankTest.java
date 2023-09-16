package com.atguigu01._this.exer2;

/**
 * className: BankTest
 * Package : com.atguigu01._this.exer2
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/14 16:12
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("xi","ba");
        bank.addCustomer("niu","bi");
        bank.getCustomer(0).setAccount(new Account(10000.0));
        bank.getCustomer(0).getAccount().withdraw(50);
    }
}
