package com.atguigu04.threadsafemore.deadlock;

/**
 * className: DeadLockTest
 * Package : com.atguigu04.threadsafemore.deadlock
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/21 10:52
 * @Version 1.0
 */
public class DeadLockTest {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();

        new Thread(){
            @Override
            public void run() {
                synchronized (s1){
                    s1.append(1);
                    s2.append("a");

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (s2){
                        s1.append("2");
                        s2.append("b");
                    }

                }
                System.out.println(s1);
                System.out.println(s2);
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                synchronized (s2){
                    s1.append(3);
                    s2.append("c");

                    synchronized (s1){
                        s1.append(4);
                        s2.append("d");
                    }
                    System.out.println(s1);
                    System.out.println(s2);
                }
            }
        }.start();
    }
}
