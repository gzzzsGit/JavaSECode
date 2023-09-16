package com.atguigu03._extends.exer1;

/**
 * className: Kids
 * Package : com.atguigu03._extends.exer1
 * Description:
 *(2)定义类Kids继承ManKind，并包括
 * - 成员变量int yearsOld；
 * - 方法printAge()打印yearsOld的值。
 * @Author gzzz
 * @Create 2023/8/14 22:07
 * @Version 1.0
 */
public class Kids extends ManKind{
    private int yearsOld;

    public Kids(int yearsOld,int sex,int salary) {
        super(sex,salary);
        this.yearsOld = yearsOld;
    }


    public void printAge(){
        System.out.println(yearsOld);
    }


    @Override
    public void employeed() {
        System.out.println("Kids should study and no job");
    }
}
