package com.atguigu06.polymorphism.exer4;

/**
 * className: Exer4
 * Package : com.atguigu06.polymorphism.exer4
 * Description:
 *1）public static void meeting(Person...  ps)
 * 在该方法中，每一个人先吃饭，然后上洗手间，然后如果是男人，随后抽根烟；如果是女人，随后化个妆
 * （2）public static void main(String[] args)
 * 在主方法中，创建多个男人和女人对象，并调用meeting()方法进行测试
 * @Author gzzz
 * @Create 2023/8/16 22:46
 * @Version 1.0
 */
public class Exer4 {
    public static void main(String[] args) {

        Person p1 = new Man();
        Person p2 = new Person();
        Person p3= new Woman();
        meeting(p1,p2,p3);
    }
    public static void meeting(Person...  ps){
        for (int i = 0; i < ps.length; i++) {
            ps[i].eat();
            ps[i].toilet();
            if (ps[i] instanceof Man){
                ((Man) ps[i]).smoke();
            } else if (ps[i] instanceof Woman) {
                ((Woman) ps[i]).makeup();
            }
        }
    }
}
