package com.atguigu04._throw;

/**
 * className: ThrowTest
 * Package : com.atguigu04._throw
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/1 16:58
 * @Version 1.0
 */
public class ThrowTest {
    public static void main(String[] args) {
        try {
            Student stu = new Student();
            stu.regist(1);
            System.out.println(stu.id);
            Student s2 = new Student();
            s2.regist(-1);
            System.out.println(s2.id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Student {

    public int id;

    public void regist (int id) throws Exception{
        if (id>0){
            this.id = id;
        }
        else {
            throw new BelowZeroException("输入的数据非法");
        }
    }
}