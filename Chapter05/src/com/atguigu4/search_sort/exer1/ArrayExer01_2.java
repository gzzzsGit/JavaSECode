package src.com.atguigu4.search_sort.exer1;

/**
 * className: ArrayExer01_2
 * Package : src.com.atguigu4.search_sort.exer1
 * Description:
 *案例：数组的缩容：
 * 现有数组 int[] arr={1,2,3,4,5,6,7}。现需删除数组中索引为4的元素。
 * @Author gzzz
 * @Create 2023/7/30 2:59
 * @Version 1.0
 */
public class ArrayExer01_2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int[] newarr = new int[arr.length-1];
        for (int i = 0; i < 4; i++) {
            newarr[i]=arr[i];
        }
        for (int i = 4; i < arr.length-1; i++) {
            newarr[i] = arr[i+1];
        }
        arr = newarr;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
