package com.atguigu12.wrapper;

import org.junit.Test;

/**
 * className: WrapperTest1
 * Package : com.atguigu12.wrapper
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/28 1:52
 * @Version 1.0
 */
public class WrapperTest1 {
    //基本数据类型-->String
    @Test
    public void test(){
        int i = 11;
        String str = String.valueOf(i);
        System.out.println(str);

        boolean b = true;
        Boolean b1 = b;
        String str1 = String.valueOf(b);
        String str2 = String.valueOf(b1);
        System.out.println(str1+str2);

        String str3 = i+"";
        System.out.println(str3);
    }
    //String-->基本数据类型
    @Test
    public void test1(){
        String str = "123";
        int i = Integer.parseInt(str);
        System.out.println(i);

        String str1 = "tdrue";
        boolean b = Boolean.parseBoolean(str1);
        System.out.println(b);//false
    }
}

