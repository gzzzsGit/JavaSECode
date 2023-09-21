package com.atguigu04.threadsafemore.singleton;

/**
 * className: BankTest
 * Package : com.atguigu04.threadsafemore.singleton
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/20 21:47
 * @Version 1.0
 */
public class BankTest {
    static Bank b1 = null;
    static Bank b2 = null;
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                b1 =Bank.getInstance();
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                b2 =Bank.getInstance();
            }
        };
        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1==b2);
    }
}

class Bank {
    public Bank() {
    }

    private static volatile Bank instance = null;

    //实现线程安全的方式一
//    public static synchronized Bank getInstance() {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        if (instance == null){
//            instance = new Bank();
//        }
//        return instance;
//    }

    //实现线程安全的方式二
//    public static Bank getInstance(){
//        synchronized (Bank.class) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            if (instance == null){
//                instance = new Bank();
//            }
//        }
//        return instance;
//    }

    public static Bank getInstance() {
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    instance = new Bank();//可能会出现指令重排问题
                }
            }
        }
        return instance;
    }
}