package com.atguigu12.wrapper;

import java.util.Scanner;
import java.util.Vector;

/**
 * className: ScoreTest
 * Package : com.atguigu12.wrapper
 * Description:
 *利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
 * 提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度。而向量类java.util.Vector可以根据需要动态伸缩。
 * 创建Vector对象：Vector v=new Vector();
 * 给向量添加元素：v.addElement(Object obj);   //obj必须是对象
 * 取出向量中的元素：Object  obj=v.elementAt(0);
 * 注意第一个元素的下标是0，返回值是Object类型的。
 * 计算向量的长度：v.size();
 * 若与最高分相差10分内：A等；20分内：B等；30分内：C等；其它：D等
 * @Author gzzz
 * @Create 2023/8/28 2:05
 * @Version 1.0
 */
public class ScoreTest {
    public static void main(String[] args) {
        Vector v = new Vector();

        Scanner scan = new Scanner(System.in);
        int score = 0,max = 0;
        while (true){
            System.out.println("请输入学生成绩（负数代表输入完毕）： ");
            score = scan.nextInt();
            if (score<0){
                break;
            }
            if (score>max){
                max = score;
            }
            v.add(score);
        }
        System.out.println("最高分是："+max);
        Object now;
        Vector v1 = new Vector();
        for (int i = 0; i < v.size(); i++) {
            now = v.elementAt(i);
            int integer = (Integer)now;
            switch ((max-integer-1)/10){
                case 0:
                    v1.add("A");
                    break;
                case 1:
                    v1.add("B");
                    break;
                case 2:
                    v1.add("C");
                    break;
                case 3:
                    v1.add("D");
            }
        }
        scan.close();
        for (int i = 0; i <v1.size() ; i++) {
            System.out.println("学生"+i+"的评分是："+v1.elementAt(i));
        }
    }
}
