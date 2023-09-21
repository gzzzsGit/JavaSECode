package com.atguigu04.threadsafemore.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * className: LockTest
 * Package : com.atguigu04.threadsafemore.lock
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/21 11:24
 * @Version 1.0
 */
public class LockTest {
    public static void main(String[] args) {
        SaleTicket1 t1 = new SaleTicket1();
        SaleTicket1 t2 = new SaleTicket1();
        SaleTicket1 t3 = new SaleTicket1();
        t1.start();
        t2.start();
        t3.start();
    }
}

class SaleTicket1 extends Thread{

    static int ticket =100;
    //创建LOCK的实例，需要确保多个线程共用同一个Lock实例
    private static final ReentrantLock LOCK= new ReentrantLock();
    static boolean isEnd = false;
    @Override
    public void run(){
        while (isEnd == false){

            show();
        }
    }
    public static void show(){
        try {
            LOCK.lock();
            if (ticket > 0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+"售票，票号为："+ticket);
                ticket--;
            }
            else{
                isEnd = true;
            }
        } finally {
            LOCK.unlock();
        }
    }
}