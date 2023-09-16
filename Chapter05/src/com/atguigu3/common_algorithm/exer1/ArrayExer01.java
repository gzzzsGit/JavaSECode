package src.com.atguigu3.common_algorithm.exer1;

import java.util.Arrays;

/**
 * className: ArrayExer01
 * Package : src.com.atguigu3.common_algorithm.exer1
 * Description:
 *案例：定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值，最小值，总和，平均值，
 * 并输出出来。
 * 要求：所有随机数都是两位数：[10,99]
 * 提示：求[a,b]范围内的随机数： (int)(Math.random() * (b - a + 1)) + a;
 * @Author gzzz
 * @Create 2023/7/29 18:11
 * @Version 1.0
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int)(Math.random()*(99-10+1)+10);
            System.out.println(arr[i]+"\t");
        }
        System.out.println();

        //求最大值
        System.out.println(Arrays.stream(arr).max());
        //求最小值
        System.out.println(Arrays.stream(arr).min());

        //求和
        System.out.println(Arrays.stream(arr).sum());
        //求平均
        System.out.println(Arrays.stream(arr).average());
    }
}
