package com.atguigu02.trycatchfinally;

import org.junit.Test;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author 尚硅谷-宋红康
 * @create 11:50
 */
public class ExceptionHandleTest {
    @Test
    public void test(){
        try {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("出现了InputMismatchException异常");
        }
        System.out.println("异常处理结束，代码继续执行");
    }

    @Test
    public void test1(){
        try {
            String str = "312";
            str = "abc";
            int i = Integer.parseInt(str);
            System.out.println(i);
        } catch (NumberFormatException e) {
           e.printStackTrace();//打印错误信息
        }
        System.out.println("程序结束");
    }
    
    @Test
    public void test2(){
        try {
            File file = new File("hello.txt");
            FileInputStream fls = new FileInputStream(file);//ClassNotFoundException
            int data = fls.read();//IOException
            while (data != -1){
                System.out.println((char)data);
                data = fls.read();//IOException
            }
            fls.close();//IOException
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("读取数据结束");
    }

    @Test
    public void test3() {
        try {
            Class clz = Class.forName("java.lang.String");
            System.out.println("成功");
        } catch (ClassNotFoundException e) {
           e.printStackTrace();
        }
    }
}
