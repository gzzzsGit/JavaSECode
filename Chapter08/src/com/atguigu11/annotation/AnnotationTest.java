package com.atguigu11.annotation;


/**
 * className: AnnotationTest
 * Package : com.atguigu11.annotation
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/26 1:47
 * @Version 1.0
 */
public class AnnotationTest {
    public static void main(String[] args) {

        @SuppressWarnings("deprecation") Person p1 = new Person("nre");
        @SuppressWarnings("unused") Person p2 = new Person();
        System.out.println(p1.name);
    }
}

@MyAnnotation(value = "class")
class Person{
    String name = "xiba";

    public Person() {
    }

    @MyAnnotation(value = "constructor")
    @Deprecated
    public Person(String name) {
        this.name = name;
    }
}