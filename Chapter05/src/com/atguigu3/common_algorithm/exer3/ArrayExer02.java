package src.com.atguigu3.common_algorithm.exer3;

/**
 * className: ArrayExer02
 * Package : src.com.atguigu3.common_algorithm.exer3
 * Description:
 *
 * @Author gzzz
 * @Create 2023/7/29 18:24
 * @Version 1.0
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        int[][] yanghui = new int[10][];
        for (int i = 0; i < 10; i++) {
            yanghui[i] = new int[i+1];
            yanghui[i][0] = 1;
            System.out.print(yanghui[i][0]+"\t");
            for (int j = 1; j < i; j++) {
                yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
                System.out.print(yanghui[i][j]+"\t");
            }
            yanghui[i][i] = 1;
            if (i>0)
                System.out.println(yanghui[i][i]);
            else
                System.out.println();
        }
    }
}
