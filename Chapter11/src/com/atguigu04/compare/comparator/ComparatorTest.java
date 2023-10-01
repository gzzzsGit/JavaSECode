package com.atguigu04.compare.comparator;

import com.atguigu04.compare.Product;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * className: ComparatorTest
 * Package : com.atguigu04.compare.comparator
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/27 14:02
 * @Version 1.0
 */
public class ComparatorTest {
    @Test
    public void test1(){
        //创建一个实现了comparator的实现类的对象
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Product&& o2 instanceof Product){
                    Product p1 = (Product) o1;
                    Product p2 = (Product) o2;
                    int res = Double.compare(p1.getPrice(), p2.getPrice());
                    if (res != 0){
                        return res;
                    }
                    else
                        return p1.getName().compareTo(p2.getName());
                }
                throw new RuntimeException("类型不匹配!");
            }
        };
        Product arr[] = new Product[4];
        arr[0] = new Product("xiaomi",2999);
        arr[1] = new Product("HUAWEI", 5000);
        arr[2] = new Product("Apple", 6000);
        arr[3] = new Product("redmi", 2999);
        //需要重写自定义类的compareTo方法
        Arrays.sort(arr,comparator);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
