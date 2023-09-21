package com.atguigu01.create.runnable;

/**
 * className: EvenNumTest
 * Package : com.atguigu01.create.runnable
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/18 22:17
 * @Version 1.0
 */
public class EvenNumTest {
    public static void main(String[] args) {
        printEvenNum p = new printEvenNum();
        Thread t = new Thread(p);
        t.start();

        //添加一个新线程
        Thread t2 = new Thread(p);
        t2.start();
    }

}


class printEvenNum implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2 == 0) {
                System.out.println(
                        Thread.currentThread().getName()+':'+i
                );
            }
        }
    }
}