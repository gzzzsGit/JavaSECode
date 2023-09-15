package com.atguigu05.exer.exer3;

/**
 * className: Person
 * Package : com.atguigu05.exer.exer3
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/1 21:12
 * @Version 1.0
 */
public class Person {
    String name;
    int liveValue;

    public Person() {
    }

    public Person(String name, int liveValue) {
        setName(name);
        setLiveValue(liveValue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLiveValue() {
        return liveValue;
    }

    public void setLiveValue(int liveValue) {
        if (liveValue<0){
            throw new NoLifeValueException("生命值不能为负数："+liveValue);
        }
        this.liveValue = liveValue;
    }

}
