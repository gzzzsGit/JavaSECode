package com.atguigu03.threadsafe.notsafe;

/**
 * className: WindowTest
 * Package : com.atguigu03.threadsafe.notsafe
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/19 21:05
 * @Version 1.0
 */
public class WindowTest {
    public static void main(String[] args) {
        saleTicket s = new saleTicket();

        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);
        t1.start();
        t2.start();
        t3.start();
    }
}

class saleTicket implements Runnable{
    int tickets = 100;
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (this) {
                if (tickets>0){
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName()+':'+"卖出第"+tickets+"张票");
                    tickets--;
                }
                else {
                    break;
                }
            }
        }
    }
}
