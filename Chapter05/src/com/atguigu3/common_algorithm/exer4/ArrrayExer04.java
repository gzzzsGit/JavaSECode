package src.com.atguigu3.common_algorithm.exer4;

/**
 * className: ArrrayExer04
 * Package : src.com.atguigu3.common_algorithm.exer4
 * Description:
 *使用简单数组
 * (1)创建一个名为ArrayTest的类，在main()方法中声明array1和array2两个变量，他们是int[]类型的数组。
 * (2)使用大括号{}，把array1初始化为8个素数：2,3,5,7,11,13,17,19。
 * (3)显示array1的内容。
 * (4)赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值(如array[0]=0,array[2]=2)。
 * (5)打印出array1。
 * @Author gzzz
 * @Create 2023/7/30 1:31
 * @Version 1.0
 */
public class ArrrayExer04 {
    public static void main(String[] args) {
        int[] arr1 = {2,3,5,7,11,13,17,19};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"\t");
        }
        System.out.println();
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
            if (i%2 == 0)
                arr2[i] = i;
            System.out.print(arr1[i]+"\t");
        }
        System.out.println();
        arr2 = arr1;
        for (int i = 0; i < arr2.length; i++) {
            if (i%2==0)
                arr2[i] = i;
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"\t");
        }


    }
}
