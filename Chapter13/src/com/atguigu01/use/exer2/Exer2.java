package com.atguigu01.use.exer2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * className: Exer2
 * Package : com.atguigu01.use.exer2
 * Description:
 *（1）创建一个ArrayList集合对象，并指定泛型为<Integer>
 *
 * （2）添加5个[0,100)以内的随机整数到集合中
 *
 * （3）使用foreach遍历输出5个整数
 *
 * （4）使用集合的removeIf方法删除偶数，为Predicate接口指定泛型<Ineteger>
 *
 * （5）再使用Iterator迭代器输出剩下的元素，为Iterator接口指定泛型<Integer>
 * @Author gzzz
 * @Create 2023/10/5 22:44
 * @Version 1.0
 */
public class Exer2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add((int) (Math.random()*100));
        }

        for (Integer i :
                list) {
            System.out.println(i);
        }

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
//                return integer % 2 ==0?true:false;
                return integer%2==0;
            }
        };
        list.removeIf(predicate);

        System.out.println();
        Iterator<Integer> iterator= list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
