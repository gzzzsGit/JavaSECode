package src.com.atguigu3.common_algorithm.exer5;

/**
 * className: ArrayExer05
 * Package : src.com.atguigu3.common_algorithm.exer5
 * Description:
 *案例：
 * 定义数组：int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
 * 如何实现数组元素的反转存储？你有几种方法。
 * @Author gzzz
 * @Create 2023/7/30 2:51
 * @Version 1.0
 */
public class ArrayExer05 {
    public static void main(String[] args) {
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        for (int i = 0,j = arr.length-1,temp ; i < j; i++,j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
