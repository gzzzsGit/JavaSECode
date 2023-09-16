package com.atguigu09.inner;

/**
 * className: OutClassTest
 * Package : com.atguigu09.inner
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/22 23:03
 * @Version 1.0
 */
public class OutClassTest {
    public static void main(String[] args) {
        //创建Person的静态的成员内部类实例
        Person.Dog dog= new Person.Dog();
        dog.eat();

        //创建Person的非静态的成员内部类实例
        Person p1 = new Person();
        Person.Bird bird = p1.new Bird();
        bird.eat();
        bird.show();
    }

}

class Person{//外部类
    int age = 1;
    String name = "Tom";

    public void eat(){
        System.out.println("人吃饭");
    }
    //静态的成员内部类
    static class Dog{
        public void eat(){
            System.out.println("狗吃骨头");
        }
    }

    class Bird{
        String name = "jerry";
        public void eat(){
            System.out.println("鸟吃虫子");
        }

        public void show(){
            System.out.println("name:"+name);
            System.out.println("age:"+age);//省略了Person.this.
            System.out.println("PersonName:"+Person.this.name);
            Person.this.eat();
        }
    }
}