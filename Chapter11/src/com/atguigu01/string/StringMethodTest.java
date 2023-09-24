package com.atguigu01.string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * className: StringMethodTest
 * Package : com.atguigu01.string
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/24 15:01
 * @Version 1.0
 */
public class StringMethodTest {
    @Test
    public void test1() {
        String s1 = new String();
        String s2 = new String("");
        String s3 = new String(new char[]{'a','b','c'});
        System.out.println(s3);
    }
    
    @Test
    public void test2(){
        int num = 20;
        String s1 = num + "";
        String s2 = String.valueOf(num);

        String s3 = "123";
        int i = Integer.parseInt(s3);
        
    }
    
    @Test
    public void test3(){
        String str = "hello";
        //String -->char[]:调用String的toCharArray()
        char [] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //char[] --> String: 调用String的构造器
        String str1 = new String(arr);
        System.out.println(str1);

    }

    //String与byte[]之间的转换（难度）
    @Test
    public void test4() throws UnsupportedEncodingException {
        String str = new String("hello中国");
        byte[] arr = str.getBytes();//使用默认的字符集：当前为UTF-8
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //getBytes (String charsetName):使用指定的字符集
        byte[] arr1 = str.getBytes("gbk");//使用指定的字符集：GBK
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        //byte[]-->String
        String str1 = new String(arr);//使用默认的字符集：当前为UTF-8
        System.out.println(str1);

        String str2 = new String(arr1, "gbk");//显示的指明解码的字符集
        System.out.println(str2);
        
    }
}
