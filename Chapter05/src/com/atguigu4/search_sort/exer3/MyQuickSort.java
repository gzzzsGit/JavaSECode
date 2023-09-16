package src.com.atguigu4.search_sort.exer3;

/**
 * className: MyQuickSort
 * Package : src.com.atguigu4.search_sort.exer3
 * Description:
 *
 * @Author gzzz
 * @Create 2023/7/30 18:20
 * @Version 1.0
 */
public class MyQuickSort {
    public static void main(String[] args) {
        int[] data = {9, -16, 30, 23, -30, -49, 25, 21, 30};
        System.out.println("排序之前：");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }

        quickSort(data);//调用实现快排的方法

        System.out.println("\n排序之后：");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
    }

    public static void quickSort(int[] data) {
        subsort(data,0,data.length-1);
    }

    public static void subsort(int[] arr,int left,int right) {
        if (left < right) {
            int base = left;
            int low = left, high = right;
            while (true) {
                //一定要带等号
                while (low < right && arr[low] <= arr[base]) {
                    low++;
                }
                while (high > left && arr[high] >= arr[base]) {
                    high--;
                }
                if (low < high) {
                    swap(arr, low, high);
                } else {
                    break;
                }
            }
            swap(arr, base, high);
            subsort(arr, left, high - 1);
            subsort(arr, high + 1, right);
        }
    }
    public static void swap(int[] arr, int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
