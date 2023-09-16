package com.atguigu10._enum;

/**
 * className: SeasonTest
 * Package : com.atguigu10._enum
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/24 1:37
 * @Version 1.0
 */
public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(Season.SPRING.toString());
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println(season.toString());
        }
        System.out.println(Season.valueOf("AUTUMN"));
        System.out.println(Season.WINTER.name());
        System.out.println(Season.SUMMER.ordinal());
    }
}

enum Season{
    //必须在枚举类的开头声明多个对象。对象之间使用，隔开
    SPRING("春天","春暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","白雪皑皑");

    //声明当前类的对象的实例变量，使用private final修饰
    private final String seasonName;//季节的名称
    private final String seasonDesc;//季节的描述

    //私有化类的构造器
    Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }


    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}