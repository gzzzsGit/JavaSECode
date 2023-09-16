package com.atguigu05._super.exer3;

/**
 * className: Account
 * Package : com.atguigu05._super.exer3
 * Description:
 *1、写一个名为Account的类模拟账户。该类的属性和方法如下图所示。
 * 该类包括的属性：账号id，余额balance，年利率annualInterestRate；
 * 包含的方法：访问器方法（getter和setter方法），返回月利率的方法getMonthlyInterest()，取款方法withdraw()，存款方法deposit()。
 * @Author gzzz
 * @Create 2023/8/16 3:00
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amt){
        if (amt>balance){
            System.out.println("余额不足");
        }
        else{
            balance -= amt;
            System.out.println("取款成功");
        }
    }
    public void deposit(double amt){
        if (amt<0){
            System.out.println("输入金额有误");
        }
        else
            balance += amt;
    }
    public double getMonthlyInterest(){
        return annualInterestRate/12;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
}
