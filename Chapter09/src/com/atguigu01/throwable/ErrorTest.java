package com.atguigu01.throwable;

/**
 * @author 尚硅谷-宋红康
 * @create 10:12
 */
public class ErrorTest {
    public static void main(String[] args) {

        //0utOfNemoryError
        int[] num = new int[1024*10*1024];//10m
    }
}
