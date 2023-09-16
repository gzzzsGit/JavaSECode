package com.atguigu01._this.exer2;

/**
 * className: Account
 * Package : com.atguigu01._this.exer2
 * Description:
 *1、按照UML类图，创建Account类，提供必要的结构。
 * - 在提款方法withdraw()中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。
 * - deposit()方法表示存款。
 * @Author gzzz
 * @Create 2023/8/14 16:01
 * @Version 1.0
 */
public class Account {
    private double balance;

    public Account(double initBalance){
        balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt){
        balance += amt;
    }

    public void withdraw(double amt){
        if (balance>=amt){
            balance-=amt;
            System.out.println("取款成功,取出： "+amt+"元");
        }
        else
            System.out.println("余额不足");
    }
}
