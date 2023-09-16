package com.atguigu09.inner;

/**
 * className: OutClassTest2
 * Package : com.atguigu09.inner
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/23 13:30
 * @Version 1.0
 */
public class OutClassTest2 {
    public static void main(String[] args) {
        //接口的匿名实现的匿名对象
        SubA a = new SubA();
        a.method();
        new A(){
            @Override
            public void method() {
                System.out.println("接口的匿名实现的匿名对象");
            }
        }.method();

        //继承于抽象类的匿名子类的匿名对象
        SubB b = new SubB();
        b.method1();
        new B(){
            @Override
            public void method1() {
                System.out.println("继承于抽象类的匿名子类的匿名对象");
            }
        }.method1();

        C c = new C();
        System.out.println(c.getClass());
        c.method2();
        //提供一个继承于C的匿名子类的对象，关键在于{}
        C c1 = new C(){};
        System.out.println(c1.getClass());
        c1.method2();
        new C(){
            public void method2(){
                System.out.println("C");
            }
        }.method2();
    }
}
interface A{
    public void method();
}

class SubA implements A{
    @Override
    public void method() {
        System.out.println("SubA");
    }
}

abstract class B{
    public abstract void method1();
}

class SubB extends B{
    @Override
    public void method1() {
        System.out.println("SubB");
    }
}

class C{
    public void method2(){
        System.out.println("C");
    }
}