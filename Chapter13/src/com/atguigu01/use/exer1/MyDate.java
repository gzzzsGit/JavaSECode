package com.atguigu01.use.exer1;

/**
 * className: MyDate
 * Package : com.atguigu01.use.exer1
 * Description:
 * 2. MyDate类包含:
 *    private成员变量year,month,day；并为每一个属性定义 getter, setter 方法；
 *
 * @Author gzzz
 * @Create 2023/10/5 21:54
 * @Version 1.0
 */
public class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }


    public void setDay(int day) {
        this.day = day;
    }


    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }


    @Override
    public int compareTo(MyDate o) {
        int yearDiff = this.year-o.year;
        if (yearDiff != 0) {
            return yearDiff;
        }
        int monthDiff = this.month-o.month;
        if(monthDiff != 0) {
            return monthDiff;
        }
        return this.day-o.day;
    }
}
