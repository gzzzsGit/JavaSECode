package com.atguigu01.create.exer2;

/**
 * 思考题：判断各自调用的是哪个run()？
 */
public class Exer {
    public static void main(String[] args) {
        A a = new A();
        a.start();


        B b = new B(a);
        b.start();

    }
}

//创建线程类A
class A extends Thread {
    @Override
    public void run() {
        System.out.println("线程A的run()...");

    }
}

//创建线程类B
class B extends Thread {

    public B(A a) {//构造器中，直接传入A类对象
        super(a);
    }

    //注释掉结果会变成线程A的run()...具体看源码
    @Override
    public void run() {
        System.out.println("线程B的run()...");
    }
}
