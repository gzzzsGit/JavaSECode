package com.atguigu05.communication;

/**
 * className: Exer1
 * Package : com.atguigu05.communication
 * Description:
 *案例1：使用两个线程打印 1-100。线程1, 线程2 交替打印
 * @Author gzzz
 * @Create 2023/9/22 0:00
 * @Version 1.0
 */
public class Exer1 {
    public static void main(String[] args) {
        PrintNumber p = new PrintNumber();
        Thread t1 =new Thread(p,"线程1");
        Thread t2 = new Thread(p,"线程2");
        t1.start();
        t2.start();

    }
}

class PrintNumber implements Runnable{
    private int number = 1;
    Object obj = new Object();
    @Override
        public void run() {
            while (true){
                synchronized (obj) {
                    obj.notify();//唤醒一个wait的线程
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (number<=100){
                        System.out.println(Thread.currentThread().getName()+':'+number);
                        number++;
                        try {
                            obj.wait();//线程执行到这，阻塞，释放锁
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                else{
                    break;
                }
            }
        }
    }
}