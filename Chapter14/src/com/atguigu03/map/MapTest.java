package com.atguigu03.map;

import org.junit.Test;

import java.util.*;

/**
* className: MapTest
* Package : com.atguigu03.map
* Description:
* @Author gzzz
* @Create 2023/10/8 19:53
* @Version 1.0
*/
public class MapTest {
     @Test
     public void test1(){
         HashMap<String,Integer> map = new HashMap<>();
         map.put("AA", 13);
     }
     
     @Test
     public void test2(){
         HashMap<String,Integer> map = new LinkedHashMap<>();
         map.put("AA", 13);
     }
     
     @Test
     public void test3(){
         Set<String> set = new HashSet<>();
         set.add("AA");
     }

     @Test
     public void test4(){
         Set<String> set = new LinkedHashSet<>();
         set.add("AA");
     }
}
