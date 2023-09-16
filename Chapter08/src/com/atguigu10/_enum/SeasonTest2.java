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
public class SeasonTest2 {
    public static void main(String[] args) {
        Seanson2[] seasons = Seanson2.values();
        for (Seanson2 season : seasons) {
            season.show();
        }
    }
}

interface Info1{
    void show();
}

enum Seanson2 implements Info{
    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        @Override
        public void show() {
            System.out.println("宁静的夏天");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋意浓");
        }
    },
    WINTER("冬天","白雪皑皑"){
        @Override
        public void show() {
            System.out.println("我想大约会在下个季节");
        }
    };

    private final String seasonName;//季节的名称
    private final String seasonDesc;//季节的描述


    Seanson2(String seasonName, String seasonDesc) {
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