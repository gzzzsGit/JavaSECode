package com.atguigu04.set.exer2;

import java.util.HashSet;
import java.util.Random;

/**
 * className: Exer2
 * Package : com.atguigu04.set.exer2
 * Description:
 * 案例：
 * 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台。
 * @Author gzzz
 * @Create 2023/10/3 0:18
 * @Version 1.0
 */
public class Exer2 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        while (hashSet.size() < 10) {
            hashSet.add(new Random().nextInt(10)+1);
        }
        System.out.println(hashSet);
    }
}
