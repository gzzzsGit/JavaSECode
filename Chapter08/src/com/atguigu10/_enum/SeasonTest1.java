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
public class SeasonTest1 {
    public static void main(String[] args) {
        Season1.SPRING.show();
    }
}

interface Info{
    void show();
}

enum Season1 implements Info{
    //必须在枚举类的开头声明多个对象。对象之间使用，隔开
    SPRING("春天","春暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","白雪皑皑");

    @Override
    public void show() {
        System.out.println("这是一个季节");
    }
    //声明当前类的对象的实例变量，使用private final修饰
    private final String seasonName;//季节的名称
    private final String seasonDesc;//季节的描述


    Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

}