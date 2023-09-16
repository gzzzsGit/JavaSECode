package src.com.atguigu2.two;

/*
 * 二维数组的基本使用（难点） （承接TwoArrayTest.java）
 * 
 *  @author 尚硅谷-宋红康
 *  @create 13:18
 * 
 */

public class TwoArrayTest1 {
	public static void main(String[] args) {

		int[][] arr = new int[3][2];
		boolean[][] arr1 = new boolean[3][4];
		String[][] arr2 = new String[3][2];
		int[][] arr3 = new int[3][];
		//5. 数组元素的默认初始化值
		System.out.println(arr[1]);//[I@4eec7777
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);//0


		System.out.println(arr1[1]);//[Z@41629346
		System.out.println(arr1[0][0]);//false


		System.out.println(arr2[0]);//[Ljava.lang.String;@404b9385
		System.out.println(arr2[0][1]);//null


		System.out.println(arr3[0]);//null
		System.out.println(arr3[0][0]);//报错
		//6. 数组的内存解析


	}
}
