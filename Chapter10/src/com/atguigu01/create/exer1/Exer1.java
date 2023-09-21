package com.atguigu01.create.exer1;

/**
 * className: EvenNumberTest
 * Package : com.atguigu01.create.exer1
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/18 16:26
 * @Version 1.0
 */
public class Exer1 {
    public static void main(String[] args) {
        printEvenNum thread1 = new printEvenNum();
        printPrimeNum thread2 = new printPrimeNum();
        thread1.start();
        thread2.start();
        //方式二：匿名子类的匿名对象
        new Thread(){
            @Override
            public void run(){
                for(int i=0;i< 100;i++){
                    if(i%2==0){
                        System.out.println(Thread.currentThread().getName()+':'+i);
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                for(int i=0;i< 100;i++){
                    if(i%2==1){
                        System.out.println(Thread.currentThread().getName()+':'+i);
                    }
                }
            }
        }.start();

        //方式三：runnable接口的匿名实现类的匿名对象
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i< 100;i++){
                    if(i%2==0){
                        System.out.println(Thread.currentThread().getName()+':'+i);
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i< 100;i++){
                    if(i%2==1){
                        System.out.println(Thread.currentThread().getName()+':'+i);
                    }
                }
            }
        }).start();

    }
}

class printEvenNum extends Thread{
        @Override
        public void run(){
            for(int i=0;i< 100;i++){
                if(i%2==0){
                    System.out.println(Thread.currentThread().getName()+':'+i);
                }
            }
        }
}

class printPrimeNum extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2 == 1){
                System.out.println(Thread.currentThread().getName()+':'+i);
            }
        }
    }
}