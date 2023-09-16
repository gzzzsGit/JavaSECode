package src.com.atguigu5.arrays;

import java.util.Arrays;

/**
 * 
 * 测试数组的工具类：Arrays的使用 （了解）
 *
 * @author 尚硅谷-宋红康
 * @create 13:20
 */
public class ArraysTest {
	public static void main(String[] args) {
		//1. boolean equals(int[] a,int[] b)：比较两个数组的元素是否依次相等
		int[] arr1 = new int[]{1,2,3,4,5};
		int[] arr2 = new int[]{1,2,3,4,5};
		int[] arr3 = new int[]{1,2,3,5,4};

		System.out.println(arr1 == arr2);//false
		System.out.println(Arrays.equals(arr1,arr2));//true
		System.out.println(arr1.equals(arr2));//false
		System.out.println(Arrays.equals(arr1,arr3));//false
		//2. String toString(int[] a):输出数组元素信息。
		System.out.println(arr1);//[I@4eec7777
		System.out.println(Arrays.toString(arr1));//[1, 2, 3, 4, 5]


		//3.void fill(int[] a,int val):将指定值填充到数组之中。
		Arrays.fill(arr1,6);
		System.out.println(Arrays.toString(arr1));//[6, 6, 6, 6, 6]
		//4. void sort(int[] a):使用快速排序算法实现的排序
		int[] arr4 = {1,5,63,3,4,2,8,10,65};
		Arrays.sort(arr4);
		System.out.println(Arrays.toString(arr4));//[1, 2, 3, 4, 5, 8, 10, 63, 65]

		//5. int binarySearch(int[] a,int key):二分查找
		//使用前提：当前数组必须是有序的
		int index = Arrays.binarySearch(arr4,5);
		System.out.println(index);


	}
}
