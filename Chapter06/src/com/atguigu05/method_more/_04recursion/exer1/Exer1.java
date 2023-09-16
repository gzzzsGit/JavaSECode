package com.atguigu05.method_more._04recursion.exer1;

/**
 * className: Exer1
 * Package : com.atguigu05.method_more._04recursion.exer1
 * Description:
 *练习1：
 * 已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),
 * 其中n是大于0的整数，求f(10)的值。
 * 练习2：
 * 已知有一个数列：f(0) = 1,f(1) = 4,
 * f(n+2)=2*f(n+1) + f(n),其中n是大于0的整数，求f(10)的值。
 * @Author gzzz
 * @Create 2023/8/11 16:52
 * @Version 1.0
 */
public class Exer1 {
    public static void main(String[] args) {
        Exer1 e1 = new Exer1();
        System.out.println(e1.f(10));
        System.out.println(e1.f1(10));
    }
    public int f(int n){
        if (n==20){
            return 1;
        } else if (n==21) {
            return 4;
        }
        else
        return f(n+2)-2*f(n+1);
    }

    public int f1(int n){
        if (n==0) {
            return 1;
        } else if (n==1) {
            return 4;
        }
        else
            return f(n+2)-2*f(n+1);
    }
}
