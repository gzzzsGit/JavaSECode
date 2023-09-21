package com.atguigu03.threadsafe.exer;

/**
 * className: exer1
 * Package : com.atguigu03.threadsafe.exer
 * Description:
 *银行有一个账户。
 * 有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。
 * 问题：该程序是否有安全问题，如果有，如何解决？
 * 【提示】
 * 1，明确哪些代码是多线程运行代码，须写入run()方法
 * 2，明确什么是共享数据。
 * 3，明确多线程运行代码中哪些语句是操作共享数据的。
 * @Author gzzz
 * @Create 2023/9/19 21:05
 * @Version 1.0
 */
public class Exer1 {
    public static void main(String[] args) {
        Account account = new Account();
        Customer c1 = new Customer(account);
        Customer c2 = new Customer(account);
        c1.start();
        c2.start();
    }
}

class Account {
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public synchronized void addBalance(double amt){
        this.balance += amt;
        System.out.println(Thread.currentThread().getName()+":"+getBalance());
    }

    private double balance;
}

class Customer extends Thread{
    Account account;

    public Customer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            account.addBalance(1000);
        }
    }
}