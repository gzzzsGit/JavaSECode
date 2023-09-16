package com.atguigu08._interface.exer2;

/**
 * className: InterfaceTest
 * Package : com.atguigu08._interface.exer2
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/21 20:37
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        CompareObject c1 = new ComparableCircle(3.3);
        CompareObject c2 = new ComparableCircle(4.2);
        int res = 0;
        try {
            res = c1.compareTo(c2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (res>0){
            System.out.println("c1比较大");
        } else if (res<0) {
            System.out.println("c2比较大");
        }
        else {
            System.out.println("c1,c2一样大");
        }
    }
}
