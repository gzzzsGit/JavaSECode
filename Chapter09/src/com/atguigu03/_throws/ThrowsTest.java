package com.atguigu03._throws;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 尚硅谷-宋红康
 * @create 15:24
 */
public class ThrowsTest {

    public static void main(String[] args) {
        method3();
    }

    public static void method3(){
        try {
            method2();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void method2()throws ClassNotFoundException,IOException {
        method1();
    }

    public static void method1() throws FileNotFoundException,IOException {
        File file = new File("Chapter09/src/com/atguigu03/_throws/04-异常处理的方式2.txt");//当前路径是项目名称文件
        FileInputStream fls = new FileInputStream(file);//FileNotFoundException
        int data = fls.read();//IOException
        while (data != -1){
            System.out.println((char)data);
            data = fls.read();//IOException
        }
        fls.close();//IOException
        System.out.println("读取数据结束");
    }


}
