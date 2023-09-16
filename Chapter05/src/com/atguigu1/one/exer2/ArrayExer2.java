package src.com.atguigu1.one.exer2;

import java.util.Scanner;

/**
 * className: ArrayExer2
 * Package : src.com.atguigu1.one.exer2
 * Description:
 *用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
 * {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}
 * @Author gzzz
 * @Create 2023/7/27 18:03
 * @Version 1.0
 */
public class ArrayExer2 {
    public static void main(String[] args) {
        String[] weeks = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner scan = new Scanner(System.in);
        int choose;
        while(true){
            System.out.println("请输入一个数字（1-7）：");
            choose = scan.nextInt();
            if (choose == 0)
                break;
            else if (choose>7 ||choose<0){
                System.out.println("请重新输入");
                continue;
            }
            System.out.println(weeks[choose-1]);
        }
        scan.close();
    }
}
