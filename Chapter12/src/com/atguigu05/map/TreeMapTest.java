package com.atguigu05.map;

import org.junit.Test;

import java.util.Comparator;
import java.util.Date;
import java.util.Set;
import java.util.TreeMap;

/**
 * className: TreeMapTest
 * Package : com.atguigu05.map
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/4 19:50
 * @Version 1.0
 */
public class TreeMapTest {
    @Test
    public void test1(){
        TreeMap map = new TreeMap();

        map.put("CC", 14);
        map.put("AA", 453);
        map.put("OO", new Date());
        map.put("NN", 43);

        Set entrySet = map.entrySet();
        for (Object o : entrySet) {
            System.out.print(o+" ");//AA=453 CC=14 NN=43 OO=Wed Oct 04 20:22:09 CST 2023
        }
    }
    
    @Test
    public void test2(){
        TreeMap map = new TreeMap();

        User u1 = new User("Tom", 23);
        User u2 = new User("Jerry", 13);
        User u3 = new User("Curry", 43);
        User u4 = new User("Steven", 33);
        User u5 = new User("Lebron", 23);

        map.put(u1, 34);
        map.put(u2, 43);
        map.put(u3, 64);
        map.put(u4, 72);
        map.put(u5, 23);

        for (Object o : map.entrySet()) {
            System.out.println(o);
        }
    }
    
    @Test
    public void test3(){
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    int res = u1.getName().compareTo(u2.getName());
                    if (res != 0) {
                        res= u1.getAge()-u2.getAge();
                    }
                    return res;
                } else {
                    throw new RuntimeException("类型不匹配！");
                }
            }
        };

        TreeMap map = new TreeMap(comparator);

        User u1 = new User("Tom", 23);
        User u2 = new User("Jerry", 13);
        User u3 = new User("Curry", 43);
        User u4 = new User("Steven", 33);
        User u5 = new User("Lebron", 23);

        map.put(u1, 34);
        map.put(u2, 43);
        map.put(u3, 64);
        map.put(u4, 72);
        map.put(u5, 23);
    }

}
