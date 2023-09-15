package com.atguigu02.trycatchfinally;

/**
 * @author 尚硅谷-宋红康
 * @create 14:32
 */
public class FinallyTest {
    public static void main(String[] args) {
        int result = test("a");
        System.out.println(result);
    }

    public static int test(String str){
        try {
            Integer.parseInt(str);
            return 1;
        }catch (NumberFormatException e){
            return -1;
        } finally {
            System.out.println("test结束");
        }

    }
}
