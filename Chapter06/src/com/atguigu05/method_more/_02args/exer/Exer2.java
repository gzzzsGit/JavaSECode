package com.atguigu05.method_more._02args.exer;

/**
 * className: Exer2
 * Package : com.atguigu05.method_more._02args.exer
 * Description:
 *练习：可变形参的方法
 * n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串""
 * @Author gzzz
 * @Create 2023/8/10 21:06
 * @Version 1.0
 */
public class Exer2 {
    public static void main(String[] args) {
        Exer2 test = new Exer2();
        String info  = test.strcat('-');
        System.out.println(info);
    }

    public String strcat(char devide,String ...str){
        String res = "";
        for (int i = 0; i < str.length; i++) {
            if (i==0)
            res += str[i];
            else
            res = res + devide + str[i];
        }
        return res;
    }
}
