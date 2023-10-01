package com.atguigu04.compare.comparable;

import com.atguigu04.compare.Product;
import org.junit.Test;

import java.util.Arrays;

/**
 * className: Product
 * Package : com.atguigu04.compare.comparable
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/26 22:10
 * @Version 1.0
 */
public class ProductTest {
    @Test
    public void test1(){
        String[] arr = new String[]{"Tom", "Jerry", "Xiba", "Kollin"};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);//Jerry Kollin Tom Xiba
        }
    }

    @Test
    public void test2(){
        Product arr[] = new Product[4];
        arr[0] = new Product("xiaomi",2999);
        arr[1] = new Product("HUAWEI", 5000);
        arr[2] = new Product("Apple", 6000);
        arr[3] = new Product("redmi", 2999);
        //需要重写自定义类的compareTo方法
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
