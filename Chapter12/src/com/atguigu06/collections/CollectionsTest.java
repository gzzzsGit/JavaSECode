package com.atguigu06.collections;

import org.junit.Test;

import java.util.*;

/**
 * className: CollectionsTest
 * Package : com.atguigu06.collections
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/5 10:50
 * @Version 1.0
 */
public class CollectionsTest {
    @Test
    public void test1(){
        //排序
        List list = Arrays.asList(1, 34, 45, 32, 2, 23);
        System.out.println(list);//[1, 34, 45, 32, 2, 23]

        //reverse(List list) 反转list中元素的顺序
        Collections.reverse(list);
        System.out.println(list);//[23, 2, 32, 45, 34, 1]

        //shuffle(List list)
        Collections.shuffle(list);
        System.out.println(list);//[2, 45, 34, 32, 23, 1]

        //sort(List list)
        Collections.sort(list);
        System.out.println(list);//[1, 2, 23, 32, 34, 45]

        //sort(List list,Comparator comparator)
        Collections.sort(list, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Integer&& o2 instanceof Integer){
                    return -(((Integer) o1).intValue() - ((Integer) o2).intValue());
                };
                throw new RuntimeException("类型不匹配！");
            }
        });
        System.out.println(list);//((Integer) o1).intValue()

        //swap(List list,int i,int j)
        Collections.swap(list,0,5);
        System.out.println(list);//[1, 34, 32, 23, 2, 45]
    }

    @Test
    public void test2() {
        //查找
        List list = Arrays.asList(54, 34, 35,35, 42, 52, 26);
        System.out.println(list);

        //max(List)
        Object max = Collections.max(list);
        System.out.println(max);

        //max(List,Comparator)
        Object max1 =Collections.max(list, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Integer && o2 instanceof Integer) {
                    Integer i1 = (Integer) o1;
                    Integer i2 = (Integer) o2;
                    int res = -(i1 - i2);
                    return res;
                }
                throw new RuntimeException("类型不匹配！");
            }
        });
        System.out.println(max1);

        //BinarySearch(List list,T key)
        int index = Collections.binarySearch(list, 35);
        System.out.println(index);

        //frequency(List list,Object o)
        int count = Collections.frequency(list, 35);
        System.out.println("35出现了"+count+"次");
    }
    
    @Test
    public void test3(){
        //复制、替换
        List list = Arrays.asList(54, 34, 35, 35, 42, 52, 26);
        System.out.println(list);

        //void copy(List dest,List src)
        //错误的写法，因为目的集合的size一定要大于原集合
//        List dest = new ArrayList();
//        Collections.copy(dest, list);//java.lang.IndexOutOfBoundsException: Source does not fit in dest

        //正确的写法
        List dest = Arrays.asList(new Object[list.size()]);

        Collections.copy(dest,list);
        System.out.println(dest);//[54, 34, 35, 35, 42, 52, 26]
    }
    
    @Test
    public void test4(){
        List list = new ArrayList();
        list.add(13);
        list.add(23);
        list.add(43);
        list.add(33);

        //此时的list1只能读不能写
        List list1 = Collections.unmodifiableList(list);
        System.out.println(list1.get(2));//23
        //list1.add(2);//java.lang.UnsupportedOperationException
    }
    
    @Test
    public void test5(){
        List list1 = new ArrayList();
        List list2 = Collections.synchronizedList(list1);
        list2.add(213);//debug观察，发现调用synchronized方法

        HashMap map1 = new HashMap();
        Map map2 = Collections.synchronizedMap(map1);

        Collections.addAll(list2, 34, 43, 342, 234);
        System.out.println(list2);//[213, 34, 43, 342, 234]
    }

}
