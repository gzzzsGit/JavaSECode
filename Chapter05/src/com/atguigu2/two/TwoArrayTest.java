package src.com.atguigu2.two;

/**
 * 二维数组的基本使用（难点）
 *
 * @author 尚硅谷-宋红康
 * @create 13:08
 */
public class TwoArrayTest {
	public static void main(String[] args) {
		//1. 数组的声明与初始化
		// 静态初始化
		int[][] arr1 = new int[][]{{1,2,3},{4,5},{7,8,9,0}};

		//动态初始化1：
		String[][] arr2 = new String[3][4];

		//动态初始化2：
		double[][] arr3 = new double[2][];

		//其他正确的写法
		int arr4[][] = new int[3][4];
		int arr5[][] = {{1,2,3},{4,5},{7,8,9,0}};

		//2. 数组元素的调用
		//调用内层
		System.out.println(arr1[0][1]);
		System.out.println(arr1[1][1]);
		//调用外层
		System.out.println(arr1[2]);//[I@4eec7777

		//测试arr2、arr3
		arr2[0][1] = "Tom";
		System.out.println(arr2[0][1]);
		System.out.println(arr2[0]);//[Ljava.lang.String;@3b07d329

		arr3[0] = new double[4];
		arr3[0][0] = 1.1;
		
		//3. 数组的长度
		System.out.println(arr1.length);
		System.out.println(arr1[0].length);
		
		//4. 如何遍历数组
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}


	}
}
