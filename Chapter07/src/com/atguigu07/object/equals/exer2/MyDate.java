package com.atguigu07.object.equals.exer2;

import java.util.Objects;

/**
 * className: MyDate
 * Package : com.atguigu07.object.equals.exer2
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/17 0:23
 * @Version 1.0
 */
public class MyDate {

    private int day;
    private  int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
