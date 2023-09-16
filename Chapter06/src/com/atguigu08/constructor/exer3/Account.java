package com.atguigu08.constructor.exer3;

/**
 * className: Acoount
 * Package : com.atguigu08.constructor.exer3
 * Description:
 *1、写一个名为Account的类模拟账户。该类的属性和方法如下图所示。
 * 该类包括的属性：账号id，余额balance，年利率annualInterestRate；
 * 包含的构造器：自定义
 * 包含的方法：访问器方法（getter和setter方法），取款方法withdraw()，存款方法deposit()。
 * 提示：在提款方法withdraw中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。
 * @Author gzzz
 * @Create 2023/8/13 15:00
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public void setId(int ID){
        id = ID;
    }

    public int getId(){
        return id;
    }


    public void setBalance(int b){
        balance = b;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double a){
        annualInterestRate = a;
    }

    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }


    public void withdraw(double money) {
        if (balance < money) {
            System.out.println("余额不足，取款失败");
            return;
        }
        balance -= money;
        System.out.println("成功取出： "+money+"元");
    }
    public void deposit(double money){
        balance += money;
        System.out.println("成功存入： "+money+"元");
    }


}
