package com.atguigu01.throwable;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 * @author 尚硅谷-宋红康
 * @create 10:39
 */




public class ExceptionTest {
    @Test
    public void test1(){
        int[] arr = new int[]{1,2,3};
        System.out.println(arr[4]);
    }

    @Test
    public void test2(){
        String str ="hello";
        str =null;
        System.out.println(str.toString());
    }
    
    @Test
    public void test3(){
        Object obj = new String();
        Date date = (Date) obj;
    }
    
    @Test
    public void test4(){
        String str = "123";
        int i = Integer.parseInt(str);
        str = "abc";
        i = Integer.parseInt(str);
    }

    @Test
    public void test5(){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int i = scan.nextInt();
        System.out.println(i);
        scan.close();
    }
    
    @Test
    public void test6(){
        int num=0;
        System.out.println(num/0);
    }

    @Test
    public void test7() throws ClassNotFoundException{
        Class clz = Class.forName("java.lang.String");
    }

    @Test
    public void test8()throws ClassNotFoundException,IOException {
        File file = new File("hello.txt");
        FileInputStream fls = new FileInputStream(file);//ClassNotFoundException
        int data = fls.read();//IOException
        while (data != -1){
            System.out.println((char)data);
            data = fls.read();//IOException
        }
        fls.close();//IOException
    }

}
