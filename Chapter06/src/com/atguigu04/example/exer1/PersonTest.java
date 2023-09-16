package com.atguigu04.example.exer1;

/**
 * className: PersonTest
 * Package : com.atguigu04.example.exer4
 * Description:
 *案例：
 *(1)创建Person类的对象，设置该对象的name、age和gender属性，
 * 调用study方法，输出字符串“studying”;
 * 调用showAge()方法，返回age值;
 * 调用addAge(int addAge)方法给对象的age属性值增加addAge岁。比如：2岁。
 * (2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
 * @Author gzzz
 * @Create 2023/8/8 23:05
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
         Person p1 = new Person();
         p1.name = "Tom";
         p1.age = 18;
         p1.gender = '男';

         p1.study();
         int info = p1.showAge();
         System.out.println(info);
         p1.addAge(2);
         info =p1.showAge();
         System.out.println(info);
    }

}
