package src.com.atguigu4.search_sort.exer2;

/**
 * className: ArrayExer02
 * Package : src.com.atguigu4.search_sort.exer2
 * Description:
 *定义数组：int[] arr2 = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
 * 查找元素5是否在上述数组中出现过？如果出现，输出对应的索引值。
 * @Author gzzz
 * @Create 2023/7/30 12:43
 * @Version 1.0
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        int[] arr2 = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
        int left=0,right= arr2.length,mid;
        int target =5;
        //等号不能丢
        while (left<=right){
            mid = (left+right)/2;
            if(arr2[mid]==target){
                System.out.println("True! 对应位置为"+mid);
                break;
            }
            else if (arr2[mid]>target){
                right--;
            }
            else
                left++;
        }
        }
}
