package com.atguigu05.exer.exer4;

/**
 * className: 编写应用程序DivisionDemo
 * Package : com.atguigu05.exer.exer4
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/2 20:09
 * @Version 1.0
 */
public class DivisionDemo {
    public static void main(String[] args) {
        DivisionDemo test = new DivisionDemo();
        try {
            test.divide(args[0],args[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
           e.printStackTrace();
        }
    }

    public void divide(String x,String y){
        int m = 0,n = 0,res;
        try {
            m = Integer.parseInt(x);
            n = Integer.parseInt(y);
        } catch (NumberFormatException e) {
           e.printStackTrace();
           return;
        }
        if(m<0||n<0){
            throw new BelowZeroException();
        }
        try {
            res = m/n;
            System.out.println(res);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }


    }
}
