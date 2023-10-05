package com.atguigu01.use;

import org.junit.Test;

import java.util.*;

/**
 * className: CollectionMapTest
 * Package : com
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/5 20:36
 * @Version 1.0
 */
public class CollectionMapTest {
    @Test
    public void test(){
        List list = new ArrayList();
        list.add(13);
        list.add(35);
        list.add(43);
        list.add(21);
        //不安全，可以添加任意Object类型的数据
//        list.add("ff");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            //需要强制转换，而且很可能转换异常
            Integer score = (Integer) iterator.next();
            int i = score;
            System.out.println(i);
        }
    }
    @Test
    public void test1(){
        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(35);
        list.add(43);
        list.add(21);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int score = iterator.next();
            System.out.println(score);
        }
    }

    @Test
    public void test2(){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Tom", 23);
        map.put("Jerry", 33);
        map.put("Xiba", 41);
        map.put("Faker", 10);
        map.put("Stally", 32);

//        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        //jdk10新特性：var 类型推断
        //可以直接写成
        var iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,Integer> entry = iterator.next();
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key+"---->"+value);
        }
    }
}
