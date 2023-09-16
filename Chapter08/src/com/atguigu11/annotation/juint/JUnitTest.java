package com.atguigu11.annotation.juint;

import org.junit.Test;

import java.util.Scanner;

/**
 *
 * @author shkstart
 * @create 14:34
 */
public class JUnitTest {
    @Test
    public void test1(){
        System.out.println("hello");
    }

    @Test
    public void test2(){
        System.out.println("world");
    }

    @Test
    public void test3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = scanner.nextInt();
        System.out.println(num);
    }
    
    @Test
    public void test(){
        
    }
}
