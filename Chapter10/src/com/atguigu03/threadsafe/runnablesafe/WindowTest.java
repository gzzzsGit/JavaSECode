package com.atguigu03.threadsafe.runnablesafe;

/**
 * className: WindowTest
 * Package : com.atguigu03.threadsafe.runnablesafe
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/20 12:15
 * @Version 1.0
 */
public class WindowTest {
    public static void main(String[] args) {
        SaleTicket s = new SaleTicket();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);
        t1.start();
        t2.start();
        t3.start();
    }
}

class SaleTicket implements Runnable{
    int ticket =100;
    boolean isEnd = false;
    @Override
    public void run(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while (isEnd == false){
            show();
        }
    }

    public synchronized void show(){
        if (ticket > 0){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"售票，票号为："+ticket);
            ticket--;
        }
        else{
            isEnd = true;
        }
    }
}