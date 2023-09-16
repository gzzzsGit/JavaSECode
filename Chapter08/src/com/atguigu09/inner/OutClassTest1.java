package com.atguigu09.inner;

/**
 * className: OutClassTest1
 * Package : com.atguigu09.inner
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/23 2:00
 * @Version 1.0
 */
public class OutClassTest1 {
    public static void main(String[] args) {

    }
    //开发中的场景
    public Comparable getInstance(){
        //需要返回Comparable的实现类实例
        //方法一：内部类提供接口的实现类的匿名对象
        class myComparable implements Comparable{
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
//        return new myComparable();
        //方法二：内部类提供接口的匿名实现类的对象
        Comparable c = new Comparable(){
            @Override
            public int compareTo(Object o) {
                return 1;
            }
        };
//        return c;

        //方法三：内部类提供接口的匿名实现类的匿名对象
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
