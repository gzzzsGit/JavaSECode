package com.atguigu05.objectstream;

import java.io.Serializable;

/**
 * className: Person
 * Package : com.atguigu05.objectstream
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/11 0:08
 * @Version 1.0
 */
public class Person implements Serializable {
    private int age;
    private String name;
    private Account account;

    private static final long serialVersionUID = 45461354L;


    public Person(int age, String name, Account account) {
        this.age = age;
        this.name = name;
        this.account = account;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}

class Account implements Serializable{
    int balance;
    static final long serialVersionUID = 4397465L;
    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Account(int balance) {
        this.balance = balance;
    }

    public Account() {
    }

}
