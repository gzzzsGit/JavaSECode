package com.atguigu05.map;

import org.junit.Test;

import java.util.*;

/**
 * className: MapTest
 * Package : com.atguigu05.map
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/4 12:50
 * @Version 1.0
 */
public class MapTest {
    @Test
    public void test1(){
        Map map = new HashMap();

        map.put(32, "ga");
        map.put(null, null);
        map.put("ga", new Date());
        map.put("AA", 13);
        System.out.println(map);//{32=ga, null=null, AA=13, ga=Wed Oct 04 13:27:38 CST 2023}
    }

    @Test
    public void test2(){
        Map map = new Hashtable();

        map.put(null, 321);
        System.out.println(map);//java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
    }
    
    @Test
    public void test3(){
        LinkedHashMap map = new LinkedHashMap();
        map.put("Tom", 32);
        map.put("AA", new Date());
        map.put(32, "hello");//{Tom=32, AA=Wed Oct 04 12:53:15 CST 2023, 32=hello}

        System.out.println(map);
    }
    
    @Test
    public void test4(){
        HashMap map = new HashMap();

        //put(Object key,Object value)
        map.put("AA", 43);
        map.put(44, "Tom");
        map.put("BB", 43);
        map.put(new Person("xiba", 32), 43);

        System.out.println(map);//{AA=43, BB=43, Person{name='xiba', age=32}=43, 44=Tom}
        //size()
        System.out.println(map.size());

        //Object remove(Object key)
        Object value = map.remove("BB");
        System.out.println(map);//{AA=215, 44=Tom, Person{name='xiba', age=32}=43}
        System.out.println(value);

        //修改put(Object key,Object value)
        Object oldValue = map.put("AA", 215);
        System.out.println(map);//{AA=215, 44=Tom, Person{name='xiba', age=32}=43}
        System.out.println(oldValue);//43

        //get(Object key)
        Object value1 = map.get(44);
        System.out.println(value1);//Tom
    }
    
    @Test
    public void test5(){
        //遍历
        HashMap map = new HashMap();

        //put(Object key,Object value)
        map.put("AA", 43);
        map.put(44, "Tom");
        map.put("BB", 43);
        map.put(new Person("xiba", 32), 43);

        Set keySet = map.keySet();
        System.out.println(keySet);//[AA, BB, 44, Person{name='xiba', age=32}]

        for (Object o : keySet) {
            System.out.println(o);
        }

        Collection values = map.values();
        Iterator iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");//43 43 Tom 43
        }

        System.out.println();
        Set entrySet = map.entrySet();
//        for (Object o : entrySet) {
//            System.out.print(o+" ，");//AA=43 ，BB=43 ，44=Tom ，Person{name='xiba', age=32}=43 ，
//        }
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            //Entry 是Map类的内部接口，需要通过Map.Entry来调用
            Map.Entry entry = (Map.Entry) iterator1.next();
            System.out.println(entry.getKey()+"--->"+entry.getValue());//AA--->43  BB--->43  44--->Tom  Person{name='xiba', age=32}--->43
        }
    }
}
