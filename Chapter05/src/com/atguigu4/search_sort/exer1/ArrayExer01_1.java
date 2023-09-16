package src.com.atguigu4.search_sort.exer1;

/**
 * className: ArrayExer01_1
 * Package : src.com.atguigu4.search_sort.exer1
 * Description:
 *案例1：数组的扩容:
 现有数组 int[] arr = new int[]{1,2,3,4,5};
 现将数组长度扩容1倍，并将10,20,30三个数据添加到arr数组中，如何操作？
 * @Author gzzz
 * @Create 2023/7/30 2:55
 * @Version 1.0
 */
public class ArrayExer01_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] newarr = new int[arr.length<<1];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        newarr[arr.length] = 10;
        newarr[arr.length+1] = 20;
        newarr[arr.length+2] = 30;
        arr = newarr;
    }
}
