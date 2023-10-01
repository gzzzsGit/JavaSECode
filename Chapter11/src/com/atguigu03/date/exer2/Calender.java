package com.atguigu03.date.exer2;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * className: Calender
 * Package : com.atguigu03.date.exer2
 * Description:
 *使用Calendar获取当前时间, 把这个时间设置为你的生日, 再获取你的百天(出生后100天)日期。
 * 使用LocalDateTime获取当前时间, 把这个时间设置为你的生日, 再获取你的百天(出生后100天)日期。
 * @Author gzzz
 * @Create 2023/9/26 20:25
 * @Version 1.0
 */
public class Calender {
    @Test
    public void test1(){
        Calendar calendar = Calendar.getInstance();
        System.out.println("你的生日是："+calendar.getTime());
        calendar.set(2001,12,19);
        calendar.add(Calendar.DAY_OF_YEAR,100);
        Date newDate = calendar.getTime();
        System.out.println("100天后是："+newDate);
    }

    @Test
    public void test2(){
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = localDateTime.plusDays(100);
        System.out.println(localDateTime);//2023-09-26T20:36:53.476828100
        System.out.println(localDateTime1);//2024-01-04T20:36:53.476828100
    }


}
