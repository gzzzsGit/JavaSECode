package com.atguigu01.file.exer1;

import java.io.File;
import java.io.IOException;

/**
 * className: Exer01
 * Package : com.atguigu01.file.exer1
 * Description:
 *创建一个与hello.txt文件在相同文件目录下的另一个名为abc.txt文件
 * @Author gzzz
 * @Create 2023/10/9 19:47
 * @Version 1.0
 */
public class Exer01 {
    public static void main(String[] args)   {
        File file1 = new File("hello.txt");
        File file2 = new File(file1.getAbsoluteFile().getParent(),"abc.txt");
        System.out.println(file2.getAbsolutePath());
        try {
            boolean newFile = file1.createNewFile();
            boolean newFile1 = file2.createNewFile();
            System.out.println(newFile1);//true
            System.out.println(newFile);//true
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
