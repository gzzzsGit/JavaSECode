package com.atguigu04.example.exer2;

import java.util.Scanner;

/**
 * className: Exer2
 * Package : com.atguigu04.example.exer2
 * Description:
 *案例：
 *
 * 1. 编写程序，声明一个method1方法，在方法中打印一个10*8 的*型矩形，在main方法中调用该方法。
 *
 * 2. 编写程序，声明一个method2方法，除打印一个10*8的*型矩形外，
 * 再计算该矩形的面积，并将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
 *
 * 3. 编写程序，声明一个method3方法，在method3方法提供m和n两个参数，方法中打印一个m*n的*型矩形，
 * 并计算该矩形的面积，将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
 * @Author gzzz
 * @Create 2023/8/9 12:10
 * @Version 1.0
 */
public class Exer2 {
    public static void main(String[] args) {
        Exer2 e1 =new Exer2();
        e1.method1();
        System.out.println(e1.method2());
        int m , n;
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();
        n = scan.nextInt();
        System.out.println(e1.method3(m,n));
    }

    public void method1(){
        for (int i = 0; i <10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public int method2() {
        method1();
        return 10 * 8;
    }

    public int method3(int m, int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        return m*n;
    }
}
