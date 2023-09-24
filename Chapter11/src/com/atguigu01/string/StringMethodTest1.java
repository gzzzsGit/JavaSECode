package com.atguigu01.string;

import org.junit.Test;

/**
 * className: StringMethodTest1
 * Package : com.atguigu01.string
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/24 21:40
 * @Version 1.0
 */
public class StringMethodTest1 {
    @Test
    public void test1() {
        String s1 = "";
        System.out.println(s1.isEmpty());//true

        String s3 = "hello";
        System.out.println(s3.length());//5

        String s4 = "world";
        System.out.println(s3.concat(" ").concat(s4));//hello world

        String s2 = null;
        System.out.println(s2.isEmpty());//空指针异常


    }

    @Test
    public void test2() {
        String s1 = "hello";
        String s2 = "Hello";
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        String s3 = "abcd";
        String s4 = "adff";
        System.out.println(s3.compareTo(s4));//-2
        System.out.println(s3.compareTo(s3));//0
        String s5 = "aBcd";
        System.out.println(s3.compareTo(s5));//32
        System.out.println(s3.compareToIgnoreCase(s5));//0

        String s6 = "  he llo  ";
        System.out.println("***"+s6.trim()+"***");//***he llo***

        String s7 = new String("abcd").intern();
        System.out.println(s7);//abcd
        System.out.println(s3==s7);//true
    }
    
    @Test
    public void test3(){
        String s1 = "教育尚硅谷教育";
        System.out.println(s1.contains("硅谷"));//true

        //返回指定子字符串在此字符串中第一次出现的位置
        System.out.println(s1.indexOf("教育"));//0
        System.out.println(s1.indexOf("教育",1));//5，从index位置开始

        //
        System.out.println(s1.lastIndexOf("教育"));//5
        System.out.println(s1.lastIndexOf("教育",4));//0
        System.out.println(s1.lastIndexOf("教育",5));//5

    }
    
    @Test
    public void test4(){
        //返回一个新的字符串，是此字符串的从beginIndex开始截取到endIndex（不包含）结束，默认到结尾
        String s1 = "一个完整的字符串";
        System.out.println(s1.substring(4));//的字符串
        System.out.println(s1.substring(5,7));//字符[5,7)
    }
    
    @Test
    public void test5(){
        String s1 = "我是一只小猫";
        System.out.println(s1.charAt(2));//yi

        String s2 = String.valueOf(new char[]{'a','b','c'});
        String s3 = String.copyValueOf(new char[]{'a', 'b', 'c'});
        System.out.println(s2);//abc
        System.out.println(s3);//abc
        System.out.println(s2 == s3);//false
    }

    @Test
    public void test6(){
        String s1 = "我是一只小猫我是";
        System.out.println(s1.startsWith("我是"));//true
        System.out.println(s1.startsWith("我是",2));//false
        System.out.println(s1.startsWith("我是",6));//true
        System.out.println(s1.endsWith("我是"));//true
    }
    
    @Test
    public void test7(){
        String s1 = "hello";
        String s2 = s1.replace('l','w');
        System.out.println(s1);//hello
        System.out.println(s2);//hewwo

        String s3 = s1.replace("ll","ssss");
        System.out.println(s3);//hesssso
    }
}
