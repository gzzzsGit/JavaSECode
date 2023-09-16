package com.atguigu10._enum.exer3;

/**
 * className: Color
 * Package : com.atguigu10._enum.exer3
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/25 2:37
 * @Version 1.0
 */
public enum Color {
    RED(255,0,0,"红色"),ORANGE(255,128,0,"橙色"),
    YELLOW(255,255, 0,"黄色"),GREEN(0,255,0,"绿色"),
    CYAN(0,255,255,"青色"), BLUE(0,0,255,"蓝色"),
    PUPLE(128,0,255,"紫色");
    final int red,green,blue;
    final String description;

    Color(int red, int green, int blue,String description) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }

    @Override
    public String toString() {
        return this.name()+"("+red+","+ green+","+blue+")"+"->"+description;
    }
}
