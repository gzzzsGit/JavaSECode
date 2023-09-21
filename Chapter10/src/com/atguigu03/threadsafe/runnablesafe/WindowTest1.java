package com.atguigu03.threadsafe.runnablesafe;

/**
 * className: WindowTest1
 * Package : com.atguigu03.threadsafe.runnablesafe
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/20 12:37
 * @Version 1.0
 */
public class WindowTest1 {
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
    static boolean isEnd = false;
    @Override
    public void run(){
        while (isEnd == false){
            show();
        }
    }
    public static synchronized void show(){
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
    }
}
