package src.com.atguigu1.one;

/**
 * 一维数组的基本使用
 *
 * @author 尚硅谷-宋红康
 * @create 12:08
 */
public class OneArrayTest {
	
	public static void main(String[] args) {
		//1. 数组的声明与初始化
		//1.1 声明数组
		double[] prices ;
		//1.2 初始化数组:静态初始化——数组变量和数组元素的赋值同时进行
		prices = new double[]{20.31, 30.22, 43.12 };

		//String[] foods;
		//foods = new String[]{"炒白菜","炒牛肉","炒番茄","炒鸡蛋","炒冬笋"};
		//动态初始化——数组变量和数组元素的赋值分开进行
		String[] foods = new String[4];

		//1.3 其他正确的方式
		int[] array = {1,2,3,4};//类型推断


		//2. 数组元素的调用
		System.out.println(prices[2]);
		foods[1] ="炒牛蛙";

		//3. 数组的长度
		System.out.println(foods.length);
		System.out.println(prices.length);


		//4. 如何遍历数组
		for (int i = 0; i <foods.length ; i++) {
			System.out.println(foods[i]);
		}
		for (int i = 0; i <prices.length ; i++) {
			System.out.println(prices[i]);
		}
	}

}
