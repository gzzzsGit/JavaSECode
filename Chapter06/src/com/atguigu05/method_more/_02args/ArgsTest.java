package com.atguigu05.method_more._02args;

/**
 * @author 尚硅谷-宋红康
 * @create 23:23
 */
public class ArgsTest {
    public static void main(String[] args) {
        ArgsTest test = new ArgsTest();
        test.print();
        test.print(1);
        test.print(1,2);
    }
    public void print(int ...num){
        System.out.println("1111");
    }

    public void print(int i){
        System.out.println("2222");
    }

    public void print(int i,int j){
        System.out.println("3333");
    }


}
