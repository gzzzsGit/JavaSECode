package com.atguigu02.selfdefine;

/**
 * className: SubOrder3
 * Package : com.atguigu02.selfdefine
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/6 19:40
 * @Version 1.0
 */
public class SubOrder3<T> extends Order<T>{
    public void show(T t) {
        System.out.println(t);
    }

}
