package com.atguigu01.string;

import org.junit.Test;

/**
 * className: StingDemo1
 * Package : com.atguigu01.string
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/23 21:18
 * @Version 1.0
 */
public class StingDemo1 {
    @Test
    public void test() {
        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = new String("hello");
        System.out.println(s1 == s2);//false
        System.out.println(s2 == s3);//false
    }

    @Test
    public void test1() {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world";
        String s6 = "hello" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s6);//false
        System.out.println(s5 == s7);//false

        String s8 = s5.intern();
        System.out.println(s3 == s8);//true
    }

    @Test
    public void test2() {
        final String s1 = "hello";
        final String s2 = "world";
        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world";
        String s6 = "hello" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s5);//true
        System.out.println(s3 == s6);//true
        System.out.println(s3 == s7);//true

    }

    @Test
    public void test3() {
        final String s1 = "hello";
        final String s2 = "world";
        String s = "helloworld";
        String s3 = s1.concat(s2);
        String s4 = "hello".concat(s2);
        String s5 = s1.concat("world");

        System.out.println(s3 == s4);//false
        System.out.println(s4 == s5);//false
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s);//false
    }

}
