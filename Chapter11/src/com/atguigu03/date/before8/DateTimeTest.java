package com.atguigu03.date.before8;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * className: DateTimeTest
 * Package : com.atguigu03.date.before8
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/26 15:27
 * @Version 1.0
 */
public class DateTimeTest {
    /*
    *Date类的使用
    *
    * |--java.util.Date
    *    >构造器的使用
    *    >两个方法的使用：1.toString 2.getTime
    *       |--java.sql.Date//对应数据库中的Date类型
    * */
     @Test
     public void test1(){
         Date date1 = new Date();//创建一个基于当前日期时间的Date对象
         System.out.println(date1.toString());//Tue Sep 26 15:38:25 CST 2023

         long milliTimes = date1.getTime();
         System.out.println("对应的毫秒数："+milliTimes);//1695713905186，距离1970.1.1 的毫秒数

         Date date2 = new Date(1695713905186L);//创建一个指定时间戳(long类型)的Date对象
         System.out.println(date2.toString());//Tue Sep 26 15:38:25 CST 2023
     }

     @Test
     public void test2(){
         java.sql.Date date1 = new java.sql.Date(1695713905186L);
         System.out.println(date1.toString());//2023-09-26

         System.out.println(date1.getTime());//1695713905186
     }

     @Test
     public void test3() throws ParseException {
         SimpleDateFormat sdf = new SimpleDateFormat();
         Date date1 = new Date();

         //格式化：日期-->字符串
         String strDate = sdf.format(date1);
         System.out.println(strDate);//2023/9/26 下午4:03

         //解析：字符串-->日期，需要抛出ParseException 异常，因为可能字符串不符合参数要求，解析失败
         date1 = sdf.parse("2023/9/26 下午5:03");
         System.out.println(date1.toString());//Tue Sep 26 16:03:00 CST 2023
     }

     @Test
     public void test4() throws ParseException {
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

         //格式化：日期-->字符串
         Date date1 = new Date();
         String strDate = sdf.format(date1);
         System.out.println(strDate);//2023-09-26 16:27:30

         //解析：字符串-->日期
         date1 = sdf.parse(strDate);
         System.out.println(date1);//Tue Sep 26 16:27:30 CST 2023

         //解析失败，因为参数的字符串不满足SimpleDateFormat可以识别的格式
         Date date2 = sdf.parse("Tue Sep 26 16:03:00 CST 2023");
         System.out.println(date2);
     }

     /*
     *calendar :日历类
     * ① 实例化由于Calendar是一个抽象类，所以我们需要创建其子类的实例。这里我们通过Calendar的静态方法
     * getInstance()即可获取
     * ② 常用方法 get(int field) //set(int field,xx) //add(int field,xx) //getTime() //setTime(Date date)
     * */
     @Test
     public void test5(){
         Calendar calendar = Calendar.getInstance();
         System.out.println(calendar.getClass());

         //get(int field)
         System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//26
         System.out.println(calendar.get(Calendar.DAY_OF_YEAR));//269

         //set(int field,xx)
         calendar.set(Calendar.DAY_OF_MONTH,23);
         System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//23

         //add(int field,xx)
         calendar.add(Calendar.DAY_OF_MONTH,3);
         System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//26
         calendar.add(Calendar.DAY_OF_MONTH,-5);
         System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//21

         //getTime()
         Date date1 = calendar.getTime();
         System.out.println(date1);//Thu Sep 21 16:54:31 CST 2023

         //setTime(Date date)
         Date date2 = new Date();
         calendar.setTime(date2);
         System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//26
     }
}
