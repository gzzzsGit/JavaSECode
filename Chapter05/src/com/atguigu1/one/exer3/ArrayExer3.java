package src.com.atguigu1.one.exer3;

import java.util.Scanner;

/**
 * className: ArrayExer3
 * Package : src.com.atguigu1.one.exer3
 * Description:
 *案例：学生考试等级划分
 * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 * 	成绩>=最高分-10    等级为’A’
 * 	成绩>=最高分-20    等级为’B’
 * 	成绩>=最高分-30    等级为’C’
 * 	其余              等级为’D’
 * @Author gzzz
 * @Create 2023/7/27 20:15
 * @Version 1.0
 */
public class ArrayExer3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num,max=0;
        System.out.println("请输入学生人数:");
        num = scan.nextInt();
        int[] array =new int[num];
        char[] score = new char[num];

        System.out.println("请输入学生成绩：");
        for (int i = 0; i <num ; i++) {
            array[i] = scan.nextInt();
            if ( array[i]>max)
                max = array[i];
        }

        System.out.println("最高分是："+max);
        for (int i = 0; i <num ; i++) {
            switch ((max-1 -array[i])/10){
                case 0:
                    score[i] = 'A';
                    break;
                case 1:
                    score[i] = 'B';
                    break;
                case 2:
                    score[i] = 'C';
                    break;
                default:
                    score[i] = 'D';
                    break;
            }
        }
        for (int i = 0; i <num ; i++) {
            System.out.println("student "+i+" sorce is "+array[i]+" grade is "+score[i]);
        }
        scan.close();
    }
}
