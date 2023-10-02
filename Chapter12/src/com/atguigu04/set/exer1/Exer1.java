package com.atguigu04.set.exer1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * className: Exer1
 * Package : com.atguigu04.set.exer1
 * Description:
 *定义方法如下：public static List duplicateList(List list)
 * 要求：① 参数List中只存放Integer的对象
 *      ② 在List内去除重复数字值，尽量简单
 * @Author gzzz
 * @Create 2023/10/3 0:11
 * @Version 1.0
 */
public class Exer1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(22);
        list.add(22);
        list.add(32);

        List newList = duplicateList(list);
        System.out.println(newList);
    }

    public static List duplicateList(List list) {
        //方法一：
//        HashSet hashSet = new HashSet();
//        for (Object obj :
//                list) {
//            hashSet.add(obj);
//        }
//
//        List newList = new ArrayList();
//        for (Object obj :
//                hashSet) {
//            newList.add(obj);
//        }
//        return newList;

        HashSet hashSet = new HashSet<>(list);
        List newList = new ArrayList(hashSet);
        return newList;
    }
}
