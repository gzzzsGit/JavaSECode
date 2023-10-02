package com.atguigu03.list.exer2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * className: Exer2
 * Package : com.atguigu03.list.exer2
 * Description:
 *定义方法public static int listTest(Collection list,String s)统计集合中指定元素出现的次数
 *
 * (1) 创建集合，集合存放随机生成的30个小写字母
 *
 * (2) 用listTest统计，a、b、c、x元素的出现次数
 * @Author gzzz
 * @Create 2023/10/2 12:38
 * @Version 1.0
 */
public class Exer2 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        for (int i = 0; i < 30; i++) {
            list.add((char)(new Random().nextInt(26)+'a')+"");
        }
        System.out.println(list);
        System.out.println("a: "+listTest(list,"a"));
        System.out.println("b: "+listTest(list,"b"));
        System.out.println("c: "+listTest(list,"c"));
        System.out.println("a: "+listTest(list,"x"));

    }

    public static int listTest(Collection list, String s) {
        int count = 0;
        for (Object obj :
                list) {
            if (obj.equals(s))
                count++;
        }
        return count;
    }
}
