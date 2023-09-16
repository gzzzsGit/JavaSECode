package com.atguigu07.encapsulation.exer3;

/**
 * className: Employee
 * Package : com.atguigu07.encapsulation.exer3
 * Description:
 *案例：普通员工类
 * （1）声明员工类Employee，
 * - 包含属性：姓名、性别、年龄、电话，属性私有化
 * - 提供get/set方法
 * - 提供String getInfo()方法
 * （2）在测试类的main中创建员工数组，并从键盘输入员工对象信息，最后遍历输出
 * @Author gzzz
 * @Create 2023/8/12 1:21
 * @Version 1.0
 */
public class Employee {
    private String name;
    private char gender;
    private int age;
    private String phoneNum;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setGender(char n){
        gender = n;
    }

    public char getGender(){
        return gender;
    }

    public void setAge(int n){
        age = n;
    }

    public int getAge(){
        return age;
    }

    public void setPhoneNum(String n){
        phoneNum = n;
    }

    public String getPhoneNum(){
        return phoneNum;
    }

    public String getInfo(){
        return "name is\t"+name+", gender is\t"+gender+", age is\t"+age+", and phone number is\t"+phoneNum;
    }
}
