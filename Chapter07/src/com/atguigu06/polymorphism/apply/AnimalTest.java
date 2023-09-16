package com.atguigu06.polymorphism.apply;

/**
 * className: AnimalTest
 * Package : com.atguigu06.polymorphism.apply
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/16 18:38
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.adopt(new Cat());
        test.adopt(new Dog());
    }

    public void adopt(Animal animal) {
        if (animal instanceof Dog) {
            ((Dog)animal).eat();
        } else if (animal instanceof Cat) {
            ((Cat)animal).eat();
        }
    }
}

    class Animal{
        public void eat(){
            System.out.println("Animal eats");
        }
    }

    class Cat extends Animal{
        @Override
        public void eat(){
            System.out.println("Cat eats");
        }
    }

    class Dog extends Animal{
        @Override
        public void eat() {
            System.out.println("Dog eats");
        }
    }

