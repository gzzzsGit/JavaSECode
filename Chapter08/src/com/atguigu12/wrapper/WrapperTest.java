package com.atguigu12.wrapper;

import org.junit.Test;

/**
* className: WrapperTest
* Package : com.atguigu12.wrapper
* Description:
* @Author gzzz
* @Create 2023/8/27 19:16
* @Version 1.0
*/
public class WrapperTest {
    //基本数据类型-->包装类
    @Test
    public void test() {
        int i = 1;
        Integer ii1 = new Integer(i);
        System.out.println(ii1);

        String str = "false13";
        String str2 = "TrUe";
        Boolean res = new Boolean(str);
        System.out.println(res);//false,只要不等于true自动为false
        Boolean res2 = new Boolean(str2);
        System.out.println(res2);//true

        //推荐使用
        Float f1 = Float.valueOf(12.3f);
        System.out.println(f1);
    }

    //包装类-->基本数据类型
    @Test
    public void test2(){
        Integer ii1 = new Integer(12);
        int i = ii1.intValue();
        System.out.println(i);

        Boolean b = Boolean.valueOf(true);
        boolean str = b.booleanValue();
        System.out.println(str);
    }

    //自动装箱
    @Test
    public void test3(){
        Integer i = 1;
        System.out.println(i);
        Boolean b = true;
        System.out.println(b);
        int j = i;
        System.out.println(j);
        boolean c = b;
        System.out.println(c);
    }
}
