package com.atguigu01.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * className: FileTest1
 * Package : com.atguigu01.file
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/9 16:45
 * @Version 1.0
 */
public class FileTest1 {
    @Test
    public void test1(){
        //不存在的文件
        File file1 = new File("abc.txt");
        System.out.println(file1.getName());//abc.txt
        System.out.println(file1.getPath());//abc.txt
        //返回的是String
        System.out.println(file1.getAbsolutePath());//D:\code\workspace_learn\JavaSECode\Chapter15\abc.txt
        //返回的是File
        System.out.println(file1.getAbsoluteFile());//D:\code\workspace_learn\JavaSECode\Chapter15\abc.txt
        System.out.println(file1.getParent());//null
        System.out.println(file1.length());//0
        System.out.println(file1.lastModified());//0

        //如果要获取上层目录
        System.out.println(file1.getAbsoluteFile().getParent());//D:\code\workspace_learn\JavaSECode\Chapter15
    }
    
    @Test
    public void test2(){
        //存在的文件,内容：abc123
        File file1 = new File("abc.txt");
        System.out.println(file1.getName());//abc.txt
        System.out.println(file1.getPath());//abc.txt
        //返回的是String
        System.out.println(file1.getAbsolutePath());//D:\code\workspace_learn\JavaSECode\Chapter15\abc.txt
        //返回的是File
        System.out.println(file1.getAbsoluteFile());//D:\code\workspace_learn\JavaSECode\Chapter15\abc.txt
        System.out.println(file1.getParent());//null
        System.out.println(file1.length());//6
        System.out.println(file1.lastModified());//1696842253718

        //如果要获取上层目录
        System.out.println(file1.getAbsoluteFile().getParent());//D:\code\workspace_learn\JavaSECode\Chapter15
    }

    @Test
    public void test3(){
        //文件夹,里面存了非空文件
        File file1 = new File("D:\\code\\workspace_learn\\JavaSECode\\Chapter15\\ioTest");
        System.out.println(file1.getName());//ioTest
        System.out.println(file1.getPath());//D:\code\workspace_learn\JavaSECode\Chapter15\ioTest

        //返回的是String
        System.out.println(file1.getAbsolutePath());//D:\code\workspace_learn\JavaSECode\Chapter15\ioTest
        //返回的是File
        System.out.println(file1.getAbsoluteFile());//D:\code\workspace_learn\JavaSECode\Chapter15\ioTest

        System.out.println(file1.getParent());//D:\code\workspace_learn\JavaSECode\Chapter15
        //可以看到文件夹的lenth为0，而不会计算里面文件的lenth
        System.out.println(file1.length());//0
        System.out.println(file1.lastModified());//1696842912505

    }

    @Test
    public void test4(){
        //* public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
        //* public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
        File file1 = new File("D:\\code\\workspace_learn\\JavaSECode\\Chapter15");
        String[] strings = file1.list();
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]+' ');//.gitignore abc.txt Chapter15.iml ioTest src
        }

        System.out.println();

        File[] files = file1.listFiles();
        for (File file:
             files) {
            System.out.print(file.getName()+' ');//.gitignore abc.txt Chapter15.iml ioTest src
        }
    }
    
    @Test
    public void test5(){
        File file1 = new File("abc.txt");
        File file2 = new File("ioTest\\abc.txt");

        boolean renameSuccess = file1.renameTo(file2);
        System.out.println(renameSuccess?"重命名成功":"重命名失败");//重命名成功

    }

    @Test
    public void test6(){
        //存在的文件夹
        File file1 = new File("ioTest\\abc.txt");
        System.out.println(file1.exists());//true
        System.out.println(file1.isDirectory());//false
        System.out.println(file1.isFile());//true
        System.out.println(file1.canRead());//true
        System.out.println(file1.canWrite());//true
        System.out.println(file1.isHidden());//false

        System.out.println();

        //存在的文件夹
        File file2 = new File("ioTest");
        System.out.println(file2.exists());//true
        System.out.println(file2.isDirectory());//true
        System.out.println(file2.isFile());//false
        System.out.println(file2.canRead());//true
        System.out.println(file2.canWrite());//true
        System.out.println(file2.isHidden());//false

        System.out.println();
        //不存在的文件
        File file3 = new File("abc.txt");
        System.out.println(file3.exists());//false
        System.out.println(file3.isDirectory());//false
        System.out.println(file3.isFile());//false
        System.out.println(file3.canRead());//false
        System.out.println(file3.canWrite());//false
        System.out.println(file3.isHidden());//false
    }
    
    @Test
    public void test7() throws IOException {
        //测试文件的创建、删除
        File file = new File("ioTest\\abc.txt");

        if (!file.exists()) {
            boolean isSuccessed = file.createNewFile();
            if (isSuccessed) {
                System.out.println("创建成功");
            }
        } else {
            System.out.println("此文件已存在");
            System.out.println(file.delete() ? "删除成功" : "删除失败");
        }
    }
    
    @Test
    public void test8(){
        //ioTest目录存在，io1、io2目录不存在
        File file1 = new File("ioTest\\io1");
        System.out.println(file1.mkdir());//true

        File file2 = new File("ioTest\\io2");
        System.out.println(file2.mkdirs());//true
    }

    @Test
    public void test9(){
        //io1、io2是不存在的
        File file1 = new File("ioTest\\io1\\io3");
        System.out.println(file1.mkdir());//false

        File file2 = new File("ioTest\\io2\\io4");
        System.out.println(file2.mkdirs());// ture
    }

    @Test
    public void test10() {
        //删除非空的文件夹
        File file2 = new File("ioTest\\io2");
        System.out.println(file2.mkdirs());// false

        //删除空的文件夹
        File file1 = new File("ioTest\\io2\\io4");
        System.out.println(file1.delete());// true
    }
}
