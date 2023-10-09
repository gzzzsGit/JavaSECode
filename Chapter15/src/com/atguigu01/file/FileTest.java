package com.atguigu01.file;

import org.junit.Test;

import java.io.File;

/**
 * className: FileTest
 * Package : com.atguigu01.file
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/9 10:27
 * @Version 1.0
 */
public class FileTest {
    public static void main(String[] args) {
        File file2 = new File("abc");
        System.out.println(file2.getAbsolutePath());//D:\code\workspace_learn\JavaSECode\abc
    }
    
    @Test
    public void test1(){
        File file1 = new File("d:/io\\hello.txt");
        File file2 = new File("abc");

        System.out.println(file1.getAbsolutePath());//d:\io\hello.txt
        System.out.println(file2.getAbsolutePath());//D:\code\workspace_learn\JavaSECode\Chapter15\abc
    }
    
    @Test
    public void test2(){
        // public File(String parent, String child)
        //parent一定是个文件目录，child可以是一个文件目录，也可以是个文件
        File file1 = new File("c:\\io", "abc.txt");
        File file2 = new File("abc", "a12");

        //public File(File parent, String child)
        File file3 = new File(file2, "abb.txt");
    }
}
