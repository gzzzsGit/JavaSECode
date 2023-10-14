package com.atguigu04.other.exer;

/**
 * className: Juicer
 * Package : com.atguigu04.other.exer
 * Description:
 *2、声明榨汁机(Juicer)，包含运行方法：public void run(Fruit f)，方法体中，调用f的榨汁方法squeeze()
 * @Author gzzz
 * @Create 2023/10/14 17:17
 * @Version 1.0
 */
public class Juicer {
    public void run(Fruit f) {
        f.squeeze();
    }
}
