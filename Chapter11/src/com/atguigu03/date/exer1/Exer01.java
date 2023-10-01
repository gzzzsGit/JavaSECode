package com.atguigu03.date.exer1;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Scanner;

/**
 * className: Exer01
 * Package : com.atguigu03.date.exer1
 * Description:
 *如何将一个java.util.Date的实例转换为java.sql.Date的实例
 * @Author gzzz
 * @Create 2023/9/26 17:00
 * @Version 1.0
 */
public class Exer01 {
    @Test
    public void test1(){
        //错误的
        //Date date1 = new Date();
        //java.sql.Date date2 = (java.sql.Date)date1;

        Date date1 = new Date();
        java.sql.Date date2 = new java.sql.Date(date1.getTime());
        System.out.println(date2);//2023-09-26
    }

    /**
     * 拓展：
     * 将控制台获取的年月日（比如：2022-12-13）的字符串数据，保存在数据库中。
     * （简化为得到java.sql.Date的对象，此对象对应的时间为2022-12-13）。
     * */
    @Test
    public void test2() throws ParseException {
        Scanner scan = new Scanner(System.in);//2023-09-26
        String str = scan.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse(str);
        java.sql.Date date2 = new java.sql.Date(date1.getTime());
        System.out.println(date2);//2023-09-26
    }

    @Test
    public void test3(){
        //now():获取当前时间和日期对应的实例
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);//2023-09-26
        System.out.println(localTime);//19:17:54.361840200
        System.out.println(localDateTime);//2023-09-26T19:17:54.361840200

        //of():获取指定的日期，时间对应的实例
        LocalDate localDate1 = LocalDate.of(2023, 9, 26);
        LocalDateTime localDateTime1 = LocalDateTime.of(2023, 9, 26, 19, 21,59);
        System.out.println(localDate1);//2023-09-26
        System.out.println(localDateTime1);//2023-09-26T19:21:59

        //getxxx()
        LocalDateTime localDateTime2 = LocalDateTime.now();
        System.out.println(localDateTime2.getDayOfMonth());//26
        //体现不可变性
        //withxxxx()
        LocalDateTime localDateTime3 = localDateTime2.withDayOfMonth(16);
        System.out.println(localDateTime2);//2023-09-26T19:28:14.399479600
        System.out.println(localDateTime3);//2023-09-16T19:28:14.399479600
        //plusXx()
        LocalDateTime localDateTime4 = localDateTime2.plusDays(15);
        System.out.println(localDateTime2);//2023-09-26T19:28:14.399479600
        System.out.println(localDateTime4);//2023-10-11T19:28:14.399479600
    }
    
    @Test
    public void test4(){
        //
        Instant instant = Instant.now();
        System.out.println(instant);//2023-09-26T11:38:04.876143800Z,格林威治时间
        //如果想得到北京时间
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);//2023-09-26T19:40:39.248438300+08:00

        //获取指定偏移量的时间
        Instant instant1 = Instant.ofEpochMilli(1641321165443L);//2022-01-04T18:32:45.443Z
        System.out.println(instant1);

        //获取偏移毫秒数
        long MilliTime = instant1.toEpochMilli();
        System.out.println(MilliTime);//1641321165443
    }
    
    @Test
    public void test5() {
        //自定义的格式。如："yyyy-MM-dd HH:mm:ss"
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();

        //格式化：日期、时间-->字符串
        String format = dateTimeFormatter.format(localDateTime);
        System.out.println(format);//2023-09-26 20:02:14

        //解析：字符串-->日期、时间
        TemporalAccessor parse = dateTimeFormatter.parse("2023-09-26 20:02:14");//LocalDateTime、LocalDate、LocalTime等实现的接口
        LocalDateTime localDateTime1 = LocalDateTime.from(parse);
        System.out.println(localDateTime1);
    }

}
