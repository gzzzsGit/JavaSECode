package src.com.atguigu1.one;

/**
 * 一维数组的基本使用(承接OneArrayTest.java)
 *
 * @author 尚硅谷-宋红康
 * @create 12:18
 */
public class OneArrayTest1 {

    public static void main(String[] args) {
        //5. 数组元素的默认初始化值
        int[] arr = new int[3];
        System.out.println(arr[0]);

        char[] arr1 = new char[3];
        System.out.println(arr1[0]);
        if (arr1[0] == 0)
            System.out.println("default char = 0");

        if (arr1[0] == '\u0000') {
            System.out.println("\u0000");
        }

        boolean[] arr2 = new boolean[3];
        System.out.println(arr2[0]);

        double[] arr3 = new double[3];
        System.out.println(arr3[0]);

        String[] arr4 = new String[5];
        System.out.println(arr4[0]);
        if (arr4[0] == null) {
            System.out.println("null");
        }

        if (arr4[0] == "null") {
            System.out.println("\"null\"");
        }

        //6. 数组的内存解析


    }
}
