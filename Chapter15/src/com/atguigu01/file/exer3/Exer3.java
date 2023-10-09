package com.atguigu01.file.exer3;

import java.io.File;

/**
 * className: Exer3
 * Package : com.atguigu01.file.exer3
 * Description:
 *遍历指定文件目录下的所有文件的名称，包括子文件目录中的文件。
 * public void printFileName(File file)  //file可能是文件，也可能是文件目录
 *
 * @Author gzzz
 * @Create 2023/10/9 20:18
 * @Version 1.0
 */
public class Exer3 {
    public static void main(String[] args) {
        Exer3 exer3 = new Exer3();
        File file = new File("Chapter15");
        exer3.printFileName(file);
    }

    public void printFileName(File file) {
        if (file.isFile()) {
            System.out.println(file.getName());
        }
        else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File fl:
                 files) {
                    printFileName(fl);
            }
        }
    }
}
