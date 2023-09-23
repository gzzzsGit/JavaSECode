package com.atguigu01.string;

import org.junit.Test;

/**
 * className: StingDemo
 * Package : com.atguigu01.string
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/23 21:18
 * @Version 1.0
 */
public class StingDemo {
    @Test
    public void test() {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);
    }

    @Test
    public void test0(){
        String s1 = "hello";
        String s2 = "hello";
        s2 = "hi";
        System.out.println(s1);//hello
        System.out.println(s2);//hi
    }
    @Test
    public void test1(){
        String s2 = "hello";
        String s3 = s2+" world";
        System.out.println(s2);
        System.out.println(s3);
    }

    @Test
    public void test3(){
        String s2 = "hello";
        String s3 = s2.replace('l','k');
        System.out.println(s2);//hello
        System.out.println(s3);//hekko
    }
}
