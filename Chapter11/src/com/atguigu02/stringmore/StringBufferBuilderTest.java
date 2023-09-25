package com.atguigu02.stringmore;

import org.junit.Test;

/**
 * className: StringBufferTest
 * Package : com.atguigu02.stringmore
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/25 22:34
 * @Version 1.0
 */
public class StringBufferBuilderTest {

    @Test
    public void test1(){
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("abc").append("123").append("hello");//方法链的调用
        System.out.println(sBuilder);//abc123hello
    }

    @Test
    public void test2(){
        StringBuilder sBuilder = new StringBuilder("hello");
        sBuilder.insert(2,12);
        sBuilder.insert(2, "abc");
        System.out.println(sBuilder);//heabc12llo

        StringBuilder sBuilder1 = sBuilder.reverse();
        System.out.println(sBuilder);//oll21cbaeh
        System.out.println(sBuilder1);//oll21cbaeh
        System.out.println(sBuilder == sBuilder1);//true

        System.out.println(sBuilder.length());//10--实际存储的字符数
    }

    @Test
    public void test3(){
        StringBuilder sBuilder = new StringBuilder("hello");
        sBuilder.setLength(2);

        System.out.println(sBuilder);//he

        sBuilder.append('c');
        System.out.println(sBuilder);//hec,此时lo并没有被删除，只是将count设置为了2，相当于截断？

        sBuilder.setLength(10);
        System.out.println(sBuilder);//hec'\0''\0''\0''\0''\0''\0''\0'，此时lo被覆盖，因为检测到count小于newLenth，则补0
        System.out.println(sBuilder.charAt(5)==0);//true
    }
}
